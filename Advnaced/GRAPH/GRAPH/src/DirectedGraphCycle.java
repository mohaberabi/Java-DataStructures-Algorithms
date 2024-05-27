import java.util.ArrayList;

public class DirectedGraphCycle {


    boolean dfsRec(ArrayList<ArrayList<Integer>> adj, int s, boolean[] visited, boolean[] stack) {
        visited[s] = true;
        stack[s] = true;
        for (int x : adj.get(s)) {
            if (!visited[x] && dfsRec(adj, x, visited, stack)) {
                return true;
            } else if (stack[x]) {
                return true;
            }

        }
        stack[s] = false;
        return false;

    }


    boolean isDirectedHasCycle(ArrayList<ArrayList<Integer>> adj, int v) {
        boolean[] visited = new boolean[v];
        boolean[] stack = new boolean[v];
        for (int i = 0; i < v; i++) {
            if (!visited[i]) {
                if (dfsRec(adj, i, visited, stack)) {
                    return true;
                }
            }
        }
        return false;
    }
}
