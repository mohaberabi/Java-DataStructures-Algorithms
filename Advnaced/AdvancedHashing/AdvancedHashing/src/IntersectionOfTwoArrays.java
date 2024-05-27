import java.util.HashSet;

public class IntersectionOfTwoArrays {

    int intersectionOFTwoArrays (int [ ]a ,int[] b , int m , int n ){


        HashSet<Integer> set =  new HashSet<>();


        for ( int i = 0 ; i < m;i++){
            set.add(a[i]);
        }
        int res = 0 ;
        for ( int x : b ){

            if(set.contains(x)){
                res ++;
                set.remove(x);
            }
        }
return  res ;
    }
}
