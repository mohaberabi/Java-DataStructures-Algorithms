public class Transpose {


    static void transpose(int[][] mat, int n) {

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                swap(mat, i, j);
            }
        }
    }


    static void swap(int[][] mat, int i, int j) {
        int temp = mat[i][j];
        mat[i][j] = mat[j][i];

        mat[j][i] = temp;
    }
}
