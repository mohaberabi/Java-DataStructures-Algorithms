import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class TarjansAlgorithmImpl2 {
    static int time = 0;

    static void tarjansUtil(ArrayList<ArrayList<Integer>> adj, int u, int[] low, boolean[] stackMember, int[] disc, Stack<Integer> st, ArrayList<ArrayList<Integer>> ans) {

        disc[u] = time;
        low[u] = time;
        time += 1;
        stackMember[u] = true;
        st.push(u);
        int w;
        for (int v : adj.get(u)) {
            if (disc[v] == -1) {
                tarjansUtil(adj, v, low, stackMember, disc, st, ans);
                low[u] = Math.min(low[u], low[v]);
            } else if (stackMember[v]) {
                low[u] = Math.min(low[u], disc[v]);
            }
        }

        w = -1;
        if (low[u] == disc[u]) {
            ArrayList<Integer> component = new ArrayList<>();
            while (w != u) {
                w = st.pop();
                component.add(w);
                stackMember[w] = false;
            }
            ans.add(component);
        }
    }


    static void tarjansAlgorithm(ArrayList<ArrayList<Integer>> adj, int V, ArrayList<ArrayList<Integer>> scc) {
        int[] low = new int[V];
        int[] disc = new int[V];
        boolean[] stackMember = new boolean[V];
        Stack<Integer> st = new Stack<>();
        Arrays.fill(low, -1);
        Arrays.fill(disc, -1);

        for (int i = 0; i < V; i++) {
            if (disc[i] == -1) {
                tarjansUtil(adj, i, low, stackMember, disc, st, scc);
            }
        }

    }


    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        ArrayList<ArrayList<Integer>> scc = new ArrayList<>();

        int V = 5;
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        adj.get(1).add(0);
        adj.get(0).add(2);
        adj.get(2).add(1);
        adj.get(0).add(3);
        adj.get(3).add(4);

        tarjansAlgorithm(adj, V, scc);


        for (ArrayList<Integer> v : scc) {
            for (int u : v) {
                System.out.print(u + " ");
            }
            System.out.println();
        }
    }
}
