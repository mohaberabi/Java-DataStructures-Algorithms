public class SlidingWindow {


    int maxSubArrayWithKlong(int[] arr, int n, int k) {
        int res = Integer.MIN_VALUE;


        for (int i = 0; i + k - 1 < n; i++) {
            int curr = 0;

            for (int j = 0; j < k; j++) {
                curr += arr[j];

            }
            res = Math.max(curr, res);
        }
        return res;
    }


    int maxKSumUsingSlidingWindow(int[] arr, int n, int k) {
        int curr = 0;
        for (int i = 0; i < k; i++) {
            curr += arr[i];
        }
        int res = curr;

        for (int i = k; i < n; i++) {
            curr = curr + arr[i] - arr[i - k];
            res = Math.max(res, curr);
        }

        return res;
    }
}
