public class UniquePaths {


    static int uniquePath(int a, int b) {
        int[][] dp = new int[a + 1][b + 1];


        for (int i = 0; i < a; i++) {
            dp[i][0] = 0;
        }
        for (int i = 0; i < b; i++) {
            dp[0][i] = 0;
        }

        for (int i = 1; i <= b; i++) {
            dp[1][i] = 1;
        }
        for (int i = 2; i <= a; i++) {

            for (int j = 1; j <= b; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }

        for (int i = 0; i <= a; i++) {
            for (int j = 0; j <= b; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
        return 0;
    }


    public static void main(String[] args) {
        int res = uniquePath(3, 4);

    }
}
