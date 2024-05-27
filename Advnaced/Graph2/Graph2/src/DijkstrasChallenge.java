import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class DijkstrasChallenge {

    static int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int S) {


        int graph[][] = buildGraph(V, adj);

        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[0] = 0;

        boolean[] done = new boolean[V];

        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.comparingInt(a -> dist[a]));

        pq.add(S);

        while (pq.isEmpty() == false) {
            int u = pq.poll();
            if (!done[u]) {
                done[u] = true;
                for (int v = 0; v < V; v++) {
                    if (!done[v] && graph[u][v] != 0 && dist[u] + graph[u][v] < dist[v]) {

                        dist[v] = graph[u][v];
                        pq.add(v);
                    }
                }
            }
        }

        return dist;

    }


    static int[][] buildGraph(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj) {
        int[][] graph = new int[V][V];

        for (int i = 0; i < V; i++) {
            for (ArrayList<Integer> edge : adj.get(i)) {
                int neighbor = edge.get(0);
                int weight = edge.get(1);
                graph[i][neighbor] = weight;
                graph[neighbor][i] = weight; // Since it's an undirected graph
            }
        }

        return graph;
    }
}
