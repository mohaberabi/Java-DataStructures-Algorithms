import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class DetectCycleUsingTopologicalSorting {


    boolean graphHasCylceTopologicalSorting(ArrayList<ArrayList<Integer>> adj, int V) {
        int[] indegree = new int[V];
        for (int i = 0; i < V; i++) {
            for (int v : adj.get(i)) {
                indegree[v]++;
            }
        }

        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < indegree.length; i++) {
            if (indegree[i] == 0) {
                q.add(i);
            }
        }

        int count = 0;
        while (q.isEmpty() == false) {
            int u = q.poll();
            for (int v : adj.get(u)) {
                indegree[v]--;
                if (indegree[v] == 0) {
                    q.add(v);
                }
            }
            count++;
        }

        return (count != V);
    }
}
