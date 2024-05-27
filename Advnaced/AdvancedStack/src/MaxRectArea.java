import java.util.Stack;

public class MaxRectArea {


    int getMaxRectAreaNaive(int[] arr, int n) {

        int res = 0;
        for (int i = 0; i < n; i++) {
            int curr = arr[i];

            for (int j = i - 1; j >= 0; j--) {

                if (arr[j] >= arr[i]) {
                    curr += arr[i];
                } else {
                    break;
                }


            }
            for (int j = i + 1; j < n; j++) {

                if (arr[j] >= arr[i]) {
                    curr += arr[i];
                } else {
                    break;
                }


            }

            res = Math.max(res, curr);
        }
        return res;


    }


    int getMaxRectAreaOptimal(int[] arr, int n) {
        Stack<Integer> s = new Stack<>();
        int res = 0;
        int curr = 0;
        for (int i = 0; i < n; i++) {


            // get the next smaller element 
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {

                int top = s.pop();
                curr = arr[top] * (s.isEmpty() ? i : (i - s.peek() - 1));
                res = Math.max(res, curr);
            }
            s.push(i);
        }
        while (!s.isEmpty()) {
            int top = s.pop();
            curr = arr[top] * (s.isEmpty() ? n : (n - s.peek() - 1));
            res = Math.max(res, curr);
        }
        return res;

    }
}