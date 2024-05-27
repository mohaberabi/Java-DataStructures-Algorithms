import java.util.LinkedList;
import java.util.Queue;

public class LeftViewOfBinaryTree {


    private int maxLevel = 0;

    private void printLeft(Node root, int level) {
        if (root == null) {
            return;
        }

        if (maxLevel < level) {
            System.out.println(root.data);
            maxLevel = level;
        }

        printLeft(root.left, level + 1);
        printLeft(root.right, level + 1);
    }

    void leftView(Node root) {
        printLeft(root, 1);
    }

    void lefViewIterative(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int count = q.size();
            for (int i = 0; i < count; i++) {
                Node curr = q.poll();
                if (i == 0) {
                    System.out.println(curr.data);
                }
                if (curr.left != null) {
                    q.add(curr.left);
                }
                if (curr.right != null) {
                    q.add(curr.right);
                }
            }
        }
    }

}
