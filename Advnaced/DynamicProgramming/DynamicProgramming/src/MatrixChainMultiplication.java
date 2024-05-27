public class MatrixChainMultiplication {


    int minimumMultiplicationMatrices(int[] arr, int i, int j) {

        if (i + 1 == j) {
            return 0;
        }

        int res = Integer.MAX_VALUE;

        for (int k = i + 1; k < j; k++) {

            res = Math.min(res,
                    minimumMultiplicationMatrices(arr, i, k) +
                            minimumMultiplicationMatrices(arr, k, j) +
                            arr[i] * arr[k] * arr[j]);
        }
        return res;
    }
}
