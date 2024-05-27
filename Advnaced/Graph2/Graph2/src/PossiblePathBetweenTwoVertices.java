import java.util.ArrayList;

public class PossiblePathBetweenTwoVertices {


    static int path = 0;


    static void dfsRec(ArrayList<ArrayList<Integer>> adj, boolean[] visited, int source, int destination) {


        visited[source] = true;

        if (source == destination) {
            path++;
        } else {
            for (int v : adj.get(source)) {
                if (!visited[v]) {
                    dfsRec(adj, visited, v, destination);
                }
            }
        }

        visited[source] = false;
    }

    static void dfs(ArrayList<ArrayList<Integer>> adj, int source, int destination, int V) {
        boolean[] visited = new boolean[V];


        dfsRec(adj, visited, source, destination);

    }

    public static void main(String[] args) {

        int V = 5;

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        adj.get(0).add(1);
        adj.get(0).add(2);
        adj.get(0).add(4);
        adj.get(1).add(3);
        adj.get(1).add(4);
        adj.get(2).add(4);
        adj.get(3).add(2);

        dfs(adj, 0, 4, V);
        System.out.println(path);
    }

}
