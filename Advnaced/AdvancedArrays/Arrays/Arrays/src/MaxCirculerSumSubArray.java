public class MaxCirculerSumSubArray {


    int maxCirculerSumSubArraynaive(int[] arr, int n) {
        int res = arr[0];

        for (int i = 0; i < n; i++) {
            int currentMax = arr[i];
            int currnetSum = arr[i];

            for (int j = 1; j < n; j++) {
                // to get the circuler start of the subarray
                int index = (i + j) % n;
                currnetSum += arr[index];
                currentMax = Math.max(currentMax, currnetSum);
            }
            res = Math.max(res, currentMax);
        }
        return res;
    }


    int kadanes(int[] arr, int n) {
        int res = arr[0];
        int maxEnd = arr[0];
        for (int i = 0; i < n; i++) {
            maxEnd = Math.max(arr[i], arr[i] + maxEnd);
            res = Math.max(res, maxEnd);
        }
        return res;
    }


    int maxSumSubArrayOptimal(int[] arr, int n) {
        int kad = kadanes(arr, n);
        if (kad < 0) {
            return kad;
        }
        int totalSum = 0;
        for (int i = 0; i < n; i++) {
            totalSum += arr[i];
            arr[i] = -arr[i];
        }

        int circulerSum = totalSum + kadanes(arr, n);
        return Math.max(circulerSum, kad);
    }
}
