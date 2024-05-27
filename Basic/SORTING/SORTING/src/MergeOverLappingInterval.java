import java.util.Arrays;
import java.util.Comparator;

public class MergeOverLappingInterval {




    private class Pair<F,S> {

        F first ;
        S second ;


        public Pair(F f,S s ){
            first = f ;
            second = s ;
        }
    }

private class Interval {
        int st ; int end ;
        public Interval(int st , int end ){
            this.end = end ;
            this.st = st ;

        }
}
    void mergeOverelappingIntervals (Pair<Integer,Integer> []arr ,int  n ){

        Pair<Integer,Integer> [] ans = new Pair[n];

        for ( int i = 0 ; i < n ; i ++){

            Pair<Integer,Integer> one  = arr[i];


            for ( int j = i+1 ;  j < n ;j ++){

                if (arr[j]==null){continue;}
                Pair<Integer,Integer> two  = arr [j];



                int minStart = Math.max(one.first,two.first);
                if (minStart<=two.second){
                    arr [i]=new  Pair<Integer,Integer>(Math.min(one.first,two.first),Math.max(one.second,two.second));
                }

            }

        }


    }
    void mergeOverelappingIntervalsOptimal (Interval[]arr ,int  n ){


        Arrays.sort(arr, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return Integer.compare(o1.st,o2.st);
            }
        });
        int res = 0 ;
        for ( int i = 1 ; i < n ; i ++){
            if (arr[res].end>=arr[i].st){
                arr[res].end = Math.max(arr[res].end , arr[i].end);
                arr[res].st = Math.max(arr[res].st , arr[i].st);

            }
            else {
                res ++;
                arr [res] = arr [i];
            }
        }

    }

}
