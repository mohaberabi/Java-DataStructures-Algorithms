public class Ceil {


    static Node ceil(Node root, int x) {
        Node ans = null;
        while (root != null) {
            if (root.data == x) {
                return root;
            } else if (root.data < x) {
                root = root.right;
            } else {
                ans = root;
                root = root.left;
            }
        }
        return ans;
    }

}
