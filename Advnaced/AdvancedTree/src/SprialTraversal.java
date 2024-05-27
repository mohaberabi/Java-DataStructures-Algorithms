import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class SprialTraversal {


    void spiralTraversal1(Node root) {


        if (root == null) {
            return;
        }

        Queue<Node> q = new LinkedList<>();
        Stack<Integer> s = new Stack<>();
        boolean reverse = false;

        q.add(root);

        while (!q.isEmpty()) {

            int count = q.size();
            for (int i = 0; i < count; i++) {
                Node curr = q.poll();
                if (reverse) {
                    s.push(curr.data);
                } else {
                    System.out.println(curr.data);
                }

                if (curr.left != null) {
                    q.add(curr.left);
                }
                if (curr.right != null) {
                    q.add(curr.right);
                }
            }

            if (reverse) {
                while (!s.isEmpty()) {
                    System.out.println(s.pop());
                }
            }
            reverse = !reverse;
            System.out.println();
        }
    }


    void sprialTraversal2(Node root) {
        if (root == null) {
            return;
        }
        Stack<Node> s1 = new Stack<>();
        Stack<Node> s2 = new Stack<>();

        s1.push(root);
        while (!s1.isEmpty() || !s2.isEmpty()) {

            while (!s1.isEmpty()) {
                Node popped = s1.pop();
                System.out.println(popped.data);
                if (popped.left != null) {
                    s2.push(popped.left);
                }
                if (popped.right != null) {
                    s2.push(popped.right);
                }
            }
            while (!s2.isEmpty()) {
                Node popped = s2.pop();
                System.out.println(popped.data);
                if (popped.right != null) {
                    s1.push(popped.right);
                }
                if (popped.left != null) {
                    s1.push(popped.left);
                }

            }
        }


    }

}
