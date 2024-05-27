public class GcdQ {
    public static int findRangeGcd(int l, int r, int st[], int n) {

        return gcdRec(l, r, 0, n - 1, 0, st);
    }


    public static int gcdRec(int qs, int qe, int ss, int se, int i, int[] st) {

        if (qs <= ss && qe >= se) {
            return st[i];
        }
        if (qs > se || qe < ss) {
            return 0;
        }

        int mid = getMid(ss, se);


        int left = gcdRec(qs, qe, ss, mid, 2 * i + 1, st);

        int right = gcdRec(qs, qe, mid + 1, se, 2 * i + 2, st);
        return gcd(left, right);

    }


    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void updateValue(int index, int newVal, int arr[], int st[], int n) {

        int diff = newVal - arr[index];
        arr[index] = newVal;
        updateRec(0, n - 1, index, 0, diff, st);
    }

    static int getMid(int left, int right) {
        return left + (right - left) / 2;

    }

    static void updateRec(int ss, int se, int i, int si, int diff, int[] st) {
        if (i < ss || i > se) {
            return;
        }

        st[si] = st[si] + diff;

        if (se > ss) {
            int mid = getMid(ss, se);
            updateRec(ss, mid, i, 2 * si + 1, diff, st);
            updateRec(mid + 1, se, i, 2 * si + 2, diff, st);

        }
    }
}
