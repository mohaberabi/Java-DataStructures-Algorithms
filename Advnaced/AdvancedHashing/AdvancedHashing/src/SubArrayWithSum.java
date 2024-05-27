import java.util.HashSet;

public class SubArrayWithSum {


    boolean subArrayWithSum(int[] arr, int n, int sum) {

        int prefixSum = 0;


        HashSet<Integer> set = new HashSet<>();


        for (int x : arr) {
            prefixSum += x;
            if (prefixSum == sum) {
                return true;
            }
            if (set.contains(prefixSum - sum)) {
                return true;
            }
            set.add(prefixSum);
        }
        return false;
    }

}
