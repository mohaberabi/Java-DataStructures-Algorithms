public class BurnFromLeaf {


    int res = 0;

    private class Distance {
        int d;

        public Distance(int x) {
            d = x;
        }

    }


    int burntime(Node root, int leaf, Distance dist) {
        if (root == null) {
            return 0;
        }
        if (root.data == leaf) {
            dist.d = 0;
            return 1;
        }
        Distance leftDistance = new Distance(-1);
        Distance rightDistance = new Distance(-1);
        int leftHeight = burntime(root.left, leaf, leftDistance);
        int rightHieght = burntime(root.right, leaf, rightDistance);
        if (leftDistance.d != -1) {
            dist.d = leftDistance.d + 1;
            res = Math.max(res, rightHieght + dist.d);
        } else if (rightDistance.d != -1) {
            dist.d = rightDistance.d + 1;
            res = Math.max(res, leftHeight + dist.d);
        }
        return Math.max(leaf, rightHieght) + 1;
    }
}
