public class SortedArrayToalternateSorted {

    static  void sortedToAlternateSorted ( int [] arr , int n ){


        int max = n-1 ;
        int min = 0 ;



        for ( int i = 0 ; i < n ; i ++){
            swap(arr , max , min);
            max --;
            min ++;
        }


    }

    static  void swap ( int [] arr , int i , int j ){
        int temp = arr[i];
        arr [i]= arr[j];
        arr[j]= temp ;
    }
}
