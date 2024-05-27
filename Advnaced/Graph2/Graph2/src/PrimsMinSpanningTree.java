import java.util.Arrays;

public class PrimsMinSpanningTree {


    static int minimumSpanningTreePrimsAlgorithm(int[][] graph, int V) {
        int[] key = new int[V];

        Arrays.fill(key, Integer.MAX_VALUE);
        key[0] = 0;

        boolean[] mst = new boolean[V];
        int res = 0;


        for (int count = 0; count < V; count++) {

            int u = -1;
            for (int i = 0; i < V; i++) {
                if (!mst[i] && (u == -1 || key[i] < key[u])) {
                    u = i;
                }
            }
            mst[u] = true;
            res += key[u];

            for (int v = 0; v < V; v++) {

                if (!mst[v] && graph[u][v] != 0 && graph[u][v] < key[v]) {
                    key[v] = graph[u][v];
                }
            }
        }


        return res;

    }

    public static void main(String[] args) {

        int[][] graph = {{3, 3, -0}, {0, 1, 5}, {1, 2, 3}, {0, 2, 1}};


        int res = minimumSpanningTreePrimsAlgorithm(graph, 3);
        System.out.println(res);


    }
}
