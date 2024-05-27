public class Search {


    static boolean search(Node  root, int data) {

        if (root == null) {
            return false;
        } else if (root.data == data) {
            return true;
        } else if (data > root.data) {
            return search(root.right, data);
        } else {
            return search(root.left, data);
        }
    }

    static boolean searchIterative(Node root, int data) {

        while (root != null) {
            if (root.data == data) {
                return true;
            } else if (data > root.data) {
                root = root.right;
            } else {
                root = root.left;
            }
        }
        return false;
    }


}
