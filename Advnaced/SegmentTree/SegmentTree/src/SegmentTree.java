public class SegmentTree {
    private final int n;
    private final int[] tree;
    private final int[] arr;


    public SegmentTree(int[] arr) {
        this.n = arr.length;
        this.arr = arr;
        this.tree = new int[arr.length * 4];
        constructSegmentTree();
    }

    private void constructSegmentTree() {


        constructSegmentRec(0, n - 1, 0);
    }


    private int constructSegmentRec(int ss, int se, int si) {


        if (ss == se) {
            tree[si] = arr[ss];
            return arr[ss];
        }

        int mid = (ss + se) / 2;
        tree[si] = constructSegmentRec(ss, mid, 2 * si + 1) +
                constructSegmentRec(mid + 1, se, 2 * si + 2);


        return tree[si];
    }


    int getSum(int s, int e) {
        return getSumRec(s, e, 0, n - 1, 0);
    }

    private int getSumRec(int qs, int qe, int ss, int se, int si) {


        if (se < qs || ss > qe) {
            return 0;
        }
        if (qs <= ss && qe >= se) {
            return tree[si];
        }
        int mid = (ss + se) / 2;

        return getSumRec(qs, qe, ss, mid, si * 2 + 1) +
                getSumRec(qs, qe, mid + 1, se, si * 2 + 2);
    }


    void update(int i, int val) {
        int diff = val - arr[i];
        updateRec(0, n - 1, i, 0, diff);
    }

    private void updateRec(int ss, int se, int i, int si, int diff) {
        if (i < ss || i > se) {
            return;
        }

        tree[si] = tree[si] + diff;
        if (se > ss) {
            int mid = (ss + se) / 2;
            updateRec(ss, mid, i, 2 * si + 1, diff);
            updateRec(mid + 1, se, i, 2 * si + 2, diff);
        }
    }

    int getMin(int s, int e) {
        if (s < 0 || e > n - 1 || s > e) {
            return -1;
        }
        return getMinRec(s, e, 0, n - 1, 0);
    }

    private int getMinRec(int qs, int qe, int ss, int se, int si) {


        if (qs <= ss && qe >= se) {
            return tree[si];
        }
        if (se < qs || ss > qe)
            return Integer.MAX_VALUE;
        int mid = (ss + se) / 2;
        return Math.min(getMinRec(qs, qe, ss, mid, 2 * si + 1),
                getMinRec(qs, qe, mid + 1, se, 2 * si + 2));

    }


//    int getMax(int s, int e) {
//        if (s < 0 || e > n - 1 || s > e) {
//            return -1;
//        }
//        return getMaxRec(s, e, 0, n - 1, 0);
//    }
//
//    private int getMaxRec(int qs, int qe, int ss, int se, int si) {
//
//
//        if (qs <= ss && qe >= se) {
//            return tree[si];
//        }
//        if (se < qs || ss > qe) {
//            return Integer.MIN_VALUE;
//
//        }
//        int mid = getMid(ss, se);
//        return Math.max(getMaxRec(qs, qe, ss, mid, 2 * si + 1),
//                getMaxRec(qs, qe, mid + 1, se, 2 * si + 2));
//
//    }


}
