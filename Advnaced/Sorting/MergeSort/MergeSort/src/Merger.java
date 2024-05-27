public class Merger {

    public static void merge (int [] a ,int l , int m , int h ){
        int n1 = m-l+1 ;
        int n2 = h-m;

        int s =1 ;


        int []left =new int [n1];
        int []right= new int [n2 ];


        for ( int i = 0 ; i < n1 ; i++){
            left[i]=a[l+i];
        }
        for ( int  i = 0 ; i < n2 ; i ++){
            right[i]=a[m+i+1];
        }



        int i = 0 ; int j = 0 ; int k = l  ;


        while (i<n1 && j <n2){
            if (left[i]<=right[j]){
                a[k]=left[i];
                i++;
                k++;
            }
            else {
                a[k]=right [j];
                j++;
                k++;
            }
        }

        while (i<n1 ){
            a[k]=left [i];
            i++;
            k++;
        }

        while (j<n2 ){
            a[k]=right  [j];
            j++;
            k++;
        }

        
    }

}
