public class CountNodesInBinaryTree {


    int countNodesNaive(Node root) {
        if (root == null) {
            return 0;
        }
        return 1 + countNodesNaive(root.left) + countNodesNaive(root.right);
    }

    int countNodesCompleteBiTree(Node root) {


        int left = 0;
        int right = 0;
        Node curr = root;

        while (curr != null) {
            left++;
            curr = curr.left;
        }
        curr = root;
        while (curr != null) {
            right++;
            curr = curr.right;
        }


        if (left == right) {
            return (int) Math.pow(2, left) - 1;
        } else {
            return 1 + countNodesCompleteBiTree(root.left) + countNodesCompleteBiTree(root.right);
        }
    }

    int height(Node root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(height(root.left), height(root.right));
    }
}
