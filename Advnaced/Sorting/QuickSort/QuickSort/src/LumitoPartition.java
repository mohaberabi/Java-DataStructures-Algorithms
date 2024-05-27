import java.util.Random;

public class LumitoPartition {




    public static int lumito(int [] arr ,int high , int low ){

        int pivot =arr[high];



        int i = low -1 ;
        for (int j = low ; j<=high-1;j++){
            if (arr[j]<pivot){
                i++;
            }
            swap(arr , i , j );

        }
        swap(arr ,i+1 , high);
return i+1;
    }


    public static int lumito(int [] arr ,int high , int low,boolean optimal ){
        int pivot ;

        if (optimal){
            int randomPivot = new Random().nextInt(arr.length);

            swap(arr , 0,randomPivot);

        }
        pivot = arr[0];


        int i = low -1 ;
        for (int j = low ; j<=high-1;j++){
            if (arr[j]<pivot){
                i++;
            }
            swap(arr , i , j );

        }
        swap(arr ,i+1 , high);
        return i+1;
    }

    private static void swap(int []arr ,int a , int b ){
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
