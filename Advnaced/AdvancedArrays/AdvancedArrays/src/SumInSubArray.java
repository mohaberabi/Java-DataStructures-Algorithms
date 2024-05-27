public class SumInSubArray {










    boolean sumExistInSubArrayNaive ( int [] arr , int n , int sum ){

        for ( int i = 0 ; i < n ; i ++){
            int ans = 0;
            for ( int j = i ; j < n ;j++){

                ans +=arr[j];

                if (ans == sum){
                    return true ;
                }
            }
        }
        return false;
    }
    boolean sumExistInSubArrayOptimal (int  [] arr , int n , int sum ){

        int s = 0 ;
        int ans = 0 ;



        for ( int i = 0 ;i <n;i++){
            ans +=arr[i];

            while (sum<ans){

                ans+=arr[s];
                s++;
            }
            if (ans ==sum){
                return true ;
            }
        }
        return false;
    }
}
