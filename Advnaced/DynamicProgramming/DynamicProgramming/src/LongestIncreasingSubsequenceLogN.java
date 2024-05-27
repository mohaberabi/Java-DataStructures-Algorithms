public class LongestIncreasingSubsequenceLogN {


    static int ceilIdx(int[] tail, int b, int e, int x) {
        while (b < e) {
            int m = (b + e) / 2;
            if (tail[m] >= x) {
                e = m;
            } else {
                b = m + 1;
            }
        }
        return e;
    }


    static int lcsLogN(int[] arr, int n) {
        int[] tail = new int[n];
        int len = 1;
        tail[0] = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > tail[len - 1]) {

                tail[len] = arr[i];
                len++;
            } else {
                int c = ceilIdx(tail, 0, len - 1, arr[i]);
                tail[c] = arr[i];
            }
        }
        return len;
    }

    public static void main(String[] args) {
        int[] arr = {3, 10, 20, 4, 6, 7};
        int ans = lcsLogN(arr, arr.length);
        System.out.println(ans);
    }
}
