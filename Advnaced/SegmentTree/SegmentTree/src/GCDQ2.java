public class GCDQ2 {
    private static int gcd(int a, int b) {
        if (a < b) {
            int temp = b;
            b = a;
            a = temp;
        }

        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    public static int findGcd(int ss, int se, int qs, int qe, int si, int st[]) {
        if (ss > qe || se < qs)
            return 0;

        if (qs <= ss && qe >= se)
            return st[si];

        int mid = ss + (se - ss) / 2;
        return gcd(findGcd(ss, mid, qs, qe, si * 2 + 1, st),
                findGcd(mid + 1, se, qs, qe, si * 2 + 2, st));
    }

    public static int findRangeGcd(int ss, int se, int st[], int n) {
        if (ss < 0 || se > n - 1 || ss > se)
            throw new IllegalArgumentException("Invalid arguments");

        return findGcd(0, n - 1, ss, se, 0, st);
    }

    public static void updateValueUtil(int ss, int se, int index,
                                       int new_val, int si, int st[]) {
        //base cases
        if (index < ss || index > se)
            return;
        if (se == ss) {
            st[si] = new_val;
            return;
        }

        int mid = ss + (se - ss) / 2;
        if (index <= mid)
            updateValueUtil(ss, mid, index, new_val, 2 * si + 1, st);
        else
            updateValueUtil(mid + 1, se, index, new_val, 2 * si + 2, st);

        st[si] = gcd(st[si * 2 + 1], st[si * 2 + 2]);
    }


    public static void updateValue(int index, int new_val, int arr[], int st[], int n) {
        if (index < 0 || index > n - 1) {
            return;
        }
        arr[index] = new_val;

        updateValueUtil(0, n - 1, index, new_val, 0, st);
    }
}
