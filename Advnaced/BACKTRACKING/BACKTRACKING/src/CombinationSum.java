import com.sun.source.util.Trees;

import java.util.*;

public class CombinationSum {


    static ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> al, int sum) {

        Set<Integer> set = new TreeSet<>(al);
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> sorted = new ArrayList<>(set);
        combinationRec(sorted, sum, 0, new ArrayList<>(), ans);
        return ans;
    }

    static void combinationRec(ArrayList<Integer> candidates, int target, int start, ArrayList<Integer> current, ArrayList<ArrayList<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }
        if (target < 0 || start >= candidates.size()) {
            return;
        }

        for (int i = start; i < candidates.size(); i++) {
            current.add(candidates.get(i));
            combinationRec(candidates, target - candidates.get(i), i, current, result);
            current.remove(current.size() - 1);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(7);
        arr.add(2);
        arr.add(6);
        arr.add(5);
        ArrayList<ArrayList<Integer>> ans = combinationSum(arr, 16);
        for (ArrayList<Integer> al : ans) {
            for (int x : al) {
                System.out.print(x);
            }
            System.out.println();
        }
    }
}
