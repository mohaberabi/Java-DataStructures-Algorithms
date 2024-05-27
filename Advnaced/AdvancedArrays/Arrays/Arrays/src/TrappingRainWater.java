import java.util.Collection;
import java.util.Collections;

public class TrappingRainWater {


    int waterNaive(int[] arr, int n) {
        int res = 0;
        for (int i = 1; i < n - 1; i++) {
            int lMax = arr[i];

            for (int j = 0; j < i; j++) {
                lMax = Math.max(lMax, arr[j]);
            }
            int rMax = arr[i];
            for (int j = i + 1; j < n; j++) {
                rMax = Math.max(rMax, arr[j]);
            }
            res = Math.max(rMax, lMax) - arr[i];
        }
        return res;

    }

    int waterOptimal(int[] arr, int n) {
        int[] rMax = new int[n];
        int[] lMax = new int[n];
        lMax[0] = arr[0];
        for (int i = 1; i < n; i++) {
            lMax[i] = Math.max(arr[i], lMax[i - 1]);
        }
        rMax[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rMax[i] = Math.max(arr[i], rMax[i + 1]);
        }
        int res = 0;
        for (int i = 1; i < n - 1; i++) {

            res += Math.min(lMax[i], rMax[i]) - arr[i];
        }
        return res;
    }
}
