public class FrequenciesOfSorted {
    void printFreqSorted ( int[]arr , int n ){
        int freq =1 ;
        int i =1 ;
        while (arr[i]==arr[i-1]&&i<n){
            freq ++;
            i++;
        }
        System.out.println(arr[i-1]+" "+freq);
        if (n==1 ||arr[n-1 ]!=arr[n-2]){
            System.out.println(arr[n-1 ]+" "+1);
        }
    }
}
