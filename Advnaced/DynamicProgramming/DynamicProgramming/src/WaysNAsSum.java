public class WaysNAsSum {

    static int waysNAsSum(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 0;
        dp[2] = 1;
        dp[3] = 2;

        for (int i = 4; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];

        }

        return dp[n];
    }

    public static void main(String[] args) {

        int res = waysNAsSum(5);

        System.out.println(res);

    }

}
