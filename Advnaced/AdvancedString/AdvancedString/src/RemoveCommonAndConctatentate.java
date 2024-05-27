import java.util.Arrays;

public class RemoveCommonAndConctatentate {
    public static String concatenatedString(String s1, String s2) {
        StringBuilder ans = new StringBuilder();


        int[] counts = new int[256];

        for (int i = 0; i < s1.length(); i++) {
            counts[s1.charAt(i)]++;
        }

        for (int i = 0; i < s2.length(); i++) {
            counts[s2.charAt(i)]++;
        }

        String con = s1 + s2;
        for (int i = 0; i < con.length(); i++) {
            if (counts[con.charAt(i)] == 1) {
                ans.append(con.charAt(i));
            }
        }


        return ans.length() == 0 ? "-1" : ans.toString();
    }

}
