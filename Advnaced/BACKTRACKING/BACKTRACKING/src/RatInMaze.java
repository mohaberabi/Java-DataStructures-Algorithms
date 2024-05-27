public class RatInMaze {
    static public final int N = 3;
    static public final int[][] maze = {
            {1, 0, 1},
            {1, 1, 0},
            {0, 1, 1},
    };

    static public final int[][] solution = new int[N][N];

    static boolean isSafe(int i, int j) {
        return i < N && j < N && maze[i][j] == 1;

    }


    static boolean solveMaze() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                solution[i][j] = 0;
            }
        }


        if (!solveRec(0, 0)) {
            return false;
        } else {
            printMatrix(solution, N);
            return true;
        }
    }

    static boolean solveRec(int i, int j) {
        if (i == N - 1 && j == N - 1) {
            solution[i][j] = 1;
            return true;
        }
        if (isSafe(i, j)) {
            solution[i][j] = 1;
            if (solveRec(i + 1, j)) {
                return true;
            } else if (solveRec(i, j + 1)) {
                return true;
            }
            solution[i][j] = 0;
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
        solveMaze();
    }
}
