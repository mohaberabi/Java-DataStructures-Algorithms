public class MoveZerosToEnd {
    void moveZerosToEnd (int []arr , int n ){
        int count = 0 ;


        for ( int i = 0 ; i <n;i++){
            if (arr[i]!=0){
                swap(arr , i , count );
                count ++;
            }
        }
    }





    private void  swap ( int []arr , int i ,int j ){
        int temp = arr[i];

        arr[i]=arr[j];
        arr [j]=temp ;
    }
}
