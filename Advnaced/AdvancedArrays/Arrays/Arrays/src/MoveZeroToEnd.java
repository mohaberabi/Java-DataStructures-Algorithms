public class MoveZeroToEnd {


    void moveZeroToEndNaive(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                for (int j = i + 1; j < n; j++) {
                    if (arr[j] != 0) {
                        swap(arr, i, j);
                    }
                }
            }
        }
    }


    void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    void moveZerosToEndOptimal(int[] arr, int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                swap(arr, i, count);
                count++;
            }
        }
    }
}
