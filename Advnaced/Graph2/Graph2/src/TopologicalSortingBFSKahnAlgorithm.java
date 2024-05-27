import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class TopologicalSortingBFSKahnAlgorithm {


    static void topologicalSorting(ArrayList<ArrayList<Integer>> adj, int V) {
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
            System.out.println(u);
            for (int v : adj.get(u)) {
                indegree[v]--;
                if (indegree[v] == 0) {
                    q.add(v);
                }
            }
        }
    }

    public static void main(String[] args) {
        int V = 5;

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        adj.get(0).add(2);
        adj.get(0).add(3);
        adj.get(1).add(3);
        adj.get(1).add(4);
        adj.get(2).add(3);


        topologicalSorting(adj, V);
    }
}
