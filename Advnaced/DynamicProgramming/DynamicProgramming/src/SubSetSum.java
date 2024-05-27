public class SubSetSum {
    int subSetSum(int[] arr, int n, int sum) {
        if (n == 0) {
            return (sum == 0) ? 1 : 0;
        }

        return subSetSum(arr, n - 1, sum - arr[n - 1]) + subSetSum(arr, n - 1, sum);

    }

    static int subSetSumDp(int[] arr, int n, int sum) {
        int[][] dp = new int[n + 1][sum + 1];

        for (int i = 0; i <= sum; i++) {
            dp[0][i] = 0;
        }
        for (int i = 0; i <= n; i++) {
            dp[i][0] = 1;
        }

        dp[0][0] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sum; j++) {
                if (j < arr[i - 1]) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j] + dp[i - 1][j - arr[i - 1]];
                }
            }
        }
        return dp[n][sum];
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 3};
        int res = subSetSumDp(arr, arr.length, 5);

        System.out.println(res);
    }
}
