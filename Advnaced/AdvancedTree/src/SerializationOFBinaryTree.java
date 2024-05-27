import java.util.ArrayList;

public class SerializationOFBinaryTree {


    static final int empty = -1;


    void serilize(Node root, ArrayList<Integer> arr) {

        if (root == null) {
            arr.add(empty);
            return;
        }
        arr.add(root.data);
        serilize(root.left, arr);
        serilize(root.right, arr);

    }


    int index = 0;

    Node deserilize(ArrayList<Integer> arr) {
        if (index == arr.size()) {
            return null;
        }
        int val = arr.get(index);
        index++;
        if (val == empty) {
            return null;
        }
        Node root = new Node(val);
        root.left = deserilize(arr);
        root.right = deserilize(arr);

        return root;
    }
}
