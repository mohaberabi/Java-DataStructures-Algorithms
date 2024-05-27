import java.util.ArrayList;
import java.util.Arrays;

public class UndirectedGraphCycle {


    boolean dfsRec(ArrayList<ArrayList<Integer>> adj, int s, boolean[] visited, int parent) {
        visited[s] = true;


        for (int x : adj.get(s)) {
            if (!visited[x]) {
                if (dfsRec(adj, x, visited, s)) {
                    return true;
                } else if (parent != x) {
                    return true;
                }
            }
        }
        return false;
    }

    boolean isUndirectedGraphHasCycle(ArrayList<ArrayList<Integer>> adj, int v) {
        boolean[] visited = new boolean[v];

        for (int i = 0; i < v; i++) {
            if (!visited[i]) {
                if (dfsRec(adj, i, visited, -1)) {
                    return true;
                }
            }
        }
        return false;
    }
}
