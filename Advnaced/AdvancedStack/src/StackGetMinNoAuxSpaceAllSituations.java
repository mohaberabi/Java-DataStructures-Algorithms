import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Stack;

public class StackGetMinNoAuxSpaceAllSituations {


    private final Stack<Integer> s = new Stack<>();
    private int min = Integer.MAX_VALUE;


    int getMinimum() {
        return min;
    }

    int getPeek() {
        int p = s.peek();
        return (p <= min) ? min : p;


    }

    void push(int x) {


        if (s.isEmpty()) {
            min = x;
            s.push(x);
        } else if (x <= min) {
            s.push((2 * x) - min);
            min = x;
        } else {
            s.push(x);
        }
    }

    int pop() {
        int popped = s.pop();
        if (popped <= min) {
            int res = min;

            min = (2 * min) - popped;
            return res;
        }
        return popped;
    }
}
