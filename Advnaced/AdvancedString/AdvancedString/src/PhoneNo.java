import java.util.HashMap;

public class PhoneNo {
    static String phone(String s) {
        StringBuilder ans = new StringBuilder();


        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'a' || c == 'b' || c == 'c') {
                ans.append(2);
            } else if (c == 'd' || c == 'e' || c == 'f') {
                ans.append(3);
            } else if (c == 'g' || c == 'h' || c == 'i') {
                ans.append(4);
            } else if (c == 'j' || c == 'k' || c == 'l') {
                ans.append(5);
            } else if (c == 'm' || c == 'n' || c == 'o') {
                ans.append(6);
            } else if (c == 'p' || c == 'q' || c == 'r' || c == 's') {
                ans.append(7);
            } else if (c == 't' || c == 'u' || c == 'v') {
                ans.append(8);
            } else if (c == 'w' || c == 'x' || c == 'y' || c == 'z') {
                ans.append(9);
            }
        }

        return ans.toString();
    }
}
