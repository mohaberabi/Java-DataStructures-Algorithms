public class MaximumSumIncreasingSubsequence {


    static int maximumSumIncreasingSubSequence(int[] arr, int n) {
        int[] mslis = new int[n];

        for (int i = 0; i < n; i++) {
            mslis[i] = arr[i];
            for (int j = 0; j < i; j++) {

                if (arr[j] < arr[i]) {
                    mslis[i] = Math.max(mslis[i], arr[i] + mslis[j]);
                }
            }
        }
        int res = mslis[0];
        for (int i = 0; i < n; i++) {
            res = Math.max(res, mslis[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {3, 20, 4, 6, 7, 30};
        int res = maximumSumIncreasingSubSequence(arr, arr.length);
        System.out.println(res);


    }
}
