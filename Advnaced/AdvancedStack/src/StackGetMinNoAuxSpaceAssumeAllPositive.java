import java.util.Stack;

public class StackGetMinNoAuxSpaceAssumeAllPositive {


    private int min = Integer.MAX_VALUE;
    private final Stack<Integer> s = new Stack<>();

    int getMin() {
        return min;
    }

    int peek() {
        int p = s.peek();
        return (p <= 0) ? min : p;
    }

    int pop() {
        int poped = s.pop();
        if (poped <= 0) {
            int res = min;
            min = min - poped;
            return res;

        }
        return poped;
    }

    void push(int x) {
        if (s.isEmpty()) {
            s.push(x);
            min = x;
        } else if (x <= min) {
            s.push(x - min);
            min = x;
        } else {
            s.push(x);
        }
    }

}
