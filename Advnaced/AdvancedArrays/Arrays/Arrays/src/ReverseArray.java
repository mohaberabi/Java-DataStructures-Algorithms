public class ReverseArray {


    void reverseArray(int[] arr, int n) {
        int left = 0;
        int right = n - 1;
        while (left < right) {
            swap(arr, left, right);
            left++;
            right--;
        }

    }

    void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
