import java.lang.reflect.Array;
import java.util.ArrayList;

public class AddEdge {


    void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {

        adj.get(u).add(v);
        adj.get(v).add(u);
    }


    void mockGraph() {
        int v = 4;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<>());
        }

        addEdge(adj, 0, 1);
        addEdge(adj, 0, 2);
        addEdge(adj, 1, 2);
        addEdge(adj, 1, 3);

    }


    void printGraph(ArrayList<ArrayList<Integer>> al) {
        for (int i = 0; i < al.size(); i++) {
            for (int j = 0; j < al.get(i).size(); j++) {
                System.out.print(al.get(i).get(j));
            }
            System.out.println();
        }
    }
}
