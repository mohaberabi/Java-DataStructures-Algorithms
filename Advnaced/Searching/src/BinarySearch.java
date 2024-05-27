public class BinarySearch {


    static int binarySearch(int[] arr, int x, int low, int high) {

        if (low > high) {
            return -1;
        }


        int mid = (low + high) / 2;

        if (arr[mid] == x) {
            return mid;
        } else if (arr[mid] > x) {
            return binarySearch(arr, x, low, mid - 1);

        } else {
            return binarySearch(arr, x, mid + 1, high);
        }
    }

    static int binarySearch(int[] arr, int n, int x) {


        int low = 0;
        int high = n - 1;
        while (low <= high) {

            int mid = (low + high) / 2;
            if (arr[mid] == x) {
                return mid;
            } else if (arr[mid] > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
