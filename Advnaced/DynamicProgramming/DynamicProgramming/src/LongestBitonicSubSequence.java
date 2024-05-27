public class LongestBitonicSubSequence {


    static int longestBitonicSubsequence(int[] arr, int n) {
        int[] lis = new int[n];

        lis[0] = 1;


        for (int i = 1; i < n; i++) {
            lis[i] = 1;
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[i]) {
                    lis[i] = Math.max(lis[i], lis[j] + 1);

                }
            }
        }
        int[] lds = new int[n];
        lds[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            lds[i] = 1;
            for (int j = n - 1; j > i; j--) {
                if (arr[j] < arr[i]) {
                    lds[i] = Math.max(lds[i], lds[j] + 1);
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(lds[i] + " ");
        }
        int res = 0;
        for (int i = 0; i < n; i++) {
            res = Math.max(res, lds[i] + lis[i] - 1);
        }
        return res;
    }


    public static void main(String[] args) {
        int[] arr = {1, 11, 2, 10, 4, 5, 2, 1};
        int res = longestBitonicSubsequence(arr, arr.length);
        System.out.println(res);
    }
}
