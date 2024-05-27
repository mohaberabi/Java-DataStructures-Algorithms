import java.util.Stack;

public class Traversal {


    void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            System.out.println(root.data);
            inOrder(root.right);
        }
    }

    void inOrderIterative(Node root) {
        Stack<Node> s = new Stack<>();
        Node curr = root;
        while (curr != null || !s.isEmpty()) {
            while (curr != null) {
                s.push(curr);
                curr = curr.left;
            }
            curr = s.pop();
            System.out.println(curr.data);
            curr = curr.right;
        }
    }
}
