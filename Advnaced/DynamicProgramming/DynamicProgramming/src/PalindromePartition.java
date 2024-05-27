public class PalindromePartition {


    static boolean isPalindrome(int i, int j, String s) {

        if (i > j) {
            return true;
        }

        return s.charAt(i) == s.charAt(j) && isPalindrome(i + 1, j - 1, s);
    }


    public static void main(String[] args) {

        String s = "aaabbbaaa";
        boolean ans = isPalindrome(0, s.length() - 1, s);
        System.out.println(ans);
    }


}
