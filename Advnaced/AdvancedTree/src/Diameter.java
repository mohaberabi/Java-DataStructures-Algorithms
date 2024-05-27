public class Diameter {


    int height(Node root) {
        if (root == null) {
            return 0;
        } else {
            return 1 + (Math.max(height(root.left), height(root.right)));
        }
    }


    int diameter(Node root) {
        if (root == null) {
            return 0;
        }

        int d1 = 1 + height(root.left) + height(root.right);
        int d2 = diameter(root.left);
        int d3 = diameter(root.right);
        return Math.max(d1, Math.max(d2, d3));
    }

    private int diameter = 0;

    int getHeightAndSetDiameter(Node root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = getHeightAndSetDiameter(root.left);
        int rightHeight = getHeightAndSetDiameter(root.right);

        diameter = Math.max(diameter, 1 + leftHeight + rightHeight);

        return 1 + Math.max(leftHeight, rightHeight);
    }

    int getDiameterOptimal() {
        return diameter;
    }
}
