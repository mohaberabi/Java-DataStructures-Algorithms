import java.util.Stack;

public class PreviousGreaterElement {
    void printPreviousGreaterElement(int[] arr, int n) {
        Stack<Integer> s = new Stack<>();
        s.push(0);
        System.out.println(-1);
        for (int i = 1; i < n; i++) {
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }
            int greater = s.isEmpty() ? -1 : s.peek();
            System.out.println(arr[greater]);
            s.push(i);

        }
    }
}
