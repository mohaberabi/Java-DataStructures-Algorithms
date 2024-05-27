public class IndexOfLastOccuerence {


    static int indexOfLastOccurenceIterative(int[] arr, int x, int n) {


        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] > x) {
                low = mid + 1;
            } else if (arr[mid] < x) {
                high = mid - 1;
            } else {
                if (mid == n - 1 || arr[mid] != arr[mid + 1]) {
                    return mid;
                } else {
                    low = mid + 1;
                }
            }
        }
        return -1;
    }

    int indexOfLastOccuerence(int[] arr, int x, int low, int high, int n) {
        if (low > high) {
            return -1;
        }

        int mid = (low + high) / 2;


        if (arr[mid] > x) {
            return indexOfLastOccuerence(arr, x, low, mid - 1, n);
        } else if (arr[mid] < x) {
            return indexOfLastOccuerence(arr, x, mid + 1, high, n);
        } else {
            if (mid == n - 1 || arr[mid] != arr[mid + 1]) {
                return mid;
            } else {
                return indexOfLastOccuerence(arr, x, mid + 1, high, n);
            }
        }

    }
}
