import java.util.Arrays;
import java.util.Collections;

public class LongestSumContiguesSubArrayQuery {
    static class Node {
        public int sum, prefixSum, suffixSum, maxSubArraySum;

        public Node() {
            sum = prefixSum = suffixSum = maxSubArraySum = Integer.MIN_VALUE;
        }
    }

    public static void updateUtil(int arr[], Node tree[], int index, int low, int high, int idx, int value) {
        if (low == high) {
            tree[index].sum = value;
            tree[index].prefixSum = value;
            tree[index].suffixSum = value;
            tree[index].maxSubArraySum = value;
        } else {
            int mid = (low + high) / 2;
            if (idx <= mid)
                updateUtil(arr, tree, 2 * index + 1, low, mid, idx, value);
            else
                updateUtil(arr, tree, 2 * index + 2, mid + 1, high, idx, value);

            tree[index].sum = tree[2 * index + 1].sum + tree[2 * index + 2].sum;
            tree[index].prefixSum =
                    Math.max(tree[2 * index + 1].prefixSum,
                            tree[2 * index + 1].sum + tree[2 * index + 2].prefixSum);
            tree[index].suffixSum =
                    Math.max(tree[2 * index + 2].suffixSum,
                            tree[2 * index + 2].sum + tree[2 * index + 1].suffixSum);

            Integer temp[] = new Integer[]{tree[index].prefixSum, tree[index].suffixSum,
                    tree[2 * index + 1].maxSubArraySum,
                    tree[2 * index + 2].maxSubArraySum,
                    tree[2 * index + 1].suffixSum + tree[2 * index + 2].prefixSum};

            tree[index].maxSubArraySum = Collections.max(Arrays.asList(temp));
        }
    }

    public static Node queryUtil(int arr[], Node tree[], int index, int low, int high, int l, int r) {
        Node result = new Node();
        if (r < low || high < l) return result;
        if (l <= low && high <= r) return tree[index];
        int mid = (low + high) / 2;
        if (l > mid)
            return queryUtil(arr, tree, 2 * index + 2, mid + 1, high, l, r);
        if (r <= mid) return queryUtil(arr, tree, 2 * index + 1, low, mid, l, r);

        Node left = queryUtil(arr, tree, 2 * index + 1, low, mid, l, r);
        Node right = queryUtil(arr, tree, 2 * index + 2, mid + 1, high, l, r);
        result.sum = left.sum + right.sum;
        result.prefixSum = Math.max(left.prefixSum, left.sum + right.prefixSum);
        result.suffixSum = Math.max(right.suffixSum, right.sum + left.suffixSum);
        Integer temp[] = new Integer[]{result.prefixSum, result.suffixSum, left.maxSubArraySum,
                right.maxSubArraySum, left.suffixSum + right.prefixSum};
        result.maxSubArraySum = Collections.max(Arrays.asList(temp));
        return result;
    }

    public static void update(int arr[], Node tree[], int n, int index, int new_value) {
        // code here
        arr[index - 1] = new_value;
        updateUtil(arr, tree, 0, 0, n - 1, index - 1, new_value);
    }
}
//        if (i < ss || i > se)
//            return;
//        if (se == ss) {
//
//            int leftTotal = st[2 * si + 1].sum;
//            int rightTotal = st[2 * si + 2].sum;
//
//            int leftPrefix = st[2 * si + 1].prefixSum;
//            int rightPrefix = st[2 * si + 2].prefixSum;
//            int leftSuffix = st[2 * si + 1].suffixSum;
//            int rightSuffix = st[2 * si + 2].suffixSum;
//
//            int leftMax = st[2 * si + 1].maxSubArraySum;
//            int rightMax = st[2 * si + 2].maxSubArraySum;
//            st[si].sum = leftTotal + rightTotal;
//
//            st[si].prefixSum = Math.max(leftPrefix, leftTotal + rightPrefix);
//
//
//            st[si].suffixSum = Math.max(leftSuffix + rightTotal, rightSuffix);
//            st[si].maxSubArraySum = Math.max(leftMax, Math.max(rightMax, Math.max(st[si].prefixSum, Math.max(st[si].suffixSum, leftSuffix + rightPrefix))));
//
//            return;
//        }
//
//        int mid = (ss + se) / 2;
//        if (i <= mid)
//            upateRec();
//        else
//            updateValueUtil(st, mid + 1, se, index, new_val, 2 * si + 2);
//
//        st[si] = lcm(st[si * 2 + 1], st[si * 2 + 2]);
//        return;
