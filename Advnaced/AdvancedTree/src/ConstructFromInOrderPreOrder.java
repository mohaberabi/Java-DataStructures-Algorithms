public class ConstructFromInOrderPreOrder {


    int preIndex = 0;

    Node tree(int[] in, int[] pre, int start, int end) {
        Node root = new Node(pre[preIndex++]);


        int inIndex = -1;
        for (int i = start; i < end; i++) {
            if (in[i] == root.data) {
                inIndex = i;
                break;
            }
        }
        root.left = tree(in, pre, start, inIndex - 1);
        root.right = tree(in, pre, inIndex + 1, end);
        return root;

    }
}
