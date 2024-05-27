public class SnakeTraversal {

    void snakeTraversal(int[][] mat, int n) {
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    System.out.println(mat[i][j]);
                }
            } else {
                for (int j = n - 1; j >= 0; j--) {
                    System.out.println(mat[i][j]);
                }
            }
        }
    }
}
