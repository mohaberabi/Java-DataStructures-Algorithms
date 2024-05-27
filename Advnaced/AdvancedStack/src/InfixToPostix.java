import java.util.Stack;

public class InfixToPostix {


    static String toPostFix(String exp) {

        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();


        for (char c : exp.toCharArray()) {


            if (isLeftPar(c)) {
                stack.push(c);

            } else if (isRightPar(c)) {
                while (!stack.isEmpty() && !isLeftPar(stack.peek())) {
                    sb.append(stack.pop());
                }
                stack.pop();
            } else if (isOperator(c)) {

                while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {
                    sb.append(stack.pop());
                }
                stack.push(c);

            } else {
                sb.append(c);
            }
        }


        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.toString();
    }


    static boolean isLeftPar(char c) {
        return c == '(';
    }

    static boolean isOperator(char c) {
        return c == '^' || c == '*' || c == '-' || c == '+';
    }

    static boolean isRightPar(char c) {
        return c == ')';
    }

    static int precedence(char operator) {
        switch (operator) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return 0;
    }
}
