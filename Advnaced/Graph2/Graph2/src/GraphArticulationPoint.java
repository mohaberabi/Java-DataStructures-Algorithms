import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class GraphArticulationPoint {


    private int V;
    private LinkedList<Integer> adj[];
    int time = 0;
    static final int NIL = -1;

    public GraphArticulationPoint(int V) {
        this.V = V;
        adj = new LinkedList[V];

        for (int i = 0; i < V; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    void addEdge(int u, int v) {


        adj[u].add(v);
        adj[v].add(u);
    }


    void articulationPointUtil(int u, boolean[] visited, int[] discoveryTime, int[] low, int[] parent, boolean[] ap) {
        int children = 0;
        visited[u] = true;
        discoveryTime[u] = low[u] = ++time;
        Iterator<Integer> i = adj[u].iterator();
        while (i.hasNext()) {
            int v = i.next();
            if (!visited[v]) {
                children++;
                parent[v] = u;
                articulationPointUtil(v, visited, discoveryTime, low, parent, ap);
                low[u] = Math.min(low[u], low[v]);
                if (parent[u] == NIL && children > 1) {
                    ap[u] = true;
                }
                if (parent[u] != NIL && low[v] >= discoveryTime[u]) {
                    ap[u] = true;
                } else if (v != parent[u]) {
                    low[u] = Math.min(low[u], discoveryTime[v]);
                }
            }
        }
    }

    void articulationPoint() {
        boolean[] vivisted = new boolean[V];
        int[] disc = new int[V];
        int[] low = new int[V];
        int parent[] = new int[V];
        boolean[] ap = new boolean[V];

        Arrays.fill(parent, NIL);
        Arrays.fill(vivisted, false);
        Arrays.fill(ap, false);

        for (int i = 0; i < V; i++) {
            if (!vivisted[i]) {
                articulationPointUtil(i, vivisted, disc, low, parent, ap);
            }

        }
        for (int i = 0; i < V; i++) {
            if (ap[i]) {
                System.out.print(i + " ");
            }
        }

    }
}
