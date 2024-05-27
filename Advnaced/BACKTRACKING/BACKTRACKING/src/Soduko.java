public class Soduko {

    public static int N = 4;
    public static int[][] soduko = {
            {1, 0, 3, 4},
            {0, 0, 2, 1},
            {0, 1, 4, 2},
            {2, 4, 1, 0},
    };

    static boolean solve() {
        int i;
        int j = 0;
        boolean found = false;
        for (i = 0; i < N; i++) {
            for (j = 0; j < N; j++) {
                if (soduko[i][j] == 0) {
                    found = true;
                    break;
                }
            }
            if (found) {
                break;
            }
        }

        if (i == N && j == N) {
            return true;
        }
        for (int x = 1; x <= N; x++) {
            if (isSafe(i, j, x)) {
                soduko[i][j] = x;
                if (solve()) {
                    return true;
                }
                soduko[i][j] = 0;
            }
        }
        return false;
    }

    static boolean isSafe(int i, int j, int x) {
        for (int k = 0; k < N; k++) {
            if (soduko[k][j] == x || soduko[j][k] == x) {
                return false;
            }

        }
        int sq = (int) Math.sqrt(N);
        int left = i - i % sq;
        int right = j - j % sq;
        for (i = 0; i < sq; i++) {
            for (j = 0; j < sq; j++) {
                if (soduko[i + right][j + left] == x) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        solve();
        printMatrix(soduko, N);
    }

    public static void printMatrix(int[][] mat, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j]);
            }
            System.out.println();
        }
    }

}
