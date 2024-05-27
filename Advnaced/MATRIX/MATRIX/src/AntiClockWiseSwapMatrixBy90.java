public class AntiClockWiseSwapMatrixBy90 {


    static void antiClockSwapBy90Naive(int[][] mat, int n) {
        int temp[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                temp[n - j - 1][i] = mat[i][j];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = temp[i][j];
            }
        }
    }


    static void antiClockSwapBy90Optinmal(int[][] mat, int n) {
        int temp[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                swap(mat, i, j);
            }
            int low = 0;
            int high = n - 1;
            while (low < high) {
                swap(mat, low, i, high);
                low++;
                high--;
            }
        }


    }

    static void swap(int[][] mat, int i, int j) {
        int temp = mat[i][j];
        mat[i][j] = mat[j][i];

        mat[j][i] = temp;
    }

    static void swap(int[][] mat, int start, int i, int end) {
        int temp = mat[start][i];
        mat[start][i] = mat[end][i];

        mat[end][i] = temp;
    }
}
