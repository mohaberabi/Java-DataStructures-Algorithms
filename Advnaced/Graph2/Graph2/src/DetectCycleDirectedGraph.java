import java.util.ArrayList;

public class DetectCycleDirectedGraph {


    boolean directedGraphHasCycle(ArrayList<ArrayList<Integer>> adj, int V) {


        boolean[] visited = new boolean[V];
        boolean[] stack = new boolean[V];

        for (int i = 0; i < V; i++) {

            if (!visited[i]) {
                if (dfsRec(adj, i, visited, stack)) {
                    return true;
                }
            }
        }

        return false;
    }

    boolean dfsRec(ArrayList<ArrayList<Integer>> adj, int s, boolean[] visited, boolean[] stack) {
        stack[s] = true;
        visited[s] = true;

        for (int u : adj.get(s)) {
            if (!visited[u] && dfsRec(adj, u, visited, stack)) {
                return true;
            } else if (stack[u]) {
                return true;
            }
        }

        stack[s] = false;
        return false;
    }
}
