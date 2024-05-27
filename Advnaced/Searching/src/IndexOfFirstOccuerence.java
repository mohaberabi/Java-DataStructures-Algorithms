public class IndexOfFirstOccuerence {


    static int firstOccueceIterative(int[] arr, int n, int x) {

        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] > x) {
                high = mid - 1;
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                if (mid == 0 || arr[mid - 1] != arr[mid]) {
                    return mid;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }

    int firstOccurence(int[] arr, int low, int high, int x) {
        if (low > high) {
            return -1;
        }


        int mid = (low + high) / 2;


        if (arr[mid] > x) {
            return firstOccurence(arr, low, mid - 1, x);
        } else if (arr[mid] < x) {
            return firstOccurence(arr, mid + 1, high, x);
        } else {
            if (mid == 0 || arr[mid - 1] != arr[mid]) {
                return mid;
            } else {
                return firstOccurence(arr, low, mid - 1, x);
            }
        }
    }
}
