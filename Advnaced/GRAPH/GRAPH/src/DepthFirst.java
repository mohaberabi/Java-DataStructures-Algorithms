import java.util.ArrayList;
import java.util.Arrays;

public class DepthFirst {


    void dfsRec(ArrayList<ArrayList<Integer>> graph, int s, boolean[] visited) {

        System.out.println(s);
        visited[s] = true;

        for (int x : graph.get(s)) {
            if (!visited[x]) {
                dfsRec(graph, x, visited);
            }
        }
    }


    void dfsNotConnectedGraph(ArrayList<ArrayList<Integer>> graph, int s, int v) {
        boolean[] visited = new boolean[v];
        for (int i = 0; i < v; i++) {
            if (!visited[i]) {
                dfsRec(graph, i, visited);
            }

        }
    }
}
