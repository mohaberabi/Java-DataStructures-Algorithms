public class ConvertBinaryTreeToDoubleLinkedList {

    private Node prev = null;


    Node toDbll(Node root) {
        if (root == null) {
            return root;
        }

        Node head = toDbll(root.left);
        if (prev == null) {
            head = root;
        } else {
            root.left = prev;
            prev.right = root;
        }
        prev = root;

        toDbll(root.right);
        return head;
    }
}
