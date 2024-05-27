import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class TopologicalSortingKahnsAlgorithm {

    ArrayList<Integer> topolgicalSorting(ArrayList<ArrayList<Integer>> adj, int V) {


        ArrayList<Integer> sorted = new ArrayList<>();


        int[] indegrees = new int[V];

        for (int i = 0; i < V; i++) {
            for (int v : adj.get(i)) {
                indegrees[v]++;
            }
        }
        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < V; i++) {
            if (indegrees[i] == 0) {
                q.add(i);
            }
        }


        while (!q.isEmpty()) {
            int u = q.poll();
            sorted.add(u);
            for (int v : adj.get(u)) {
                indegrees[v]--;
                if (indegrees[v] == 0) {
                    q.add(v);
                }
            }
        }
        return sorted;
    }
}
