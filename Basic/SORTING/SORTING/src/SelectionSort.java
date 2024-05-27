public class SelectionSort {


    public static void selectionSort ( int []arr ){

        for ( int i = 0 ; i < arr.length ; i ++){ 
            int minIdx = i ;
            for ( int j = i+1 ; j < arr.length;j++){
                if (arr[j]<arr[minIdx]){
                    minIdx = j ;
                }
            }
            swap(arr,minIdx,arr[i]);
        }
    }

    private static void swap ( int []  arr , int a , int b ){
        int temp = arr [a] ;
        arr [a]= arr [b]  ;
        arr [b] = temp;
    }

}
