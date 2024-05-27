public class SearchInfiniteArray {


    int searchInfiniteArrayOptimal(int[] arr, int x) {
        if (arr[0] == x) {
            return 0;
        }
        int i = 1;
        while (arr[i] < x) {
            i = i * 2;
            if (arr[i] == x) {
                return i;
            }
        }
        int low = (i / 2) + 1;
        int high = i - 1;
        return BinarySearch.binarySearch(arr, x, low, high);
    }

    int searchInfiniteArrayNaive(int[] arr, int x) {
        int i = 0;
        while (true) {
            if (arr[i] == x) {
                return i;
            }
            if (arr[i] > x) {
                return -1;
            }
            i++;
        }
    }
}
