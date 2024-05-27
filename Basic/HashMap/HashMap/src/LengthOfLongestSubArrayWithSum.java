package hashing;

import java.util.HashMap;
import java.util.Map;

public class LengthOfLongestSubArrayWithSum {
    public static int lenOfLongestSubArrayWithSum(int[] arr, int sum) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int total = 0;
        int len = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
            if (total == sum) {
                len = i + 1;
            }
            if (!map.containsKey(total)) {
                map.put(total, i);
            }
            if (map.containsKey(total - sum)) {
                len = Math.max(len, i - map.get(total - sum));
            }
        }
        return len;
    }
}
