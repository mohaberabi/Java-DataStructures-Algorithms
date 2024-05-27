public class LeftRotateArray {



    void leftRotoateByOne ( int []arr , int n ){
        int temp = arr[0];


        for ( int i =1 ; i < n ; i ++){
            arr[i-1]= arr[i];
        }

        arr[n-1]=temp ;
    }




    void leftRotateByD1( int []arr , int n , int d ){
        for ( int i =0 ; i < d ;i ++){
            leftRotoateByOne(arr ,n );
        }
    }
    void leftRotateByD2(int []arr , int n  , int d ){
        int [] temp = new int [d];


        for ( int i =0 ; i<d ; i++){
            temp[i]=arr[i];
        }

        for ( int i =d ; i <n ; i++){
            arr[i-d]= arr[i];
        }
        for ( int i = 0 ; i < n ; i ++){
            arr[n-d+i]=arr[i];
        }
    }


    void swap( int []arr , int i , int j ){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp ;
    }


    void reverse (int high , int low , int []arr ){


        while (low < high ){
            swap(arr , low , high);
        }
    }
    void leftRotateByDOptimal (int []arr , int n , int d ){
        reverse( 0 , d-1 , arr  );
        reverse(d , n-1 , arr );
        reverse(0,n-1,arr);
    }

}
