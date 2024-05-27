public class PrefixSum {



    int[] arr ;
    int [] pSum ;
    int [] wSum ;
    PrefixSum( ){
        arr = new int [10];
        pSum = new int [10];
        wSum  = new int [10];

    }


    private  void initPrefixSum (){
        for ( int i = 1 ; i < arr.length;i++){
            pSum[i]= arr[i-1]+arr[i];
        }
    }

    private  void initWeightedSum  (){
        for ( int i = 1 ; i < arr.length;i++){
            wSum[i]= i*arr[i]+arr[i-1];
        }
    }




    int getSum ( int start , int end ){
        if (start ==0){
            return pSum[end];
        }
        return  pSum[end ]-pSum[start -1 ];
    }

}
