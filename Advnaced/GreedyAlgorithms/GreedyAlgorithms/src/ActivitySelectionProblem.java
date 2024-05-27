import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ActivitySelectionProblem {


    static class Activity {
        int start;
        int finish;

        Activity(int start, int finish) {
            this.start = start;
            this.finish = finish;
        }

//        @Override
//        public String toString() {
//            return "First ->" + start + " , " + "Second ->" + finish + " ";
//        }
    }

    static int activitySelection(Activity[] activitis, int n) {


        Arrays.sort(activitis, Comparator.comparingInt(a -> a.finish));

        int res = 1;

        int prev = 0;
        for (int i = 1; i < n; i++) {
            if (activitis[i].start > activitis[prev].finish) {
                res++;
                prev = i;
            }
        }
        return res;
    }


    public static void main(String[] args) {

        Activity[] acti = {
                new Activity(1, 2),
                new Activity(3, 4),
                new Activity(2, 3),
                new Activity(5, 6)
        };


        int ans = activitySelection(acti, acti.length);
        System.out.println(ans);
    }
}
