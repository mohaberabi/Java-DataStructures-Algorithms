public class Delete {

    static Node delete(Node  root, int x) {
        if (root == null) {
            return null;
        }
        if (root.data > x) {
            root.left = delete(root.left, x);
        } else if (root.data < x) {
            root.right = delete(root.right, x);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            } else {
                Node succ = getSucessor(root);
                root.data = succ.data;
                root.right = delete(root.right, succ.data);
            }
        }
        return root;
    }
    static private Node getSucessor(Node root) {
        Node curr = root.right;
        while (curr != null && curr.left != null) {
            curr = curr.left;
        }
        return curr;

    }

}
