//import java.util.Arrays;
//
//public class JobSequence {
//
//
//    static class Job implements Comparable<Job> {
//        char id;
//        int dead;
//
//
//        int profit;
//
//        public Job(char i, int d, int p) {
//            id = i;
//            dead = d;
//            profit = p;
//        }
//
//        @Override
//        public int compareTo(Job o) {
//            if (profit < o.profit) {
//                return 1;
//            } else {
//                return -1;
//            }
//        }
//    }
//
//    void printJobSchad(Job[] arr, int n) {
//        Arrays.sort(arr);
//        int[] res = new int[n];
//        boolean[] slot = new boolean[n];
//
//        for (int i = 0; i < n; i++) {
//            for (int j = Math.min(n, arr[i].dead) - 1; j >= 0; j--) {
//                if (slot[j] == false) {
//                    res[j] = i;
//                    slot[j] = true;
//                    break;
//
//                }
//            }
//        }
//    }
//}
