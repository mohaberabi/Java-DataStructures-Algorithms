public class CountNumberOfHobs {


    static long waysOfHobs(int n) {


        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
        }

//        for (int i = 0; i < dp.length; i++) {
//            System.out.print(dp[i] + " ");
//        }
        return dp[n];
    }

    public static void main(String[] args) {
        long res = waysOfHobs(54);
        System.out.println(res % 1000000007);
    }
}
