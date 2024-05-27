import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class SortKSortedArray {


    void sortKSortedArray(int[] arr, int n, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int nextElementIndex = 0;
        for (int i = 0; i <= k; i++) {
            pq.add(arr[i]);
            pq.remove();
        }

//      ArrayList i = (ArrayList) Arrays.asList(arr);

        for (int i = k + 1; i < n; i++) {
            arr[nextElementIndex++] = pq.poll();
            pq.add(arr[i]);
        }
        while (!pq.isEmpty()) {
            arr[nextElementIndex++] = pq.poll();
        }
    }
}
