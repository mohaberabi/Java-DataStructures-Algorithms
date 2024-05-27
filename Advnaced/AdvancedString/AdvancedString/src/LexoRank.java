public class LexoRank {


    private static final int CHAR = 256;

    int lexoRank(String s) {


        int res = 1;
        int n = s.length();

        int mul = factorial(n);
        int[] count = new int[CHAR];


        for (int i = 0; i < n; i++) {
            count[s.charAt(i)]++;

        }

        for (int i = 1; i < CHAR; i++) {
            count[i] += count[i - 1];
        }
        for (int i = 0; i < n - 1; i++) {
            mul = mul / (n - i);
            res = res + count[s.charAt(i) - 1] * mul;
            for (int j = s.charAt(i); j < CHAR; j++) {
                count[j]--;
            }
        }

        return res;

    }


    int factorial(int n) {

        int res = 1;

        while (n > 1) {
            res *= n;
            n--;
        }
        return res;
    }
}
