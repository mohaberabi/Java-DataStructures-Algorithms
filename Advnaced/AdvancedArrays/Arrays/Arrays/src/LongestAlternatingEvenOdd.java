public class LongestAlternatingEvenOdd {

    int maxEvenOddOptimal(int[] arr, int n) {


        int curr = 1;
        int res = 1;

        for (int i = 1; i < n; i++) {
            if (alternating(arr, i)) {
                curr++;
                res = Math.max(res, curr);
            } else {
                curr = 1;
            }
        }
        return res;
    }

    int maxEvenOdd(int[] arr, int n) {
        int res = 1;


        for (int i = 0; i < n; i++) {
            int curr = 1;

            for (int j = i + 1; j < n; j++) {
                if (alternating(arr, j)) {

                    curr++;
                } else {
                    break;
                }

            }

            res = Math.max(res, curr);
        }
        return res;
    }

    boolean alternating(int[] arr, int j) {
        return (arr[j] % 2 == 0 && arr[j - 1] % 2 != 0) || (arr[j] % 2 != 0 && arr[j - 1] % 2 == 0);
    }
}
