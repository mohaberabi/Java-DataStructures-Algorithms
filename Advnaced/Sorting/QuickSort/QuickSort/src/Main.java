public class Main {
    public static void main(String[] args) {

        int [] a  = {
                900,1,8,77 ,98,666,-1 ,2,0
        };

        QuickSort.quickSortHoars(a,0,a.length-1 );


        for ( int x : a ){
            System.out.println(x);
        }
    }
}