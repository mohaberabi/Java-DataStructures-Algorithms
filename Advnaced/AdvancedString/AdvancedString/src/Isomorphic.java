public class Isomorphic {


    public static boolean areIsomorphic(String str1, String str2) {


        if (str1.length() != str2.length()) {
            return false;
        }


        int[] c1 = new int[26];
        int[] c2 = new int[26];


        for (int i = 0; i < str1.length(); i++) {
            c1[str1.charAt(i) - 'a']++;
            c2[str2.charAt(i) - 'a']++;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (c2[str2.charAt(i) - 'a'] != c1[str1.charAt(i) - 'a']) {
                return false;
            }
        }

        return true;

    }
}
