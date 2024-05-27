import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class DijkstrasAlgorithm {


    static int[] disjkstraSimple(int[][] graph, int V, int src) {


        int[] dist = new int[V];


        Arrays.fill(dist, Integer.MAX_VALUE);

        boolean[] done = new boolean[V];

        dist[src] = 0;

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
                    dist[v] = Math.min(dist[v], dist[u] + graph[u][v]);
                }
            }

        }

        return dist;
    }

    static void dijkstraOptimized(int[][] graph, int V, int src) {
        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[0] = 0;
        boolean[] visited = new boolean[V];
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.comparingInt(a -> dist[a]));
        pq.add(src);
        while (!pq.isEmpty()) {
            int u = pq.poll();
            if (!visited[u]) {
                visited[u] = true;
                for (int v = 0; v < V; v++) {
                    if (!visited[v] && graph[u][v] > 0 && dist[u] + graph[u][v] < dist[v]) {
                        dist[v] = dist[u] + graph[u][v];
                        pq.add(v);
                    }
                }
            }

        }

        for (int i : dist) {
            System.out.println(i);
        }

    }

    public static void main(String[] args) {
        int V = 4;
        int[][] graph = new int[][]{
                {0, 5, 10, 0},
                {5, 0, 3, 20},
                {10, 3, 0, 2},
                {0, 20, 2, 0},
        };
        //        int[][] graph = new int[][]{
        //                {0, 10, 0, 5, 0},
        //                {0, 0, 1, 2, 0},
        //                {0, 0, 0, 0, 4},
        //                {0, 3, 9, 0, 2},
        //                {7, 0, 6, 0, 0}
        //        };
        int src = 0;

        dijkstraOptimized(graph, V, src);


        int[] simpleDijsktras = disjkstraSimple(graph, V, 0);
        for (int i : simpleDijsktras) {
            System.out.println(i);
        }
    }
}


