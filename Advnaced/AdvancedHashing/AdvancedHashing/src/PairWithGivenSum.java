import java.util.HashSet;

public class PairWithGivenSum {



    boolean hasPairWithSum ( int [ ]arr , int sum ){
        HashSet<Integer> set =  new HashSet<>();


        for ( int x : arr){
            if(set.contains(sum-x)){
                return true ;
            }
            else {
                set.add(x);
            }
        }
        return false;
    }
}
