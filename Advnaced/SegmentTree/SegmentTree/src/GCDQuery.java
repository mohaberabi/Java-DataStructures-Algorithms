//public class GCDQuery {
//    public int findRangeGCD(int ql, int qr) {
//        return findRangeGCD(0, 0, arr.length - 1, ql, qr);
//    }
//
//    private int findRangeGCD(int pos, int left, int right, int ql, int qr) {
//        if (ql <= left && qr >= right) {
//            return segTree[pos];
//        } else if (ql > right || qr < left) {
//            return 0; // Default value for out-of-range queries
//        } else {
//            int mid = left + (right - left) / 2;
//            int leftGCD = findRangeGCD(2 * pos + 1, left, mid, ql, qr);
//            int rightGCD = findRangeGCD(2 * pos + 2, mid + 1, right, ql, qr);
//            return gcd(leftGCD, rightGCD);
//        }
//    }
//
//    // Update the value of the array at index idx to newVal
//    public void updateValue(int idx, int newVal) {
//        int diff = newVal - arr[idx];
//        arr[idx] = newVal;
//        updateValue(0, 0, arr.length - 1, idx, diff);
//    }
//
//    private void updateValue(int pos, int left, int right, int idx, int diff) {
//        if (idx < left || idx > right) {
//            return;
//        }
//
//        segTree[pos] = segTree[pos] + diff;
//
//        if (left != right) {
//            int mid = left + (right - left) / 2;
//            updateValue(2 * pos + 1, left, mid, idx, diff);
//            updateValue(2 * pos + 2, mid + 1, right, idx, diff);
//        }
//    }
//
//    private int gcd(int a, int b) {
//        if (b == 0) {
//            return a;
//        }
//        return gcd(b, a % b);
//    }
//}
