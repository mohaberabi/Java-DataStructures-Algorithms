public class SudokuSolver {

    public static int N = 4;
    public static int[][] sudoku = {
            {1, 0, 3, 4},
            {0, 0, 2, 1},
            {0, 1, 4, 2},
            {2, 4, 1, 0}
    };

    public static void main(String[] args) {
        if (solve()) {
            printMatrix(sudoku, N);
        } else {
            System.out.println("No solution exists.");
        }
    }

    static boolean solve() {
        int i = 0;
        int j = 0;

        // Find the first empty cell
        boolean isEmpty = false;
        for (i = 0; i < N; i++) {
            for (j = 0; j < N; j++) {
                if (sudoku[i][j] == 0) {
                    isEmpty = true;
                    break;
                }
            }
            if (isEmpty) {
                break;
            }
        }

        // If no empty cell is found, the puzzle is solved
        if (!isEmpty) {
            return true;
        }

        for (int x = 1; x <= N; x++) {
            if (isSafe(i, j, x)) {
                sudoku[i][j] = x;
                if (solve()) {
                    return true;
                }
                sudoku[i][j] = 0; // Backtrack
            }
        }

        return false;
    }

    static boolean isSafe(int row, int col, int num) {
        // Check the row and column
        for (int i = 0; i < N; i++) {
            if (sudoku[row][i] == num || sudoku[i][col] == num) {
                return false;
            }
        }

        // Check the 3x3 subgrid
        int sqrtN = (int) Math.sqrt(N);
        int boxRowStart = row - row % sqrtN;
        int boxColStart = col - col % sqrtN;

        for (int i = boxRowStart; i < boxRowStart + sqrtN; i++) {
            for (int j = boxColStart; j < boxColStart + sqrtN; j++) {
                if (sudoku[i][j] == num) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void printMatrix(int[][] mat, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
