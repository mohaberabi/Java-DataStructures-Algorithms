public class TwoPointersApproachSortedArray {


    boolean isParirHasSum(int[] arr, int n, int sum) {

        int left = 0;
        int right = n - 1;


        while (left < right) {
            if (arr[left] + arr[right] == sum) {
                return true;
            } else if (arr[left] + arr[right] > sum) {
                right--;
            } else {
                left++;
            }
        }
        return false;
    }

    boolean isParirHasSum(int[] arr, int n, int sum, int start) {

        int left = start;
        int right = n - 1;


        while (left < right) {
            if (arr[left] + arr[right] == sum) {
                return true;
            } else if (arr[left] + arr[right] > sum) {
                right--;
            } else {
                left++;
            }
        }
        return false;
    }


    boolean isTriplet(int[] arr, int n, int sum) {
        for (int i = 0; i < n; i++) {

            if (isParirHasSum(arr, n, sum - arr[i], i + 1)) {
                return true;
            }
        }
        return false;
    }
}
