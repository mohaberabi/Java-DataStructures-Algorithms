import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstMethod1 {


    void graphBreadthFirstMethod1(ArrayList<ArrayList<Integer>> graph, int v, int s) {
        boolean[] visited = new boolean[v + 1];


        Queue<Integer> q = new LinkedList<>();
        q.add(s);
        visited[s] = true;


        while (!q.isEmpty()) {
            int u = q.poll();
            System.out.println(u);
            for (int x : graph.get(u)) {
                if (!visited[x]) {
                    visited[x] = true;
                    q.add(x);
                }
            }

        }

    }
}
