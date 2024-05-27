import java.util.Stack;

public class StackWithGetMinimumAuxilarySpace {


    private final Stack<Integer> ms = new Stack<>();
    private final Stack<Integer> as = new Stack<>();


    void push(int x) {
        ms.push(x);
        if (as.peek() >= ms.peek()) {
            as.push(x);
        }
    }

    int pop() {
        if (ms.isEmpty()) {
            return -1;
        }
        int poped = ms.pop();
        if (poped == as.peek()) {
            as.pop();
        }
        return poped;
    }

    int getMinimum() {
        if (as.isEmpty()) {
            return -1;
        }
        return as.peek();
    }
}
