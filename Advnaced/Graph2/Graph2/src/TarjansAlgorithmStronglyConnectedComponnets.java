import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class TarjansAlgorithmStronglyConnectedComponnets {


    int V;
    int time;

    LinkedList<Integer> adj[];


    public TarjansAlgorithmStronglyConnectedComponnets(int v) {
        this.V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<>();
            time = 0;
        }
    }


    void addEdge(int u, int v) {
        adj[v].add(u);
    }


    void tarjansUtil(int u, int low[], int[] disc, boolean[] stackMember, Stack<Integer> st) {
        disc[u] = time;
        low[u] = time;
        time += 1;
        stackMember[u] = true;
        st.push(u);
        Iterator<Integer> i = adj[u].iterator();
        int n;
        while (i.hasNext()) {
            n = i.next();
            if (disc[n] == -1) { // Corrected this line
                tarjansUtil(n, low, disc, stackMember, st);
                low[u] = Math.min(low[u], low[n]);
            } else if (stackMember[n]) {
                low[u] = Math.min(low[u], disc[n]);
            }
        }
        int w = -1;
        if (low[u] == disc[u]) {
            while (w != u) {
                w = st.pop();
                System.out.print(w + " ");
                stackMember[w] = false;
            }
            System.out.println();
        }
    }


    void tarjansAlgorithm() {
        int[] discoveryTime = new int[V];
        int[] low = new int[V];
        Arrays.fill(discoveryTime, -1);
        Arrays.fill(low, -1);

        boolean[] stackMember = new boolean[V];

        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < V; i++) {
            if (discoveryTime[i] == -1) {
                tarjansUtil(i, low, discoveryTime, stackMember, st);

            }
        }
    }


    public static void main(String[] args) {
        TarjansAlgorithmStronglyConnectedComponnets tarjans = new TarjansAlgorithmStronglyConnectedComponnets(5);

        tarjans.addEdge(1, 0);
        tarjans.addEdge(0, 2);
        tarjans.addEdge(2, 1);
        tarjans.addEdge(0, 3);
        tarjans.addEdge(3, 4);
        tarjans.tarjansAlgorithm();


    }
}
