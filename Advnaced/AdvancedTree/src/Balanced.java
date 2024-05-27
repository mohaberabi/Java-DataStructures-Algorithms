public class Balanced {


    boolean isBalancedNaive(Node root) {
        if (root == null) {
            return true;
        }
        int left = height(root.left);
        int right = height(root.right);
        return Math.abs(left - right) <= 1 &&
                isBalancedNaive(root.left) && isBalancedNaive(root.right);

    }


    int height(Node root) {
        if (root == null) {
            return 0;
        }

        return Math.max(height(root.left), height(root.right)) + 1;
    }


    int isBalancedOptimal(Node root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = isBalancedOptimal(root.left);
        if (leftHeight == -1) {
            return -1;
        }
        int rightHeight = isBalancedOptimal(root.right);
        if (rightHeight == -1) {
            return -1;
        }
        if (Math.abs(rightHeight - leftHeight) > 1) {
            return -1;
        }
        return Math.max(rightHeight, leftHeight) + 1;
    }
}
