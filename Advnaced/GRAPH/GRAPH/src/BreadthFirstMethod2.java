import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstMethod2 {







    private void graphBfsMethod2 (ArrayList<ArrayList<Integer>> graph , int v , int s , boolean[]visited ){

        visited[s]=true ;
        Queue<Integer>q= new LinkedList<>();
        q.add(s);

        while (!q.isEmpty()){
            int u = q.poll();
            System.out.println(u);
            for( int x : graph.get(u)){
                if (!visited[x]){
                    q.add(x);
                    visited[x]= true ;
                }
            }
        }
    }


    public void graphBFSWhenNotConnected (ArrayList<ArrayList<Integer>> graph , int v  ){
        boolean[]visited = new boolean[v+1];
        Arrays.fill(visited,false );
        for ( int  i = 0 ; i < v ; i ++){
            if(!visited[i]){
                graphBfsMethod2(graph , v , i , visited);

            }
        }
    }
}
