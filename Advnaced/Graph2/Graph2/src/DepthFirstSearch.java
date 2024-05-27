import java.util.ArrayList;

public class DepthFirstSearch {



    void dfsREc(ArrayList<ArrayList<Integer>>adj , int s , boolean[]visited ){

        visited[s] = true ;
        System.out.println(s);
        for (int u : adj.get(s)){
            dfsREc(adj , u , visited);
        }

    }



    void graphDFS( ArrayList<ArrayList<Integer>>adj , int s, int V ){
        boolean []visited = new boolean[V];

        for( int i = 0 ; i < V ; i ++){
            if(!visited[i]){
                dfsREc(adj , s , visited);

            }
        }
    }
}
