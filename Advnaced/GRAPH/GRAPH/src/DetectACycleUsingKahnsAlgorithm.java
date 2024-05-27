import java.lang.reflect.Array;
import java.util.*;

public class DetectACycleUsingKahnsAlgorithm {


    boolean hasCycle(ArrayList<ArrayList<Integer>> adj, int V) {


        int[] indegrees = new int[V];

        for (int i = 0; i < V; i++) {
            for (int v : adj.get(i)) {
                indegrees[v]++;
            }
        }
        int count = 0;
        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < V; i++) {
            if (indegrees[i] == 0) {
                q.add(i);
            }
        }
        while (!q.isEmpty()) {
            int u = q.poll();

            for (int v : adj.get(u)) {
                indegrees[v]--;
                if (indegrees[v] == 0) {
                    q.add(v);
                }
            }
            count++;
        }
        return count != V;
    }
}
