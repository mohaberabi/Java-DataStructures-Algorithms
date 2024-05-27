import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class SortingPRoblems {


int getMinDiff (int []arr , int n ){


    int res = Integer.MAX_VALUE;

    for ( int i = 1 ; i < n ; i ++){
        for ( int j = 0 ; i < i ; j++){

            res = Math.min(res , Math.abs(arr[j]-arr[i]));
        }
    }
    return res ;

}
    void printIntersectionTwoSortedEffiecnt (int []a , int [] b , int n , int m ){


    }
void printIntersectionTwoSortedArray (int []a , int [] b , int n , int m ){

}
int getMinEffiecnt (int []  arr , int n ){

    int res = Integer.MAX_VALUE;

    Arrays.sort(arr);
    for ( int i = 1 ; i < n ; i ++){
        res = Math.min(res , Math.abs(arr [i]-arr[i-1]));

    }

    return res ;

}


}
