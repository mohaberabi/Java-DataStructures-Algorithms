public class ZeroOneKnapSack {

    int knapSack(int w, int weights[], int val[], int n) {
        if (n == 0 || w == 0) {
            return 0;
        }

        if (weights[n - 1] > w) {
            return knapSack(w, weights, val, n - 1);
        } else {
            return Math.max(knapSack(w, weights, val, n - 1), val[n - 1] + knapSack(w - weights[n - 1], weights, val, n - 1));
        }
    }

    static int knapSackDp(int W, int[] weights, int[] vals, int n) {
        int[][] dp = new int[n + 1][W + 1];
        for (int i = 0; i <= W; i++) {
            dp[0][i] = 0;
        }

        for (int i = 0; i <= n; i++) {
            dp[i][0] = 0;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= W; j++) {
                if (weights[i - 1] > j) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = Math.max(vals[i - 1] + dp[i - 1][j - weights[i - 1]], dp[i - 1][j]);
                }
            }
        }
        return dp[n][W];
    }


    public static void main(String[] args) {
        int[] val = {10, 40, 30, 50};
        int[] wghts = {5, 4, 6, 3};
        int w = 10;
        int ans = knapSackDp(w, wghts, val, val.length);
        System.out.println(ans);
    }
}
