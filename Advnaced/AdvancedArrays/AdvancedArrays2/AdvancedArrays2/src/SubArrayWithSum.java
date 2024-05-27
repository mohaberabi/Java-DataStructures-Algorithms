public class SubArrayWithSum {

    boolean sumInSubArrayNaive ( int []arr ,  int n , int sum ){

        for ( int i = 0 ; i < n ;i ++){
            int curr = 0 ;
            for ( int j =i ;j<n;j++){
              curr +=arr[j];
              if (sum==curr){
                  return true ;
              }
            }
        }
        return false;
    }


    boolean sumInSubArraySlidingWindowOptimal ( int []arr , int n , int sum ){
        int start = 0 ;
        int curr = 0 ;
      for ( int end = 0 ; end < n ; end ++){
          curr+=arr[end];
          while (sum<curr){
              curr-=arr[start];
              start++;
          }
          if (curr==sum){
              return true;
          }

      }


        return false;
    }
}
