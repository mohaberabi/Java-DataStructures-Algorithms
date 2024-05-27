public class LeftRotateArrayByD {


    void leftRotateArrayByDMethod1(int[] arr, int n, int d) {
        for (int i = 0; i < d; i++) {
            LeftRotateArrayByOne.leftRotateByOne(arr, n);
        }
    }


    void LeftRotateBetter(int[] arr, int n, int d) {
        int[] temp = new int[d];
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }

        for (int i = d; i < n; i++) {
            arr[i - d] = temp[i];
        }
        for (int i = 0; i < n; i++) {
            arr[n - d + i] = temp[i];
        }
    }


    void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    void reverse(int[] arr, int i, int j) {
        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }

    void leftRotateByDOptimal(int[] arr, int n, int d) {
        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
        reverse(arr, 0, n - 1);
    }
}
