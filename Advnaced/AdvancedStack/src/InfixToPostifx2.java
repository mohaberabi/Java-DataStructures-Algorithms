import java.util.Stack;

public class InfixToPostifx2 {
    class Solution {

        static int prec(char c) {
            if (c == '^')
                return 3;
            else if (c == '/' || c == '*')
                return 2;
            else if (c == '+' || c == '-')
                return 1;
            else
                return -1;
        }


        public static String infixToPostfix(String s) {
            Stack<Character> st = new Stack<>(); // For stack operations, we are
            String result = "";

            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);

                if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') ||
                        (c >= '0' && c <= '9'))
                    result += c;

                else if (c == '(')
                    st.push('(');


                else if (c == ')') {
                    while (st.peek() != '(') {
                        result += st.peek();
                        st.pop();
                    }
                    st.pop();
                } else {
                    while (!st.empty() && prec(s.charAt(i)) <= prec(st.peek())) {
                        result += st.peek();
                        st.pop();
                    }
                    st.push(c);
                }
            }

            while (!st.empty()) {
                result += st.peek();
                st.pop();
            }

            return result;
        }
    }
}
