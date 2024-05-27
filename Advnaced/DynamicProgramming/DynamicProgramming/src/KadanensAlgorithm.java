public class KadanensAlgorithm {
    int kadanesAlgorithm(int[] arr, int n) {


        int maxEnd = arr[0];
        int res = arr[0];

        for (int i = 1; i < n; i++) {
            maxEnd = Math.max(arr[i], maxEnd + arr[i]);

            res = Math.max(res, maxEnd);
        }
        return res;


    }

    static int kadanesAlgorithmDp(int[] arr, int n) {
        int[] dp = new int[n];
        dp[0] = arr[0];
        dp[1] = Math.max(arr[0], arr[1]);
        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(arr[i], Math.max(arr[i] + dp[i - 2], dp[i - 1]));
        }

        return dp[n - 1];
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int res = kadanesAlgorithmDp(arr, arr.length);
        System.out.println(res);
    }
}
