import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class MergeKSortedArray {


    static class HeapData implements Comparable<HeapData> {
        int val;
        int arrayIndex;
        int valArrIndex;

        public HeapData(int v, int ai, int vi) {
            val = v;
            arrayIndex = ai;
            valArrIndex = vi;
        }

        @Override
        public int compareTo(HeapData o) {
            return val - o.val;
        }
    }


    static ArrayList<Integer> mergeKSortedArray(ArrayList<ArrayList<Integer>> arr) {


        ArrayList<Integer> res = new ArrayList<>();


        PriorityQueue<HeapData> pq = new PriorityQueue<>();

        for (int i = 0; i < arr.size(); i++) {

            ArrayList<Integer> al = arr.get(i);
            pq.add(new HeapData(al.get(0), i, 0));
        }

        while (!pq.isEmpty()) {
            HeapData data = pq.poll();
            int val = data.val;
            res.add(val);

            int valIndex = data.valArrIndex;
            int arIndex = data.arrayIndex;
            if (valIndex + 1 < arr.get(arIndex).size()) {

                pq.add(new HeapData(arr.get(arIndex).get(valIndex + 1), arIndex, valIndex + 1));
            }

        }


        return res;

    }
}
