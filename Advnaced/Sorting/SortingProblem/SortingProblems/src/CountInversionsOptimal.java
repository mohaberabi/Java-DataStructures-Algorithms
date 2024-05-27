import java.util.Arrays;

public class CountInversionsOptimal {



    public static int countInversions (int arr [] , int high , int low ){
        int res = 0 ;
        if (high>low ){
            int mid = low+(high-low)/2;
            res += countInversions(arr ,low , mid  );
            res +=countInversions(arr , mid +1 , high );
            res +=countAndMerge(arr, low , mid , high );
        }
//        System.out.println(Arrays.toString(arr));
        return res ;
    }


    private  static int countAndMerge (int []arr , int low , int mid , int high ){

        int n1 = mid - low +1 ;
        int n2 = high - mid ;

        int[] left = new int [n1 ];
        int [] right = new int [n2 ];

        for ( int i = 0 ; i < n1 ; i++){
            left [i]=arr[low +i ];
        }
        for ( int i = 0 ; i < n2 ; i ++){
            right  [i]= arr [ mid +1 +i ];

        }
        int i = 0 ; int j = 0 ; int k = low ;
        int res = 0 ;
        while (i<n1 && j<n2 ){
            if (left [i]<right[j]){
                arr [k]= left [i];
                i++;
            }
            else {
                arr[k]=right[j];
                j++;
                res =res+(n1 -i);
            }
            k++;

        }
        while (i<n1){
            arr [k]=left [i];
            i++;
            k++;
        }
        while (j<n2){
            arr[k]= right [j];
            j++;
            k++;
        }
        System.out.println(Arrays.toString(arr));

        return res ;

    }

}
