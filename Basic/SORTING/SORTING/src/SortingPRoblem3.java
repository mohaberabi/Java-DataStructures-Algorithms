public class SortingPRoblem3 {
    public int countInversions (int []arr, int l , int r ){

        int res = 0 ;

        if (r>l){
            int med = l + (r-l)/2;

            res +=countInversions(arr,l ,med);
            res +=countInversions(arr, med +1 , r );
            res += countAndMerge(arr , l , r , med);
        }

        return res;
    }




    private int countAndMerge(int []a , int low , int high , int mid ){
        int n1 = mid -low+1 ;
        int n2 = high-mid;
        int []left =new int  [n1];
        int []right = new int [n2];


        for ( int i = 0 ; i < n1;i++){
            left[i]=a[i];
        }
        for ( int i = 0 ; i < n1;i++){
            left[i]=a[low +i ];
        }
        for ( int i = 0 ; i < n2 ; i++){
            right[i]= a [mid+i+1];

        }


        int i = 0 ;
        int j = 0 ;
        int k = 0 ;
        int res = 0 ;
        while (i<n1&&j<n2 ){

            if (left[i]<=right[j]){
                a[k]=left [i];
                i++;
            }
            else {
                a[k]=right[j];
                j++;
                res = res+(n1-i);
            }
            k++;

        }
        while (i<n1){
            a[k]=left[i];
            i++ ;
            k++;
        }
        while (j<n2){
            a[k]=right[j];
            j++ ;
            k++;
        }
        return res ;
    }
}
