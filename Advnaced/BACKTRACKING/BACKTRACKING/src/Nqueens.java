public class Nqueens {
    static final int N = 4;

    static public int[][] board = new int[N][N];

    static boolean solve() {

        if (!solveRec(0)) {
            return false;
        } else {
            printMatrix(board, N);
            return true;
        }
    }

    static boolean solveRec(int col) {

        if (col == N) {
            return true;
        }
        for (int i = 0; i < N; i++) {
            if (isSafe(i, col)) {
                board[i][col] = 1;
                if (solveRec(col + 1)) {
                    return true;
                }
                board[i][col] = 0;
            }
        }
        return false;
    }

    static boolean isSafe(int row, int col) {
        for (int i = 0; i < col; i++) {
            if (board[row][i] == 1) {
                return false;
            }
        }

        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {

            if (board[i][j] == 1) {
                return false;
            }
        }
        for (int i = row, j = col; i < N && j >= 0; i++, j--) {

            if (board[i][j] == 1) {
                return false;
            }
        }

        return true;
    }

    public static void printMatrix(int[][] mat, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                board[i][j] = 0;
            }
        }
        solve();
    }
}
