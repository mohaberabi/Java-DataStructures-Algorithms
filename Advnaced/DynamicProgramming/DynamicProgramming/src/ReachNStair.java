public class ReachNStair {


    static int reachNStair(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    static int reachNStairOrderNoMatter(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            dp[i] = (i / 2) + 1;
        }
        return dp[n];
    }


    public static void main(String[] args) {
        int stair = reachNStairOrderNoMatter(5);
        System.out.println(stair);
    }
}
