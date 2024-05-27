import java.util.ArrayList;

public class PermuteString {
    static String swap(String str , int i , int j ) {
        StringBuilder strB = new StringBuilder(str);
        char l = strB.charAt(i) , r = strB.charAt(j);
        strB.setCharAt(i,r);
        strB.setCharAt(j,l);
        return strB.toString();
    }

    public static void permute_(String s, int i, ArrayList<String> ans){

        if(i == s.length() - 1){
            ans.add(s);
            return;
        }
        for(int j = i; j < s.length(); j++){

            permute_(swap(s, i, j), i + 1, ans);

        }
    }

    public static ArrayList<String> permute(String s){
        ArrayList<String> ans = new ArrayList<String>();
        permute_(s, 0, ans);
        return ans;
    }
}
