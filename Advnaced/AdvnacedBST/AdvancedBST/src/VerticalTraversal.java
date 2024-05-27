import java.lang.reflect.Array;
import java.util.*;

public class VerticalTraversal {
    private static   class Pair{
         Node node ;
         int horizontal ;

         public Pair(Node n , int x){
             node= n ; horizontal= x ;
         }
    }




    void verticalTraversal ( Node root ){
        Queue<Pair> q = new LinkedList<>();
        Map<Integer, ArrayList<Integer>> map = new TreeMap<>();

        q.add(new Pair(root , 0 ));

        while (!q.isEmpty()){
            Pair p = q.poll();
            int horizontal = p.horizontal;
            Node curr = p.node;

            if (map.containsKey(horizontal)){
                map.get(horizontal).add(curr.data);
            }
            else {
                ArrayList<Integer> al = new ArrayList<>();
                al.add(curr.data);
                map.put(horizontal,al);
            }
            if (curr.left!=null){
                q.add( new Pair(curr.left,horizontal-1));
            }
            if(curr.right!=null){
                q.add( new Pair(curr.right,horizontal+1));
            }
        }



        for (Map.Entry<Integer,ArrayList<Integer>> vertical : map.entrySet()){
            ArrayList<Integer> al = vertical.getValue();

            for (int x : al){
                System.out.println(x );
            }
        }

    }
}
