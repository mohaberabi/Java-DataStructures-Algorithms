public class MaximumSubArrays {



    int maxSumOptimal (int arr [],int n ){


        if (n == 0) {
            return 0;
        }

        int res = arr[0];
        int maxEnd = arr[0];

        for (int i = 1; i < n; i++) {
            maxEnd = Math.max(arr[i], maxEnd + arr[i]);
            res = Math.max(res, maxEnd);
        }

        return res;
    }


    int maxSumNaive(int [] arr , int n ){
        int res =arr[0];



        for ( int i = 0 ; i < n ; i ++){
            int curr =0 ;


            for ( int j = i ; j < n ;j ++){

                curr = curr+arr[j];
                res = Math.max(res , curr);

            }
        }
        return res ;
    }
}
