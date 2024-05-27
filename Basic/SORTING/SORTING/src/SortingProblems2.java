import java.util.ArrayDeque;
import java.util.Iterator;

public class SortingProblems2 {





void aa (){

    ArrayDeque ad = new ArrayDeque();

    Iterator it = ad.iterator();



}


    void printUnionOfTwoSortedArray (int []a ,int n , int []b , int m ){
        int i = 0 ; int j = 0 ;

        while (i<n && j < m ){
            if (i>0&&a[i]==a[i-1]){
                i++;
                continue;
            }
            if (j>0&&b[j]==b[j-1]){
                j++;
                continue;
            }

            if (a[i]>b[j]){
                System.out.println(b[j]+ " ");
                j++;
            }
            else if (b[j]>a[i]){
                System.out.println(a[i]+ " ");
                i++;
            }
            else {
                System.out.println(a[i]+ " ");
                j++;
            }
        }

        while (i<n){
            if (i>0&&a[i]!=a[i-1]){
                System.out.println(a[i]);

            }
        }
        while (j<m){
            if (j>0&&b[i]!=b[j-1]){
                System.out.println(b[j]);

            }
        }
    }
}
