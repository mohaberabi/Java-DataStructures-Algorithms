public class SquareRott {


    int sqrtNaive(int x) {
        int i = 1;


        while (i * i <= x) {
            i++;

        }
        return i - 1;
    }


    int sqRootOptimal(int x) {
        int low = 1;
        int high = x;
        int ans = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int mSqrt = mid * mid;
            if (mSqrt == x) {
                return mid;
            } else if (mSqrt > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
                ans = mid;
            }
        }
        return ans;
    }
}
