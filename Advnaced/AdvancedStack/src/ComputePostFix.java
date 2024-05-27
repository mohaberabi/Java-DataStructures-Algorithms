import java.util.Stack;

public class ComputePostFix {


    static int computePostFix(String x) {


        Stack<Integer> stack = new Stack<>();


        for (char c : x.toCharArray()) {

            if (Character.isDigit(c)) {
                stack.push(c - '0');
            } else {
                int first = stack.pop();
                int second = stack.pop();
                int total = compute(c, first, second);
                stack.push(total);
            }

        }

        return stack.peek();

    }


    static boolean isOperator(char c) {
        return c == '^' || c == '*' || c == '-' || c == '+' || c == '/';
    }

    static private int compute(char c, int first, int second) {
        return switch (c) {
            case '^' -> (int) Math.pow(first, second);
            case '*' -> second * first;
            case '/' -> second / first;
            case '-' -> second - first;
            default -> second + first;
        };
    }

}
