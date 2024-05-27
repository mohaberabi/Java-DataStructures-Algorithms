public class MergeSort {

    public static void mergeSort (int []arr , int low , int high ){

        if (high>low){
            int mid = (high+low)/2 ;

            mergeSort(arr , low , mid );
            mergeSort(arr , mid +1 , high);
            Merger.merge(arr,low , mid , high );
        }
    }
}
