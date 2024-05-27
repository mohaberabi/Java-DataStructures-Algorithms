public class MaximumSumCirculer {


    int maximumNormal ( int []arr , int n ){
        int maxEnd =arr[0];
        int res  = arr[0];


        for ( int i =1 ; i < n ; i ++){
            maxEnd=Math.max(maxEnd,maxEnd+arr[i]);
            res = Math.max(res , maxEnd);
        }

    return res ;
    }

    int maximumSumCirculer( int arr[] ,int n ){
        int normalMax  = maximumSumCirculer(arr, n );

        if (normalMax<0){
            return normalMax;
        }

        int totalSum = 0 ;
        for ( int i =0 ; i < n ; i++){
            totalSum+=arr[i];
            arr[i]= - arr[i];
        }

        int maximumcirculer  = totalSum +maximumNormal(arr , n );

        return  Math.max(maximumcirculer,normalMax);
    }
}
