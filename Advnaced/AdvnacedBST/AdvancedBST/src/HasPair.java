import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class HasPair {


boolean pairHasSum2  (Node root , HashSet<Integer>s , int sum  ){

    if (root==null){
        return false;
    }

    if (pairHasSum2(root.left, s, sum)){
        return  true ;
    }
   if(s.contains(sum-root.data)){
       return true ;
   }
   else {
       s.add(root.data);
   }
    return pairHasSum2(root.right,s , sum);

}

    boolean hasPairMethod1 (Node root, int sum ){

        ArrayList<Integer>inOrder = new ArrayList<>();
        storeInOrder(root , inOrder);


        int left = 0 ;
        int right = inOrder.size()-1;
        while (left < right ){
            int x = inOrder.get(left)+inOrder.get(right);
            if(x==sum){
                return true ;
            }

            else if (x>sum){
                right -- ;
            }
            else {
                left ++;
            }

        }
        return false;
    }



    void storeInOrder(Node root , ArrayList<Integer>al){

        if (root==null){
            return;
        }
        storeInOrder(root.left,al);
        al.add(root.data);
        storeInOrder(root.right,al);
    }
}
