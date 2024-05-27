public class Insert {
    static Node  insertRecursive(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }
        if (data > root.data) {
            root.right = insertRecursive(root.right, data);
        } else if (data < root.data) {
            root.left = insertRecursive(root.left, data);
        }
        return root;
    }

    static Node insertIterative(Node root, int data) {
        Node insert = new Node(data);
        Node parent = null;
        Node curr = root;

        while (curr != null) {
            parent = curr;
            if (curr.data > data) {
                curr = curr.left;
            } else if (curr.data < data) {
                curr = curr.right;
            } else {
                return root;
            }
        }
        if (parent == null) {
            return insert;
        }
        if (data > parent.data) {
            parent.right = insert;
        } else {
            parent.left = insert;
        }
        return root;
    }



}
