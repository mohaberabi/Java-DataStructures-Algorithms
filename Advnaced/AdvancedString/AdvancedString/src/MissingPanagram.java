import java.util.Arrays;

public class MissingPanagram {


    String missingPanagram(String str) {


        boolean[] charPrenset = new boolean[26];


        Arrays.fill(charPrenset, false);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 65 && str.charAt(i) <= 92) {
                charPrenset[str.charAt(i) - 'A'] = true;
            } else {
                charPrenset[str.charAt(i) - 'a'] = true;
            }

        }
        String ans = "";

        for (int i = 0; i < 26; i++) {
            if (!charPrenset[i]) {
                ans += (char) (i + 97);
            }
        }
        return (ans == "" ? "-1" : ans);
    }
}
