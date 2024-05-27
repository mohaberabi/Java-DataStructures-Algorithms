package hashing;

import java.util.HashSet;

public class SubArrayContainsSum {


    public    static boolean subArrayHasSum (int[]array , int num ){
        HashSet<Integer> h = new HashSet<Integer>();
        int sum = 0 ;
        for ( int i : array){

           sum+=i;
            if (h.contains(sum)){
                return  true ;
            }
            if (sum==num){
                return  true ;
            }
            h.add(sum);

        }
        return false;

    }
}
