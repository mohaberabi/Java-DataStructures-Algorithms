import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Stack;

public class TopologicalSortingDFS {


    static void topologicalSortingDFSRec(ArrayList<ArrayList<Integer>> adj, boolean[] visited, Stack<Integer> stack, int s) {
        visited[s] = true;
        for (int u : adj.get(s)) {
            if (!visited[u]) {
                topologicalSortingDFSRec(adj, visited, stack, u);
            }
        }
        stack.push(s);

    }

    static void topologicalSortingDFS(ArrayList<ArrayList<Integer>> adj, int V) {


        boolean[] visited = new boolean[V];
        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                topologicalSortingDFSRec(adj, visited, s, i);
            }
        }

        while (s.isEmpty() == false) {
            int u = s.pop();
            System.out.println(u);
        }

    }

    public static void main(String[] args) {
        int V = 5;

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        adj.get(0).add(1);
        adj.get(1).add(3);
        adj.get(2).add(3);
        adj.get(3).add(4);


        topologicalSortingDFS(adj, V);
    }
}
