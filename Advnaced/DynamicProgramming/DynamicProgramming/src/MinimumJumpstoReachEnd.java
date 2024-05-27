import java.util.Arrays;

public class MinimumJumpstoReachEnd {


    int minJumps(int[] arr, int n) {
        if (n == 1) {
            return 0;
        }
        int res = Integer.MAX_VALUE;

        for (int i = 0; i <= n - 2; i++) {
            if (i + arr[i] >= n - 1) {
                int subResult = minJumps(arr, i + 1);
                if (subResult != Integer.MAX_VALUE) {

                    res = Math.min(res, subResult);
                }
            }
        }
        return res;
    }

    int minJumpsDp(int[] arr, int n) {
        int[] dp = new int[n];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[j] + j >= i) {
                    if (dp[j] != Integer.MAX_VALUE) {
                        dp[i] = Math.min(dp[i], dp[j] + 1);
                    }
                }
            }
        }
        return dp[n - 1];
    }
}
