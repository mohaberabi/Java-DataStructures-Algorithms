import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class KClosestElements {


    void printKClosestNaive(int[] arr, int n, int k, int x) {
        boolean[] visited = new boolean[n];
        Arrays.fill(visited, false);

        for (int i = 0; i < k; i++) {
            int minDiff = Integer.MAX_VALUE;
            int minDiffIndex = 0;

            for (int j = 0; j < n; j++) {
                int val = Math.abs(arr[j] - x);
                if (!visited[j] && val < minDiff) {
                    minDiff = val;
                    minDiffIndex = j;
                }
            }

            System.out.println(arr[minDiffIndex]);
            visited[minDiffIndex] = true;

        }


    }

    static void printKElements(int[] arr, int n, int k, int x) {
        PriorityQueue<PqDta> pq = new PriorityQueue<PqDta>((o1, o2) -> o2.diff - o1.diff);
        for (int i = 0; i < k; i++) {
            pq.add(new PqDta(Math.abs(arr[i] - x), i));

        }


        for (int i = k; i < n; i++) {
            int diff = Math.abs(arr[i] - x);
            if (pq.peek().diff > diff) {
                pq.poll();
                pq.add(new PqDta(diff, i));
            }
        }
        for (int i = 0; i < k; i++) {
            System.out.println(pq.poll().index + " ");
        }
    }

    static public class PqDta {
        public int diff;
        public int index;

        public PqDta(int d, int i) {
            diff = d;
            index = i;
        }


    }
}
