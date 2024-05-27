public class FrequenciesInSorted {


    void printFreqSorted ( int []arr , int n ){
        int frq =1 ;
        int i =1 ;
     while (i<n){
         while (i<n&&arr[i]==arr[i-1]){
             frq++;
             i++;
         }
         System.out.println(arr[i-1]+" "+frq);
         i++;
         frq=1 ;
     }

     if (n==1 || arr[n-1]!=arr[n-2 ]){
         System.out.println(arr[i-1]+" "+1);

     }
    }
}
