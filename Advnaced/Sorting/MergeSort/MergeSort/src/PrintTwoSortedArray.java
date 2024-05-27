public class PrintTwoSortedArray {

    public static void printTwoSortedArray(int []a , int [] b ){



        int i = 0 ; int j = 0 ;
        int n1 = a.length;
        int n2 = b.length;
        while (i<n1 && j<n2){
            if (a[i]<=b[j]){
                System.out.println(a[i]);
                i++;
            }
            else {
                System.out.println(b[j]);
j++;
            }
        }

        while (i<n1 ){
            System.out.println(a[i]);
            i++;
        }
        while (j<n2){
            System.out.println(b[j]);
            j++;
        }

    }
}
