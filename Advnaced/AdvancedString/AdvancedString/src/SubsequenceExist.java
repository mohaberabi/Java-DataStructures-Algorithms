public class SubsequenceExist {


    boolean hassubsequenceBetter(String a, String b) {
        int n = a.length();
        int m = b.length();


        int j = 0;
        for (int i = 0; i < n; i++) {
            if (a.charAt(i) == b.charAt(j)) {
                j++;
            }
        }
        return j == m;
    }

    boolean hasSubsequence(String a, String b) {

        int i = 0;
        int j = 0;


        while (i < a.length() && j < b.length()) {


            if (a.charAt(i) == b.charAt(j)) {

                i++;
                j++;
            } else {
                i++;
            }

        }
        return j == b.length();

    }


    boolean subsequenceRec(String s1, int n, String s2, int m) {
        if (m == 0) {
            return true;
        }
        if (n == 0) {

            return false;
        }
        if (s1.charAt(n - 1) == s2.charAt(m - 1)) {
            return subsequenceRec(s1, n - 1, s2, m - 1);
        } else {
            return subsequenceRec(s1, n - 1, s2, m);

        }
    }
}
