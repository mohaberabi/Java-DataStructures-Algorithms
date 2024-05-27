public class MaximumSumSubArray {


    int maxSumSubArrayNaive(int[] arr, int n) {
        int res = 0;
        for (int i = 0; i < n; i++) {
            int curr = 0;
            for (int j = i; j < n; j++) {
                curr += arr[j];
                res = Math.max(res, curr);
            }
        }
        return res;
    }


    // kadanesssss algoirthmmmmmmm
    int maxSumSubArrayOptimal(int[] arr, int n) {
        int res = arr[0];
        int maxEnd = arr[0];
        for (int i = 1; i < n; i++) {
            maxEnd = Math.max(maxEnd + arr[i], arr[i]);
            res = Math.max(maxEnd, res);
        }
        return res;
    }
}
