import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class LnegthOfLongrstSubsequence {

    int longestSubsSequence(int[] a, int n) {
        int res = 0;
        int curr = 1;
        Arrays.sort(a);


        for (int i = 1; i < n; i++) {
            if (a[i] == a[i + 1] + 1) {
                curr++;
            } else if (a[i] != a[i - 1]) {
                res = Math.max(res, curr);
                curr = 1;
            }
        }
        return res;
    }

    int longestSubsequence(int[] a, int n) {
        HashSet<Integer> set = new HashSet<>();

        int res = 1;
        for (int x : a) {
            set.add(x);
        }

        for (int x : set) {
            if (!set.contains(x - 1)) {
                int curr = 1;
                while (set.contains(x + curr)) {
                    curr++;
                }
                res = Math.max(res, curr);
            }
        }
        return res;
    }
}
