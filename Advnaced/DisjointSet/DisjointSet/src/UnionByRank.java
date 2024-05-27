public class UnionByRank {


    int findSimple(int x, int[] par) {
        if (par[x] == x) {
            return x;
        } else {
            return findSimple(par[x], par);
        }
    }


    int findPathCompressed(int x, int[] par) {
        if (par[x] == x) {
            return x;
        }

        par[x] = findPathCompressed(par[x], par);
        return par[x];

    }

    void union(int x, int y, int[] parent, int[] rank) {

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

    public static void main(String[] args) {

    }
}
