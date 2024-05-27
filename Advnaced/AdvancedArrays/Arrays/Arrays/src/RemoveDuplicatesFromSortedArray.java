public class RemoveDuplicatesFromSortedArray {


    int removeDuplicatesFromSortedArray(int[] arr, int n) {


        int res = 1;
        for (int i = 1; i < n; i++) {

            if (arr[i] != arr[i - 1]) {

                arr[res] = arr[i];
                res++;

            }
        }

        return res;
    }
}
