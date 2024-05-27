import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MoreThanKBy2Times {


    void printNByK(int[] arr, int n, int k) {

        Arrays.sort(arr);
        int i = 1;
        int count = 1;
        while (i < n) {
            while (i < n && arr[i] == arr[i - 1]) {
                count++;
                i++;
            }
            if (count > n / k) {
                System.out.println(arr[i - 1] + " ");
            }
            count = 1;
            i++;
        }
    }

    void printNByKBetter(int[] arr, int n, int k) {


        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            if (e.getValue() > n / k) {
                System.out.println(e.getKey());
            }
        }
    }
}
