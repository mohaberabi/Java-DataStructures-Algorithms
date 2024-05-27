public class SubArrayWithGivenSum {

    boolean isSumExist(int[] arr, int n, int sum) {


        for (int i = 0; i < n; i++) {
            int res = 0;
            for (int j = i; j < n; j++) {
                res += arr[j];
                if (res == sum) {
                    return true;
                }
            }
        }
        return false;
    }


    boolean isSumExistSlidingWindow(int[] arr, int n, int sum) {
        int start = 0;
        int curr = 0;
        for (int end = 0; end < n; end++) {

            curr += arr[end];
            while (sum < curr) {
                curr -= arr[start];
                start++;
            }
            if (curr == sum) {
                return true;
            }
        }
        return false;
    }
}
