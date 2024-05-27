public class RatInMazeMultipleJumps {
    static public final int N = 4;

    static public final int[][] solution = new int[N][N];

    static public final int[][] maze = {
            {2, 1, 0, 0},
            {2, 0, 0, 1},
            {0, 1, 0, 1},
            {0, 0, 0, 1},

    };

    static boolean isSafe(int i, int j) {
        return i < N && j < N && maze[i][j] > 0;

    }

    static boolean solveMaze() {

        return solveRec(0, 0);
    }

    static boolean solveRec(int i, int j) {

        if (i == N - 1 && j == N - 1) {
            solution[i][j] = 1;
            return true;
        }

        if (isSafe(i, j)) {
            int jump = maze[i][j];
            solution[i][j] = 1;

            for (int k = 1; k <= jump; k++) {
                if (solveRec(i + k, j) || solveRec(i, j + k)) {
                    return true;
                }
            }

            solution[i][j] = 0; // Backtrack
        }

        return false;
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
                solution[i][j] = 0;
            }
        }
        boolean sol = solveMaze();
        System.out.println(sol);

        printMatrix(solution, N);
    }
}
