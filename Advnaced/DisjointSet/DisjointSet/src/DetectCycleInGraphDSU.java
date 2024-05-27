import java.util.ArrayList;

public class DetectCycleInGraphDSU {


    int find(int x, int[] par) {
        if (par[x] == x) {
            return x;
        } else {
            par[x] = find(x, par);
            return par[x];
        }
    }


    void union(int x, int y, int[] parent, int[] rank) {
        int xRep = find(x, parent);
        int yRep = find(y, parent);

        if (xRep != yRep) {
            if (rank[xRep] > rank[yRep]) {
                parent[yRep] = xRep;
            } else if (rank[yRep] > rank[xRep]) {
                parent[xRep] = yRep;
            } else {
                parent[yRep] = xRep;
                rank[xRep]++;
            }
        }
    }


    int detectCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        int[] parent = new int[V];
        int[] rank = new int[V];
        int[] p = new int[V];
        for (int i = 0; i < V; i++) {
            parent[i] = i;
        }
        for (int i = 0; i < V; i++) {
            for (Integer e : adj.get(i)) {
                if (p[e] == i) {
                    continue;
                }
                p[e] = i;
                int xRep = find(i, parent);
                int yRep = find(e, parent);
                if (xRep == yRep) {
                    if (p[i] != e) {
                        return 1;
                    } else {
                        union(i, e, parent, rank);
                    }
                }
            }
        }
        return 0;
    }
}
