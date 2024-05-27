import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Stack;

public class TopologicalSortingDFS {


    void topologicalSortingDFSREC(ArrayList<ArrayList<Integer>> adj, int v, boolean[] visited, Stack<Integer> stack) {
        visited[v] = true;
        for (int u : adj.get(v)) {
            if (!visited[u]) {
                topologicalSortingDFSREC(adj, v, visited, stack);
            }
        }
        stack.push(v);
    }


    void topologicalSortingDFS(ArrayList<ArrayList<Integer>> adj, int V) {
        boolean[] visited = new boolean[V];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                topologicalSortingDFSREC(adj, i, visited, stack);
            }
        }

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
