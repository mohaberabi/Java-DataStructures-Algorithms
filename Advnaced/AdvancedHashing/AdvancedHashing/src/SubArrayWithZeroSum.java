import java.util.HashSet;

public class SubArrayWithZeroSum {



    boolean subArrayWithZero (int  [] arr , int n ){
        int prefixSum =0 ;


        HashSet<Integer> set= new HashSet<>();

        for ( int  i = 0 ; i < n ; i++){
            prefixSum+=arr[i];
            if(set.contains(prefixSum)){
                return true ;
            }
            if(prefixSum==0){
                return true ;
            }
            set.add(prefixSum);
        }
        return false ;
    }
}
