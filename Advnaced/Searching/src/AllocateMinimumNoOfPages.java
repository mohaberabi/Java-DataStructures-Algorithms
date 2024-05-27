public class AllocateMinimumNoOfPages {


    int minPages(int[] arr, int n, int k) {
        if (k == 1) {
            return sum(arr, 0, n - 1);
        }

        if (n == 1) {
            return arr[0];
        }

        int res = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            res = Math.min(res, Math.max(minPages(arr, i, k - 1), sum(arr, i, n - 1)));
        }
        return res;
    }

    int sum(int[] arr, int b, int e) {
        int s = 0;


        for (int i = b; i <= e; i++) {
            s += arr[i];
        }
        return s;
    }


    int minPagesBinarySearch(int[] arr, int n, int k) {
        int total = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            total += arr[i];
            max = Math.max(max, arr[i]);
        }

        int low = max;
        int high = total;
        int res = 0;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (isFeasable(arr, n, k, mid)) {
                res = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }

        }
        return res;
    }

    boolean isFeasable(int[] arr, int n, int k, int ans) {

        int req = 1;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            if (sum + arr[i] > ans) {
                req++;
                sum = arr[i];
            } else {
                sum += arr[i];
            }
        }
        return (req <= k);
    }
}
