public class QuickSort {

    public static void quickSortLumito ( int [] arr ,int low , int high  ){
        if (high>low){
            int p = LumitoPartition.lumito(arr , low,high);
            quickSortLumito(arr , low , p-1 );
            quickSortLumito(arr , p+1 ,high);
        }
    }
    public static  void quickSortHoars ( int [] arr ,int low , int high   ){
        if (high>low){
            int p = HoarsPartition.hoars(arr , low,high);
            quickSortHoars(arr , low , p);
            quickSortHoars(arr , p+1 ,high);
        }
    }

}
