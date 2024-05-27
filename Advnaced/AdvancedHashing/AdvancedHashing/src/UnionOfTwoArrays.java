import java.util.HashSet;

public class UnionOfTwoArrays {

    int unionOfTwoArrays ( int [] a , int []b){
        HashSet<Integer> set =  new HashSet<>();



        for (int x : a ){
            set
                    .add(x);
        }

        for ( int x : b){
            set
                    .add(x);
        }


        return  set.size();
    }
}
