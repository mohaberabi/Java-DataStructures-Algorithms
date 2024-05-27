import java.util.Arrays;

public class MinimumCoinsToGetValue {

    int minCoinsToVal(int[] coins, int n, int val) {


        if (val == 0) {
            return 0;
        }
        int res = Integer.MAX_VALUE;
        for (int i = 1; i < n; i++) {
            if (coins[i] <= val) {
                int subResult = minCoinsToVal(coins, n, val - coins[i]);
                if (subResult != Integer.MAX_VALUE) {
                    res = Math.min(res, subResult + 1);
                }
            }
        }
        return res;
    }

    static int minCoinsDp(int[] coins, int n, int val) {
        int[] dp = new int[val + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for (int i = 1; i <= val; i++) {
            for (int j = 0; j < n; j++) {
                if (coins[j] <= i) {
                    int subResult = dp[i - coins[j]];
                    if (subResult != Integer.MAX_VALUE) {
                        dp[i] = Math.min(dp[i], subResult + 1);
                    }
                }
            }
        }


        return dp[val];
    }

    public static void main(String[] args) {
        int[] coins = {3, 4, 1};
        int res = minCoinsDp(coins, coins.length, 5);
        System.out.println(res);
    }
}
