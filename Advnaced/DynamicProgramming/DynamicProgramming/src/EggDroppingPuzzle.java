public class EggDroppingPuzzle {


    int minTrials(int eggs, int floors) {
        if (eggs == 1) {
            return floors;
        }
        if (floors == 1) {
            return 1;
        }
        if (floors == 0) {
            return 0;
        }
        int minDrops = Integer.MAX_VALUE;
        for (int i = 1; i <= floors; i++) {
            int breaks = minTrials(eggs - 1, i - 1);
            int doesNotBreak = minTrials(eggs, floors - i);
            int maxDrops = 1 + Math.max(breaks, doesNotBreak);
            minDrops = Math.min(minDrops, maxDrops);
        }
        return minDrops;
    }

    static int minTrialsDp(int eggs, int floors) {
        int[][] dp = new int[floors + 1][eggs + 1];

        for (int i = 1; i <= eggs; i++) {
            dp[1][i] = 1;
        }
        for (int i = 1; i <= floors; i++) {
            dp[i][1] = i;
        }
        for (int i = 2; i <= floors; i++) {
            for (int j = 2; j <= eggs; j++) {
                dp[i][j] = Integer.MAX_VALUE;
                for (int x = 1; x <= i; x++) {
                    dp[i][j] = Math.min(dp[i][j], 1 + Math.max(dp[x - 1][j - 1], dp[i - x][j]));
                }
            }
        }

        return dp[floors][eggs];
    }


    public static void main(String[] args) {
        int floors = 3;
        int eggs = 2;
        int ans = minTrialsDp(eggs, floors);
        System.out.println(ans);
    }
}
