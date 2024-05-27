public class CamelCase {


    static void findPat(String[] dict, String pat) {
        TrieNode curr = new TrieNode();
        for (String s : dict) {
            curr.insert(s, true);
        }
        boolean res = curr.search("WelcomeToGeeksForGeeks", "WTG");


        System.out.println(res);
    }

    public static void main(String[] args) {
        String[] dict = {"WelcomeGeek", "WelcomeToGeeksForGeeks"};
        String pat = "WTG";
        findPat(dict, pat);
    }
}
