import java.lang.reflect.Array;
import java.util.*;

public class SortAccordingToOther {


    static void sortA1ByA2(int[] a1, int[] a2, int n, int m) {
        TreeMap<Integer, Integer> map = new TreeMap<>();

        ArrayList<Integer> ans = new ArrayList<Integer>();
        for (int x : a1) {
            ans.add(x);
        }
        for (int i = 0; i < m; i++) {
            map.put(a1[i], i);
        }


        Collections.sort(ans, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {


                return map.getOrDefault(o2, 0) - map.getOrDefault(o1, 0);
            }
        });

        for (int x : ans) {
            System.out.print(x + " ");
        }
    }

    public static void main(String[] args) {
        int[] a = {2, 1, 2, 5, 7, 1, 9, 3, 6, 8, 8};

        int[] b = {2, 1, 8, 3};

        sortA1ByA2(a, b, a.length, b.length);

    }

}
