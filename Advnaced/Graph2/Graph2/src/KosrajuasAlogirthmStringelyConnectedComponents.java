import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class KosrajuasAlogirthmStringelyConnectedComponents {


    static int stronglyConnecteComponents(ArrayList<ArrayList<Integer>> adj, int V) {

        ArrayList<ArrayList<Integer>> strongleyconnected = new ArrayList<>();
        Stack<Integer> s = new Stack<>();
        boolean[] visited = new boolean[V];

        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                fillStack(adj, i, s, visited);

            }

        }
        ArrayList<ArrayList<Integer>> transpose = getTranspose(adj, V);
        Arrays.fill(visited, false);
        while (!s.isEmpty()) {
            int u = s.pop();
            if (!visited[u]) {
                ArrayList<Integer> component = new ArrayList<>();
                dfsRec(transpose, visited, u, component);
                strongleyconnected.add(component);
//                System.out.println();
            }
        }
        return strongleyconnected.size();
    }


    static void dfsRec(ArrayList<ArrayList<Integer>> adj, boolean[] visited, int u, ArrayList<Integer> comp) {
        visited[u] = true;
        comp.add(u);
//        System.out.print(u + " ");

        for (int v : adj.get(u)) {
            if (!visited[v]) {
                dfsRec(adj, visited, v, comp);
            }
        }
    }

    static ArrayList<ArrayList<Integer>> getTranspose(ArrayList<ArrayList<Integer>> adj, int V) {

        ArrayList<ArrayList<Integer>> tr = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            tr.add(new ArrayList<>());
        }
        for (int v = 0; v < V; v++) {
            for (int u : adj.get(v)) {
                tr.get(u).add(v);
            }
        }

        return tr;
    }


    static void fillStack(ArrayList<ArrayList<Integer>> adj, int u, Stack<Integer> st, boolean[] visited) {
        visited[u] = true;
        for (int v : adj.get(u)) {
            if (!visited[v]) {
                fillStack(adj, v, st, visited);
            }
        }
        st.push(u);
    }

    public static void main(String[] args) {
        int V = 6;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        adj.get(5).add(5);
        adj.get(1).add(0);
        adj.get(0).add(2);
        adj.get(2).add(1);
        adj.get(3).add(4);
        int res = stronglyConnecteComponents(adj, V);
        System.out.println(res);

    }

}
