import java.util.Stack;

public class NextGreaterElement {

    void printNextGreaterElementNaive(int[] arr, int n) {

        for (int i = 0; i < n; i++) {
            int j;

            for (j = i + 1; j < n; j++) {
                if (arr[j] > arr[i]) {
                    System.out.println(arr[j]);
                    break;
                }
            }

            if (j == n) {
                System.out.println(-1);
            }
        }
    }

    void printNextGreaterElementOptimal(int[] arr, int n) {

        Stack<Integer> s = new Stack<>();
        s.push(arr[n - 1]);

        for (int i = n - 2; i >= 0; i--) {
            while (!s.isEmpty() && s.peek() <= arr[i]) {
                s.pop();
            }

            int nextGreater = s.isEmpty() ? -1 : s.peek();
            System.out.println(nextGreater);
            s.push(arr[i]);
        }
    }
}
