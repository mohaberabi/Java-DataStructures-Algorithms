public class WaysNasSumOfTwoMoreInteger {


    static int waysNasNum(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        for (int i = 1; i < n; i++) {
            for (int j = i; j <= n; j++) {
                dp[j] = dp[j] + dp[j - i];
            }
        }


        return dp[n];
    }


    public static void main(String[] args) {
        int res = waysNasNum(5);
        System.out.println(res);
    }
}
