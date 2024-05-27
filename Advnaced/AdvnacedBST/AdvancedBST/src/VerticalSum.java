import java.util.Map;
import java.util.TreeMap;

public class VerticalSum {




   private void verticalSum (Node root , int horizontal , TreeMap<Integer,Integer>map ){

        if (root==null){
            return;
        }

        verticalSum(root.left,-1 , map);

        int sum = map.get(horizontal)==null?0:map.get(horizontal);
        map.put(horizontal,sum+root.data );

    verticalSum(root.right , horizontal+1,map );

    }

    public void verticalSum ( Node root ){
       TreeMap<Integer,Integer> map = new TreeMap<>();

       verticalSum(root , 0 , map );
       for (Map.Entry<Integer,Integer> sum : map.entrySet()){
           System.out.println(sum +" ");
       }

    }
}
