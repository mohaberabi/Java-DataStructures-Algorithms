public class NCR {

    public static long ncr(int n, int r) {
        if (r < 0 || r > n) {
            return 0;
        }

        if (r > n / 2) {
            r = n - r;
        }

        long result = 1;
        for (int i = 1; i <= r; i++) {
            result = result * (n - i + 1) / i;
        }

        return result;
    }

    long ncrDp(int n, int r) {
        if (r < 0 || r > n) {
            return 0;
        }
        long[][] dp = new long[n + 1][r + 1];
        for (int i = 0; i <= n; i++) {
            dp[i][0] = 1;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= Math.min(i, r); j++) {
                dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
            }
        }

        return dp[n][r];
    }

    public static void main(String[] args) {
        long res = ncr(4, 2);
        System.out.println(res);
    }
}
