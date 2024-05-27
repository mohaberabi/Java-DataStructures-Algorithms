import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class ShortestPathUsingTopologicalSorting {


    void printShortestPathUsingTopological(ArrayList<ArrayList<Integer>> adj, int V, int s) {

        int[] topo = topologicalSorting(adj, V);

        int[] distances = new int[V];

        Arrays.fill(distances, Integer.MAX_VALUE);

        distances[s] = 0;

        for (int u : topo) {
            for (int v : adj.get(u)) {
                if (distances[u] + 1 < distances[v]) {
                    distances[v] = distances[u] + 1;
                }
            }
        }


        for (int i = 0; i < distances.length; i++) {
            System.out.println(distances[i]);
        }
    }


    int[] topologicalSorting(ArrayList<ArrayList<Integer>> adj, int V) {


        int tIdx = 0;
        int[] topological = new int[V];


        int[] indegree = new int[V];


        for (int i = 0; i < V; i++) {

            for (int v : adj.get(i)) {
                indegree[v]++;
            }


        }

        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < indegree.length; i++) {

            if (indegree[i] == 0) {
                q.add(i);
            }
        }

        while (!q.isEmpty()) {
            int u = q.poll();
            topological[tIdx] = u;
            tIdx++;
            for (int v : adj.get(u)) {
                indegree[v]--;
                if (indegree[v] == 0) {
                    q.add(v);
                }
            }
        }

        return topological;
    }
}

