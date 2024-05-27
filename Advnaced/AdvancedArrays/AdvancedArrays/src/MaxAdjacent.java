public class MaxAdjacent {




  static    void printMaxAdjacent ( int []arr , int n ){
int max = 0 ;
        for ( int i = 1 ; i < n ; i ++){

            max = Math.max(arr[i],arr [i-1 ]);
            System.out.println(max);
        }

    }
}
