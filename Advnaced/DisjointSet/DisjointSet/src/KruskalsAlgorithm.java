import java.util.Arrays;

public class KruskalsAlgorithm {


    static int minimumSpanningTree(Edge[] graph, int V) {


        Arrays.sort(graph);

        int[] parent = new int[V];
        int[] rank = new int[V];
//

        for (int i = 0; i < V; i++) {
            parent[i] = i;
        }
        int res = 0;

        for (int i = 0, s = 0; s < V - 1; i++) {
            Edge e = graph[i];
            int x = find(e.source, parent);

            int y = find(e.distination, parent);


            if (x != y) {
                res += e.weight;
                union(x, y, parent, rank);
                s++;
            }

        }

        return res;


    }

    static void union(int x, int y, int[] parent, int[] rank) {

        int xRep = parent[x];
        int yRep = parent[y];

        if (xRep == yRep) {
            return;
        }

        if (rank[xRep] > rank[yRep]) {

            parent[yRep] = xRep;
        } else if (rank[yRep] > rank[xRep]) {
            parent[xRep] = yRep;
        } else {
            parent[yRep] = xRep;
            rank[xRep]++;
        }
    }

    static int find(int x, int[] par) {
        if (par[x] == x) {
            return x;
        }

        par[x] = find(par[x], par);
        return par[x];

    }


    public static void main(String[] args) {


        Edge e1 = new Edge(0, 2, 8);
        Edge e2 = new Edge(2, 4, 12);
        Edge e3 = new Edge(4, 3, 15);
        Edge e4 = new Edge(3, 1, 3);
        Edge e5 = new Edge(1, 0, 10);
        Edge e6 = new Edge(2, 3, 4);
        Edge e7 = new Edge(1, 2, 5);


        Edge[] graph = {e1, e2, e3, e4, e5, e6, e7};


        int minimumSpanningTree = minimumSpanningTree(graph, 5);
        System.out.println(minimumSpanningTree);

    }
}
