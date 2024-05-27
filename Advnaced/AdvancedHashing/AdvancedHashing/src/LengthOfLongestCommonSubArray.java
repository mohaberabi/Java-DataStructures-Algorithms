import java.util.HashMap;
import java.util.HashSet;

public class LengthOfLongestCommonSubArray {


    int longestCommonSubArray(int[] a, int[] b, int n) {
        int[] diff = new int[n];
        for (int i = 0; i < n; i++) {
            diff[i] = a[i] - b[i];
        }


        return longestSubArrayWithSum(diff, n, 0);
    }


    int longestSubArrayWithSum(int[] arr, int n, int sum) {
        int res = 0;
        int psum = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            psum += arr[i];
            if (psum == sum) {
                res = i + 1;
            }
            if (!map.containsKey(psum)) {
                map.put(psum, i);
            }
            if (map.containsKey(psum - sum)) {
                res = Math.max(res, i - map.get(psum - sum));
            }
        }
        return res;
    }
}
