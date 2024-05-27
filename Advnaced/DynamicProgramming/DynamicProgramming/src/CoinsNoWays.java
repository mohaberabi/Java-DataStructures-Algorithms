import java.util.Arrays;

public class CoinsNoWays {
    static long nofWays(int[] coins, int n, int val) {

        long ways[] = new long[val + 1];

        ways[0] = 1;

        for (int coin : coins) {
            for (int i = 1; i <= val; i++) {
                if (i >= coin) {
                    ways[i] += ways[i - coin];
                }
            }
        }
        return ways[val];
    }

    public static void main(String[] args) {
        int[] coins = {2, 5, 3, 6};
        long res = nofWays(coins, coins.length, 10);
        System.out.println(res);
    }
}
