public class BinarySearch {





    int binSearchIterative ( int []arr , int x ){


        int left = 0 ; int right = arr.length-1;

        while (left <= right ){

            int mid = (left + right )/2 ;

            if (mid ==x ){
                return mid ;
            }
            else if (arr [mid]>x  ){
                right = mid -1 ;

            }
            else {
                left = mid +1 ;
            }
        }
        return -1;
    }
    int binSearchRecursive ( int []arr , int x  , int left , int right ){

        if (left > right){
            return -1;
        }


        int mid =  (right + left )/2 ;

        if (arr[mid ] ==x ){
            return mid;
        }
        else if (arr[mid]>x ){
            return binSearchRecursive(arr ,x,  left , mid -1 );
        }

        else {
            return binSearchRecursive(arr ,x,  mid +1 , right );

        }
    }
}
