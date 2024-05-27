import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class CountNumberOfConnectedComponet {





    // how many islands in the graph
    void bfs (ArrayList<ArrayList<Integer>>graph , int v , int s, boolean[]visited ){
        Queue<Integer> q= new LinkedList<>();
        visited[s ]=true ;
        q.add(s);
        while (!q.isEmpty()){
            int u = q.poll();
            System.out.println(u);
            for ( int x : graph.get(u)){
                if(!visited[x]){
                    q.add(x);
                    visited[x]=true ;
                }
            }
        }
    }

    // this can be asked to count number of islands in the graph populer inteview question
    int numberOfConnectedComponents ( ArrayList<ArrayList<Integer>>graph , int v ){
        int count = 0 ;
        boolean[]visited = new boolean[v+1];
        for ( int   i = 0 ; i < v ; i++){
            if (!visited[i]){
                bfs(graph,v,i,visited);
                visited[i]=true ;
                count ++;
            }
        }
        return count ;
    }
}
