import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderLineByLine {


    void lineByLine(Node root) {

        if (root == null) {
            return;
        }


        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);


        while (q.size() > 1) {
            Node curr = q.poll();

            if (curr == null) {

                System.out.println();
                q.add(null);
                continue;
            }
            System.out.println(curr.data);
            if (curr.left != null) {
                q.add(curr.left);
            }
            if (curr.right != null) {
                q.add(curr.right);
            }
        }
    }


    void lineByLine2(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int count = q.size();
            for (int i = 0; i < count; i++) {
                Node curr = q.poll();

                System.out.println(curr.data);
                if (curr.left != null) {
                    q.add(curr
                            .left);
                }
                if (curr.right != null) {
                    q.add(curr.right);
                }
                ArrayList<ArrayList> al = new ArrayList();
                al.get(0).add(1);
            }
            System.out.println();
        }
    }
}
