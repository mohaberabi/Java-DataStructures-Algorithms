import java.util.ArrayList;

public class DetectCycleUndirectedGraph {


    boolean dfsRec(ArrayList<ArrayList<Integer>> adj, int s, boolean[] visited, int parent) {


        visited[s] = true;

        for (int u : adj.get(s)) {
            if (!visited[u]) {
                if (dfsRec(adj, u, visited, s)) {
                    return true;
                }
            } else if (u != parent) {
                return true;
            }
        }
        return false;
    }


    boolean undirectedGraphHasCycle(ArrayList<ArrayList<Integer>> adj, int V) {
        boolean[] visited = new boolean[V];
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                if (dfsRec(adj, i, visited, -1)) {
                    return true;
                }
            }
        }
        return false;
    }
}
