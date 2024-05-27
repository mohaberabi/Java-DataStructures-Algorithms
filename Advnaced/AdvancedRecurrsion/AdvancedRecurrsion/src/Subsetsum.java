public class Subsetsum{

    int countSubSetsSum( int [] arr , int n , int sum ){


        if ( n==0){
            return sum==0?1:0;
        }
        return countSubSetsSum(arr , n-1 , sum)+
                countSubSetsSum(arr , n-1 , sum - arr[n-1]);
    }
}
