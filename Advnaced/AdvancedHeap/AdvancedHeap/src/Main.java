import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();


        ArrayList<Integer> al1 = new ArrayList<>();
        al1.add(1);
        al1.add(5);
        al1.add(9);
        ArrayList<Integer> al2 = new ArrayList<>();
        al2.add(2);
        al2.add(3);
        al2.add(4);

        arr.add(al1);
        arr.add(al2);
        List<Integer> merged = MergeKSortedArray.mergeKSortedArray(arr);

        for (int x : merged) {
            System.out.println(x);
        }

    }
}