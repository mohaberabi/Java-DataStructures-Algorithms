public class OptimalStrategyForGame {


    int optimalStrategy(int[] arr, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        return optimalStrategyRec(arr, 0, n - 1, sum);
    }


    int optimalStrategyRec(int[] arr, int i, int j, int sum) {
        if (j == i + 1) {
            return Math.max(arr[i], arr[j]);
        }

        return Math.max((sum - optimalStrategyRec(arr, i + 1, j, sum - arr[i])), (sum - optimalStrategyRec(arr, i, j + 1, sum - arr[j])));
    }
}
