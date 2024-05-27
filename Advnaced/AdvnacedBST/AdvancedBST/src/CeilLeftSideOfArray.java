import java.util.TreeSet;

public class CeilLeftSideOfArray {




    void printCeilingOfLeftSideOfArray (int [] arr , int n ){
        TreeSet<Integer> s = new TreeSet<>();

        s.add(arr[0]);

        for ( int i =1 ; i <n ; i++){
            if (s.ceiling(arr[i])!=null){
                System.out.println(s.ceiling(arr[i]));
            }
            else {
                System.out.println(-1);
            }
            s.add(arr[i]);
        }
    }
}
