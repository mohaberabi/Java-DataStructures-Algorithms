public class MaxNoConsecutive {


    int maxNoConsecutive(int[] arr, int n) {
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = arr[0];
        dp[2] = Math.max(arr[0], arr[1]);
        for (int i = 3; i <= n; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + arr[i - 1]);
        }
        return dp[n];
    }

    static int maxNoConsecutiveSpaceOptimized(int[] arr, int n) {

        if (n == 1) {
            return arr[0];
        }
        int prevPrev = arr[0];
        int prev = Math.max(arr[0], arr[1]);
        int res = prev;
        for (int i = 3; i <= n; i++) {
            res = Math.max(prev, prevPrev + arr[i - 1]);
            prevPrev = prev;
            prev = res;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] a = {6, 5, 5, 7, 4};
        int res = maxNoConsecutiveSpaceOptimized(a, a.length);
        System.out.println(res);
    }
}
