import java.util.Arrays;
import java.util.Comparator;

public class LongestChainOfPair {


    public static class Pair {
        int first;
        int second;

        public Pair(int f, int s) {
            first = f;
            second = s;
        }

        @Override
        public String toString() {
            return "first-> " + first + " " + "Second->" + second;
        }
    }

    static int longestChainOfPair(Pair[] pairs, int n) {


        Arrays.sort(pairs, Comparator.comparingInt(a -> a.first));


        int[] lis = new int[n];
        lis[0] = 1;


        for (int i = 1; i < n; i++) {
            lis[i] = 1;
            for (int j = 0; j < i; j++) {
                if (pairs[j].second < pairs[i].first) {
                    lis[i] = Math.max(lis[i], lis[j] + 1);

                }
            }
        }
        int res = lis[0];
        for (int i = 0; i < n; i++) {
            res = Math.max(res, lis[i]);
        }
        return res;
    }

    public static void main(String[] args) {

        LongestChainOfPair.Pair[] pairs = {
                new LongestChainOfPair.Pair(5, 24),
                new LongestChainOfPair.Pair(39, 60),
                new LongestChainOfPair.Pair(15, 28),
                new LongestChainOfPair.Pair(27, 40),
                new LongestChainOfPair.Pair(50, 90),


        };

        int ans = longestChainOfPair(pairs, pairs.length);


        for (LongestChainOfPair.Pair pair : pairs) {
            System.out.println(pair.toString());
        }

        System.out.println(ans);
    }
}
