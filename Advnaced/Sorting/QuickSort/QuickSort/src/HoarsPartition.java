import java.util.Random;

public class HoarsPartition {

    public static int hoars (int[] arr , int low , int high ){
        int pivot = arr[low];
        int i = low -1 ;
        int j = high+1;

        while (true){
            do {
                i++;
            }while (arr[i]<pivot);

            do {
                j--;
            }while (arr[j]>pivot);

            if (i>=j){
                return j ;
            }
            swap(arr,i , j );
        }

    }


    public static int hoars (int[] arr , int low , int high ,boolean optimal){
        int pivot ;

        if (optimal){
            int randomPivot = new Random().nextInt(arr.length);

            swap(arr , 0,randomPivot);

        }
        pivot = arr[0];

        int i = low -1 ;
        int j = high+1;

        while (true){
            do {
                i++;
            }while (arr[i]<pivot);

            do {
                i--;
            }while (arr[j]>pivot);

            if (i>=j){
                return j ;
            }
            swap(arr,i , j );
        }

    }

    private static void swap(int []arr ,int a , int b ){
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
