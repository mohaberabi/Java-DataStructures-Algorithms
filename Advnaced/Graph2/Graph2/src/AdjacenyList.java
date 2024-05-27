import java.util.ArrayList;
import java.util.List;

public class AdjacenyList {


    public void addEdge(ArrayList<ArrayList<Integer>> adj, int v, int u) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }


    public void printRgraph(ArrayList<ArrayList<Integer>> adj) {
        for (int i = 0; i < adj.size(); i++) {
            for (int j = 0; j < adj.get(i).size(); j++) {
                System.out.print(adj.get(i).get(j));
            }
            System.out.println();
        }
    }

    static public List<List<Integer>> printGraph(int V, int edges[][]) {


        List<List<Integer>> list = new ArrayList();

        for (int i = 0; i < V; i++) {
            list.add(new ArrayList<>());
        }

        for (int i = 0; i < V; i++) {
            for (int j = 0; j < edges[i].length; j++) {
                list.get(i).add(j);
                list.get(j).add(i);
            }
        }

        return list;


    }

    public static void main(String[] args) {
//        int [][] edges = {(0,1),(0,4),(4,1),(4,3),(1,3),(1,2),(3,2)}

        int[][] edges = {{1, 4}, {1, 0}, {}};

    }
}
