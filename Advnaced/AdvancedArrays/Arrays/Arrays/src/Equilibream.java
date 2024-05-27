public class Equilibream {


    boolean equilibream(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            int ls = 0;
            int rs = 0;
            for (int j = 0; j < i; j++) {
                ls += arr[j];
            }
            for (int j = i + 1; j < n; j++) {
                rs += arr[j];
            }
            if (ls == rs) {
                return true;
            }
        }
        return false;
    }

    boolean equiliberamOptimal(int[] arr, int n) {
        int rightSide = 0;
        for (int i = 0; i < n; i++) {
            rightSide += arr[i];

        }
        int leftSide = 0;
        for (int i = 0; i < n; i++) {
            rightSide -= arr[i];
            if (rightSide == leftSide) {
                return true;
            }
            leftSide += arr[i];
        }

        return false;
    }
}
