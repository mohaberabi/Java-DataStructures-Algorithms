public class PrefixSum {


    int[] arr = {1, 2, 23, 123, 213, 123, 213,};


    private final int[] prefix = new int[arr.length];


    private void init() {
        for (int i = 1; i < arr.length; i++) {

            prefix[i] = prefix[i - 1] + arr[i];
        }


    }

    int getSum(int i, int j) {
        if (i == 0) {
            return prefix[j];
        } else {
            return prefix[j] - prefix[i - 1];
        }
    }
}
