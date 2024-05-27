import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class ShortestPathDAG {


    void shortestPath(ArrayList<ArrayList<Integer>> adj, int s, int V) {

        int[] distance = new int[V];
        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[s] = 0;
        int weght = 1;
        ArrayList<Integer> topo = topologicalSort(adj, V);
        for (int u : topo) {
            for (int v : adj.get(u)) {
                if (distance[v] > distance[u] + weght) {
                    distance[v] = distance[u] + weght;
                }
            }
        }

    }


    void topologicalRec(ArrayList<ArrayList<Integer>> adj, int s, int V, boolean[] visited, Stack<Integer> stack) {
        visited[s] = true;
        for (int u : adj.get(s)) {
            if (!visited[u]) {
                topologicalRec(adj, u, V, visited, stack);
            }
        }
        stack.push(s);
    }


    ArrayList<Integer> topologicalSort(ArrayList<ArrayList<Integer>> adj, int V) {
        boolean[] visited = new boolean[V];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                topologicalRec(adj, i, V, visited, stack);
            }
        }

        ArrayList<Integer> topo = new ArrayList<>();

        while (!stack.isEmpty()) {
            topo.add(stack.pop());
        }

        return topo;
    }
}
