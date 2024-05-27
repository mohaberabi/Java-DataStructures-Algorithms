public class BubbleSort {



    public static void bubbleSortBetter  (int [] arr ){
        int n = arr.length;
        boolean swapped = false ;
        for ( int i = 0 ; i < n-1 ; i++){
            for ( int j = 0 ; j  < n-i -1 ;j++){
                if (arr[j]>arr[j+1]){
                    swap( arr , j ,j+1  );
                    swapped=true ;
                }


            }

            if (!swapped){break;}
        }
    }

    public static void bubbleSort (int [] arr ){
        int n = arr.length;
        for ( int i = 0 ; i < n-1 ; i++){
            for ( int j = 0 ; j  < n-i -1 ;j++){
                if (arr[j]>arr[j+1]){
                    swap( arr , j ,j+1  );
                }


            }
        }
    }

    private static void swap ( int []  arr , int a , int b ){
        int temp = arr [a] ;
        arr [a]= arr [b]  ;
        arr [b] = temp;
    }
}
