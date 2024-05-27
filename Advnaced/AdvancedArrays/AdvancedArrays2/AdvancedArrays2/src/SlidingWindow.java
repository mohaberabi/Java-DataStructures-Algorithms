import java.util.*;

public class SlidingWindow {


    int maxSumOfConsecutiveElements ( int []arr , int n , int k ){
        int curr = 0 ;
        for ( int i = 0 ; i < k ; i ++){
            curr +=arr[i];
        }
        int res = curr ;
        for ( int i = k ; i <n ; i++){
            curr+=(arr[i]-arr[i-k]);
            res = Math.max(res , curr);
        }



        return res ;
    }
}
