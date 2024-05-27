public class Floor {


    static Node  floor(Node root, int x) {
        Node curr = null;
        while (root != null) {
            if (root.data == x) {
                return root;
            } else if (root.data > x) {
                root = root.left;
            } else {
                curr = root;
                root = root.right;
            }
        }
        return curr;

    }

}
