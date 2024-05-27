import java.util.Arrays;

public class DijkstrasAlgorithm {

// this qudaratic time complexity ant not the best optimal solution

    int[] dijkstras(int[][] graph, int src) {
        int V = graph.length;


        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[0] = 0;

        boolean[] done = new boolean[V];

        for (int count = 0; count < V - 1; count++) {
            int u = -1;

            for (int i = 0; i < V; i++) {
                if (!done[i] && (u == -1 || dist[i] < dist[u])) {
                    u = i;
                }
            }
            done[u] = true;
            for (int v = 0; v < V; v++) {
                if (!done[v] && graph[u][v] != 0) {
                    dist[u] = Math.min(dist[u], dist[u] + graph[u][v]);
                }
            }
        }
        return dist;

    }
}
