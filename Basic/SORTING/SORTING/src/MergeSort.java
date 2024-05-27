public class MergeSort {



    public static void printTwoSorted (int [] a , int [] b ){
        int i  = 0 ;
        int j = 0 ;

        while (i < a.length && j < b.length){

            if (a[i]  <= b[j]){
                System.out.println(a[i]);
                j++;
            }
            else {
                System.out.println(b[i]);
                i++;
            }

        }
        while (i<a.length){
            System.out.println(a[i]);
            i++;
        }
        while (j<b.length){
            System.out.println(b[j]);
            j++;
        }
    }



void mergeSort (int [] arr , int l , int r ){
        if (r>l){
            int mid = (l+r)/2;
            mergeSort(arr,l ,mid);
            mergeSort(arr , mid +1 , r );
            merge(arr , l , mid  , r );
        }
}

    public void merge(int a [] , int low , int mid , int high ){

        int n1 =  mid-low+1;
        int n2 = high-mid ;
        int []  left = new int  [n1 ] ;
        int [] right = new int [n2];
        for ( int i = 0 ; i < n1 ; i ++){
            left[i]= a [low+i];

        }
        for ( int i = 0 ; i < n2 ; i ++){
            right[i]= a [mid+i+1];

        }



        int i = 0  , j = 0 , k = low ;





        while (i<n1&&j<n2 ){
            if (left[i]<=right[j]){
                a[k] = left[i];
                i++;
            }
            else {
                a [k]= right[j];
                j++;
            }
            k++;
        }


        while (i<n1){
            a [k]= left  [i];
            i++;
            k ++;
        }
        while (j<n2){
            a [k]= right   [j];
            j++;
            k ++;
        }
    }
}
