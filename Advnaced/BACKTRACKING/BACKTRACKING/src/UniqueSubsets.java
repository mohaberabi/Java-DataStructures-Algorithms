import java.util.ArrayList;
import java.util.Arrays;

public class UniqueSubsets {


    static ArrayList<ArrayList<Integer>> allsubsets(int[] arr, int n) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);

        backTrack(ans, new ArrayList<Integer>(), 0, arr);
        return ans;
    }


    static void backTrack(ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> add, int s, int[] arr) {

        ans.add(new ArrayList<>(add));


        for (int i = s; i < arr.length; i++) {
            if (i > s && arr[i] == arr[i - 1]) {
                continue;
            }

            add.add(arr[i]);
            backTrack(ans, add, i + 1, arr);
            add.remove(add.size() - 1);
        }
    }


    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> al = new ArrayList<>();
        int[] arr = {2, 1, 2};
        al = allsubsets(arr, arr.length);

        for (ArrayList<Integer> ar : al) {

            for (int x : ar) {
                System.out.print(x + " ");
            }
            System.out.println();
        }


    }


}
