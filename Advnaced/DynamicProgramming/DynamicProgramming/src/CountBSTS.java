public class CountBSTS {


    static int countBsts(int n) {
        long[] dp = new long[n + 1];
        long mod = (long) (1e9) + 7;
        dp[0] = 1;
        for (int i = 1; i <= n; i++) {
            dp[i] = 0;
            for (int j = 0; j < i; j++) {
                dp[i] = (dp[i] + (dp[j] * dp[i - j - 1]) % mod) % mod;
            }
        }
        return (int) dp[n];
    }


    static int nThCatalanNumber(int n) {
        long[] dp = new long[n + 1];
        long mod = (long) (1e9) + 7;
        dp[0] = 1;
        for (int i = 1; i <= n; i++) {
            dp[i] = 0;
            for (int j = 0; j < i; j++) {
                dp[i] = (dp[i] + (dp[j] * dp[i - j - 1]) % mod) % mod;
            }
        }
        return (int) dp[n];
    }


    public static void main(String[] args) {
        int res = nThCatalanNumber(4);
        System.out.println(res);
    }
}
