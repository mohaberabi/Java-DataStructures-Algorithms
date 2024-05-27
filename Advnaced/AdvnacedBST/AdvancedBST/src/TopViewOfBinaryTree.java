import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class TopViewOfBinaryTree {

    private static   class Pair{
        Node node ;
        int horizontal ;

        public Pair(Node n , int x){
            node= n ; horizontal= x ;
        }
    }





    void topView ( Node root ){

        Queue<Pair> q = new LinkedList<>();

        Map<Integer,Integer> map = new HashMap<>();

        q.add( new Pair(root , 0));

        while (!q.isEmpty()){
            Pair p = q.poll();

            Node node = p.node;
            int hd = p.horizontal;

            if (!map.containsKey(hd)){
                map.put(hd , node.data);
            }
            if(node.left!=null){
                q.add(new Pair(node.left,hd -1 ));
            }
            if (node.right!=null){
                q.add(new Pair(node.right,hd +1 ));
            }
        }


        for (Map.Entry view : map.entrySet()){

            System.out.println(view.getValue());
        }
    }
}
