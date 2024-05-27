import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class BrigesInGraph2 {

    static void DFS(ArrayList<ArrayList<Integer>> adj, int v, boolean visited[]) {
        visited[v] = true;

        for (int i = 0; i < adj.get(v).size(); ++i)

            if (!visited[adj.get(v).get(i)])
                DFS(adj, adj.get(v).get(i), visited);
    }

    static boolean isConnected(ArrayList<ArrayList<Integer>> adj, int V, int one, int two) {

        boolean visited[] = new boolean[V];

        DFS(adj, one, visited);

        if (!visited[two])
            return false;
        return true;
    }

    public static int isBridge(int V, ArrayList<ArrayList<Integer>> adj, int c, int d) {
        if (!isConnected(adj, V, c, d))
            return 0;
        else {
            adj.get(c).remove(d);
            adj.get(d).remove(c);

            if (isConnected(adj, V, c, d))
                return 0;
            else
                return 1;
        }
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int V = 4;
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        adj.get(0).add(1);
        adj.get(1).add(2);
        adj.get(2).add(3);

        int c = 1;
        int d = 2;
        int result = isBridge(V, adj, c, d);
        System.out.println(result);

    }

}
