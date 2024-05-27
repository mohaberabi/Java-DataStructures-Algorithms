public class equilibreamPoint {





    boolean isEquilieOptimal(int arr [] , int n ){


        int right = 0 ;


        for ( int i = 0 ; i < n ; i ++){
            right +=arr[i];
        }

        int left = 0 ;
        for ( int i = 0 ; i < n ; i++){

            right-=arr[i];

            if (left == right){return  true ; }

            left +=arr[i];
        }
        return  false ;
    }

    boolean isEquili (int arr [] , int n ){
        for ( int i =0 ;i<n ; i ++){
            int left = 0 ;
            int right = 0 ;
            for ( int j  =0 ; j< i ;j++){
                left +=arr[j];
            }
            for ( int k = i+1 ;  k <n ; k++){
                right +=arr[k];
            }
            if (left==right)
            {return  true ; }
        }
        return false ;
    }
}
