import java.lang.reflect.Array;
import java.util.Arrays;

public class MaximumRepeatingElement {


    int maxRepeatingSuperNaive(int[] arr, int n) {

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }
        return -1;
    }

    int maxRepeatingNaive(int[] arr, int n) {
        Arrays.sort(arr);


        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                return arr[i];
            }
        }
        return -1;
    }

    int maxRepatingBetter(int[] arr, int n) {
        boolean[] visited = new boolean[n - 1];
        Arrays.fill(visited, false);

        for (int i = 0; i < n; i++) {
            if (visited[arr[i]]) {
                return arr[i];
            }
            visited[arr[i]] = true;
        }

        return -1;
    }

    // this solution is based on linkedlist cycle foloyed algorithm


    int maxRepeatingElementStartingAt1(int[] arr, int n) {
        int slow = arr[0];
        int fast = arr[0];

        do {
            slow = arr[slow];
            fast = arr[arr[fast]];
        } while (slow != fast);


        slow = arr[0];

        while (fast != slow) {
            slow = arr[slow];
            fast = arr[fast];
        }
        return slow;
    }

    int maxRepeatingElementStartingAt0(int[] arr, int n) {
        int slow = arr[0] + 1;
        int fast = arr[0] + 1;

        do {
            slow = arr[slow] + 1;
            fast = arr[arr[fast] + 1] + 1;
        } while (slow != fast);


        slow = arr[0] + 1;

        while (fast != slow) {
            slow = arr[slow] + 1;
            fast = arr[fast] + 1;
        }
        return slow - 1;
    }
}
