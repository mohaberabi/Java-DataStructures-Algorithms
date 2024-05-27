public class NaivePartition {
    
    public  static void naivePartition (int []arr ,int high , int low ,int pivot ){
        
        
        int [] temp = new  int [high-low+1];
        int index = 0 ;
        for ( int i = low  ; i<=high;i++){
            if (arr[i]<=arr[pivot]){
                temp[index]=arr[i];
                index++;
            }
            
        }
        
        for ( int i = low ; i < high;i++){
            if (arr[i]>arr[pivot]){
                temp[index]=arr[i];
                index ++;
            }
        }
        for ( int i = 0 ; i <=high;i++){
            arr[i]= temp [i];
        }
    }
}
