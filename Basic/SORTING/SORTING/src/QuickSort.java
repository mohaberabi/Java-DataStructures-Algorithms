import java.util.Random;

public class QuickSort {
    public static void naivePartition (int []arr , int l , int h , int pivot ){

        int index = 0 ;
        int [] temp = new int  [h-l+1] ;
        for ( int i = l ; i <= h ; i++){
            if (arr[i]<=arr[pivot]){
                temp[index]= arr[i];
                index++;
            }
        }
        for ( int i = l ; i <= h ; i++){
            if (arr[i]>arr[pivot]){
                temp[index]= arr[i];
                index++;
            }
        }
        for ( int i = l ; i <= h ; i++){
            arr[i]= temp[i-l];
        }
    }
    public static int hoarsPartition( int arr [] , int low , int high ){
        int pivot = arr[low];
        int i = low -1 ;
        int j = high -1 ;
        while (true){
            do{
                i++;
            }
            while (arr[i]<pivot);
            do{
                j--;
            }
            while (arr[j]>pivot);
            if (i>=j){return  j ; }
            swap(arr, i , j);

        }
    }
    public static int lumetoPartition( int arr [] , int low , int high ){
        int pivot = arr[high];
        int i = low -1 ;

        for ( int j = low ; j <high -1;j++){
            if (arr[j]<pivot){
                i++;
                swap(arr , j , i);
            }
        }
        swap(arr, i+1 , high);
        return i+1;
    }
    private static void swap ( int []arr , int a , int b ){
        int temp = arr [a] ;
        arr [a]= arr [b]  ;
        arr [b] = temp;
    }
    public static void quickSortWithLumito  ( int []arr , int l , int h ){
        if (l<h){
            int pivot = lumetoPartition(arr , l , h);

//            int randomPivot = new  Random(h).nextInt();

            quickSortWithLumito(arr , l , pivot-1 );
            quickSortWithLumito(arr , pivot+1 , h );
        }
    }
}
