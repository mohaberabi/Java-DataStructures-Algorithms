public class RopeCuts {


    int maximumCutsDp(int n, int a, int b, int c) {

        int[] dp = new int[n + 1];
        dp[0] = 0;

        for (int i = 1; i <= n; i++) {
            dp[i] = -1;
            if (i - a >= 0) {
                dp[i] = Math.max(dp[i], dp[i - a]);
            }
            if (i - b >= 0) {
                dp[i] = Math.max(dp[i], dp[i - b]);
            }
            if (i - c >= 0) {
                dp[i] = Math.max(dp[i], dp[i - c]);
            }
            if (dp[i] != -1) {
                dp[i]++;
            }
        }
        return dp[n];
    }

    int maximumCuts(int n, int a, int b, int c) {
        if (n == 0) {
            return 0;
        }
        if (n < 0) {
            return -1;
        }


        int res = Math.max(maximumCuts(n - a, a, b, c), Math.max(maximumCuts(n - b, a, b, c), maximumCuts(n - c, a, b, c)));

        if (res == -1) {
            return res;
        } else {
            return res + 1;
        }

    }
}
