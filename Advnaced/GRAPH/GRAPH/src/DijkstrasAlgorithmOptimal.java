import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class DijkstrasAlgorithmOptimal {


    int[] dijkstras(ArrayList<ArrayList<Integer>> adj, int src, int V) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;
        pq.add(src);

        while (!pq.isEmpty()) {
            int u = pq.poll();

            for (int v : adj.get(u)) {
                int weght = adj.get(u).get(v);
                int newDist = dist[u] + weght;
                if (newDist < dist[v]) {
                    dist[v] = newDist;
                    pq.add(v);
                }
            }
        }
        return dist;
    }
}
