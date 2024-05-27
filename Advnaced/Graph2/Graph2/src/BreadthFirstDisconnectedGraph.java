import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstDisconnectedGraph {



    void graphBFS(ArrayList<ArrayList<Integer>>adj , int s,  boolean[]visited ){
        Queue<Integer> q = new LinkedList<>();
        visited[s]=true ;
        q.add(s);
        while (q.isEmpty()==false){

            int u = q.poll();
            System.out.println(u);


            for ( int v : adj.get(u)){
                if (visited[v]==false){
                    q.add(v);
                    visited[v]=true;
                }
            }
        }
    }


    void bfsGraphDisconnected (ArrayList<ArrayList<Integer>>adj ,int V){
        boolean [] visited = new boolean[V+1];
for (int i = 0 ; i < V ; i ++){
    if (!visited[i]){
        graphBFS(adj , i , visited);
    }
}


    }


}
