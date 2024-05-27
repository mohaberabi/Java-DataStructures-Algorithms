import java.util.ArrayList;

public class ReverseArrayInGroup {


    static void reversInGroup(ArrayList<Integer> arr, int n, int k) {

        for (int i = 0; i < n; i += k) {
            if (i + k < n) {
                reverse(arr, i, i + k - 1);
            } else {
                reverse(arr, i, n - 1);
            }
        }

    }


    static void swap(ArrayList<Integer> arr, int i, int j) {
        int temp = arr.get(i);
        arr.set(i, arr.get(j));
        arr.set(j, temp);
    }

    static void reverse(ArrayList<Integer> arr, int i, int j) {

        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }
}
