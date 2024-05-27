public class SlidingWindow {


    int subArrayWithMaxSum (int [] arr , int n , int k  ){
        int res = Integer.MIN_VALUE;
        for ( int i = 0 ; i < n ; i ++){
            int curr = 0;

            for ( int j = 0 ;j<k;j++ ){
                curr+=arr[i+j];
                res = Math.max(res , curr);
            }

        }
        return res ;
    }
    int subArrayWithMaxSlidingWindow (int arr [] , int k , int n ){
        int curr = 0 ;
        for ( int i = 0 ; i < k ; i ++){
            curr +=arr[i];
        }
        int res = curr ;
        for ( int i = k ; i <n ; i++){
            curr = curr+(arr[i]-arr[i-k]);
            res = Math.max(res ,curr);
        }
        return res ;
    }
}
