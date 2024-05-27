import java.util.ArrayList;
import java.util.Collections;

public class LeadersOfArray {


    void leadersOfArray (int arr [] ,int n  ){
        int  leader = arr[n-1];

        ArrayList<Integer> list  = new ArrayList<>();
        list.add(leader);
        System.out.println(leader);
        for ( int i = n-2 ; i >=0; i--){
            if (leader < arr[i]){
                leader = arr[i];
                System.out.println(leader);
                list.add(leader);
            }
        }
     Collections.reverse(list);
    }
void leadersOfArrayNaive( int []arr , int n ){

        for ( int i = 0 ; i < n ; i ++){
            boolean flag = false;
            for ( int j = i +1 ; j <n ;  j++){
                if (arr[i]<=arr[j]){
                    flag = true;
                    break;
                }

            }
            if (!flag){
                System.out.println(arr[i]);

            }
        }
}
}
