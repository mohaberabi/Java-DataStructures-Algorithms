//public class GetMinMax2 {
//    public static PII getMinMax(PII st[], long arr[], int n, int qs, int qe) {
//
//
//        long f = getMin(st, qs, qe, 0, n - 1, 0);
//        long s = getMax(st, qs, qe, 0, n - 1, 0);
//
//
//        PII p = new PII();
//        p.first = f;
//        p.second = s;
//        return p;
//
//        //Your code here
//    }
//
//    static long getMin(PII st[], int qs, int qe, int ss, int se, int i) {
//        if (qs <= ss && qe >= se) {
//            return st[i].first;
//        }
//
//        if (se < qs || ss > qe) {
//            return Long.MAX_VALUE;
//        }
//
//        int mid = getMid(ss, se);
//
//        return Math.min(getMin(st, qs, qe, ss, mid, 2 * i + 1), getMin(st, qs, qe, mid + 1, se, 2 * i + 2));
//
//    }
//
//    static long getMax(PII st[], int qs, int qe, int ss, int se, int i) {
//        if (qs <= ss && qe >= se) {
//            return st[i].second;
//        }
//
//        if (se < qs || ss > qe) {
//            return Long.MIN_VALUE;
//        }
//
//        int mid = getMid(ss, se);
//
//        return Math.max(getMax(st, qs, qe, ss, mid, 2 * i + 1), getMax(st, qs, qe, mid + 1, se, 2 * i + 2));
//
//    }
//
//    //Function to return minimum and maximum of elements in range from index
////qs (quey start) to qe (query end).
//    public static void updateValue(long arr[], PII st[], int n, int index, long val) {
//
//
//        arr[index] = val;
//
//        updateRec(st, 0, n - 1, index, 0, val);
//
//
//        //Your code here
//    }
//
//    static void updateRec(PII[] st, int ss, int se, int i, int si, long val) {
//        if (i < ss || i > se) {
//            return;
//        }
//
//        st[si].first = Math.min(st[si].first, val);
//        st[si].second = Math.max(st[si].second, val);
//        if (se > ss) {
//            int mid = getMid(ss, se);
//            updateRec(st, ss, mid, i, 2 * si + 1, val);
//            updateRec(st, mid + 1, se, i, 2 * si + 2, val);
//        }
//    }
//}
