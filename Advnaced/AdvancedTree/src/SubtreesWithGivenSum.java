public class SubtreesWithGivenSum {


    static int count = 0;


    static int subTreesWithSum(Node root, int x) {
        if (root == null) {
            return 0;
        }

        int leftSum = sumOfTree(root.left);
        int rightSum = sumOfTree(root.right);

        int current = root.data + leftSum + rightSum;
        if (current == x) {
            count++;
        }
        subTreesWithSum(root.right, x);
        subTreesWithSum(root.left, x);

        return count;
    }


    static int sumOfTree(Node root) {

        if (root == null) {
            return 0;
        }

        return root.data + sumOfTree(root.left) + sumOfTree(root.right);
    }
}
