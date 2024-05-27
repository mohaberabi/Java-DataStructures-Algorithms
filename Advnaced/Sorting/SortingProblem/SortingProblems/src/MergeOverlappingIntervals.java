import java.util.Arrays;
import java.util.Comparator;

public class MergeOverlappingIntervals {


    public class Interval {
        int st ;  int end ;

        public Interval(int st , int end ){
            this.end= end ;
            this.st = st ;

        }
    }



    public static void mergeOverlapping (Interval[]arr ){

        Arrays.sort(arr, new MyComp());

        int res = 0 ;
        for ( int i =1 ; i < arr.length;i++){
            if (arr[res].end>=arr[i].st){
                arr[res].end= Math.max(arr[res].end,arr[i].end);
                arr[res].st=Math.max(arr[res].st,arr[i].st);

            }
            else {
                res ++;
                arr[res]= arr[i];
            }
        }

    }



    public static  class MyComp implements Comparator<Interval> {
        @Override
        public int compare(Interval i1, Interval i2 ) {
          return i2.st-i1.st;
        }
    }
}
