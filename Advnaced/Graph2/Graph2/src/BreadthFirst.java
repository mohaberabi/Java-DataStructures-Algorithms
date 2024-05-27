import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirst {



    void graphBFS(ArrayList<ArrayList<Integer>>adj , int s, int V ){
        boolean [] visited = new boolean[V+1];
        Queue<Integer>q = new LinkedList<>();
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
}
