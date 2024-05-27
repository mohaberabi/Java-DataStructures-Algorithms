public class LcmQ {


    static int getMid(int left, int right) {
        return left + (right - left) / 2;
    }

    public static void updateValueUtil(long st[], int ss, int se, int index, long new_val, int si) {
        if (index < ss || index > se)
            return;
        if (se == ss) {
            st[si] = new_val;
            return;
        }


        int mid = getMid(ss, se);
        if (index <= mid)
            updateValueUtil(st, ss, mid, index, new_val, 2 * si + 1);
        else
            updateValueUtil(st, mid + 1, se, index, new_val, 2 * si + 2);

        st[si] = lcm(st[si * 2 + 1], st[si * 2 + 2]);
        return;
    }

    public static void updateValue(long arr[], long st[], int n, int index, long new_val) {
        if (index < 0 || index > n - 1) {

            return;
        }
        arr[index] = new_val;

        updateValueUtil(st, 0, n - 1, index, new_val, 0);
    }

    public static long getLCMUtil(long st[], int ss, int se, int qs, int qe, int si) {
        if (qs <= ss && qe >= se)
            return st[si];

        if (se < qs || ss > qe)
            return 1;


        int mid = getMid(ss, se);
        return lcm(getLCMUtil(st, ss, mid, qs, qe, 2 * si + 1),
                getLCMUtil(st, mid + 1, se, qs, qe, 2 * si + 2));

    }

    public static long getLCM(long st[], long arr[], int n, int qs, int qe) {


        return getLCMUtil(st, 0, n - 1, qs, qe, 0);
    }

    public static long lcm(long num1, long num2) {
        long gcd = calculateGCD(num1, num2);
        long product = num1 * num2;
        return product / gcd;
    }

    public static long calculateGCD(long a, long b) {
        if (b == 0) {
            return a;
        } else {
            return calculateGCD(b, a % b);
        }
    }

}
