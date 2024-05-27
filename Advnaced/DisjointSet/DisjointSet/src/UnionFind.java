import java.util.ArrayList;

public class UnionFind {


    int n = 5;
    int[] parent = new int[n];


    void init() {

        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }
    }

    int find(int x) {
        if (parent[x] == x) {
            return x;
        } else {
            return find(parent[x]);
        }
    }


    void union(int x, int y) {
        int xRep = find(x);
        int yRep = find(y);
        if (xRep == yRep) {
            return;
        } else {
            parent[yRep] = xRep;
        }
    }
}
