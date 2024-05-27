public class PowerOfNumber {
    int powerNaive(int x, int n) {

        int res = 1;
        for (int i = 0; i < n; i++) {
            res = res * x;
        }
        return res;
    }

    int powerRec(int x, int n) {
        if (n == 0) {
            return 1;
        }


        int temp = powerRec(x, n / 2);
        temp = temp * temp;
        if (n % 2 == 0) {
            return temp;
        }
        return temp * x;
    }

    int powerIterativeOptimal(int x, int n) {
        int res = 1;
        while (n > 0) {
            if (n % 2 != 0) {
                res = res * x;
            }
            x = x * x;
            n = n / 2;
        }
        return res;
    }

    int powerIterativeOptimalBitWise(int x, int n) {
        int res = 1;
        while (n > 0) {
            if ((n & 1) == 1) {
                res = res * x;
            }
            x = x * x;
            n = n >> 1;
        }
        return res;
    }
}
