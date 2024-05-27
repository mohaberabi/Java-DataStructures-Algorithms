import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class BridgeInGraph {


    int V;
    LinkedList<Integer> adj[];

    int time = 0;
    int NIL = -1;


    public BridgeInGraph(int v) {
        this.V = v;
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<>();
        }

    }

    void addEdge(int u, int v) {
        adj[u].add(v);
        adj[v].add(u);
    }


    void bridgeUtil(int u, boolean[] visited, int[] disc, int[] low, int[] parent) {
        visited[u] = true;

        disc[u] = low[u] = ++time;
        Iterator<Integer> i = adj[u].iterator();

        while (i.hasNext()) {
            int v = i.next();

            if (!visited[v]) {
                parent[v] = u;
                bridgeUtil(v, visited, disc, low, parent);

                low[u] = Math.min(low[u], low[v]);
                if (low[v] > disc[u]) {
                    System.out.println(u + " " + v);
                } else if (v != parent[u]) {
                    low[u] = Math.min(low[u], low[v]);
                }
            }
        }
    }

    void bridges() {
        boolean[] visited = new boolean[V];
        int[] disc = new int[V];
        int[] low = new int[V];
        int parent[] = new int[V];
        Arrays.fill(parent, NIL);


        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                bridgeUtil(i, visited, disc, low, parent);
            }
        }
    }
}
