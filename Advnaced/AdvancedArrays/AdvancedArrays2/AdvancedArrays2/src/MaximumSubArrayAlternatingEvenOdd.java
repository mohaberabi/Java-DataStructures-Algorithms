public class MaximumSubArrayAlternatingEvenOdd {



    int maxEvenOddOptimal ( int [] arr , int n ){
        int res =1 ;
        int curr =1 ;

        for ( int j =1 ; j < n ; j ++){

            if ( (arr[j]%2==0&&arr[j-1]%2!=0)||arr[j]%2!=0&&arr[j-1]%2==0  ){
                curr++;

                res = Math.max(res , curr);
            }
            else {
              curr =1 ;
            }




        }
        return res ;
    }



    int maxEvenOddNaive ( int []arr , int n ){
        int res =1 ;



        for ( int i =1 ; i < n ; i ++){
             int curr =1 ;
             for ( int j = i+1 ; j <n ; j++){


                 if ( (arr[j]%2==0&&arr[j-1]%2!=0)||arr[j]%2!=0&&arr[j-1]%2==0  ){
                     curr++;
                 }
                 else {
                     break ;
                 }


             }
             res = Math.max(res , curr);
        }
        return res ;

    }
}
