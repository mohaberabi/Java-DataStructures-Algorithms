public class SortestCommonSuperSequence {


    static int shortestCommonSuperSequence(String a, String b) {
        int n = a.length();
        int m = b.length();
        int[][] dp = new int[n + 1][m + 1];

        for (int i = 0; i <= n; i++) {
            dp[i][0] = 0;
        }
        for (int i = 0; i <= m; i++) {
            dp[0][i] = 0;
        }

        int lcs = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (a.charAt(i - 1) == b.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        lcs = dp[n][m];


        return (n - lcs) + (m - lcs) + lcs;
    }

    public static void main(String[] args) {
        String a = "abcd";
        String b = "xycd";
        int res = shortestCommonSuperSequence(a, b);
        System.out.println(res);
    }
}
