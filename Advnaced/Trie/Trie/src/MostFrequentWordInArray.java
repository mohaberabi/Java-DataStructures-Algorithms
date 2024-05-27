import java.util.HashMap;
import java.util.Map;

public class MostFrequentWordInArray {


    public static String mostFrequentWord(String[] arr, int n) {

        TrieNode curr = new TrieNode();
        for (String s : arr) {
            curr.insert(s);
        }

        String ans = "";
        HashMap<String, Integer> map = new HashMap<>();

        for (String s : arr) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        int max = 0;
        for (String s : arr) {
            if (map.containsKey(s)) {
                if (map.get(s) > max) {
                    ans = s;
                    max = map.get(s);
                } else {

                    ans = s;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        String[] arr = {"geeks", "for", "geeks", "for", "geeks", "geeks", "for", "for"};

        String ans = mostFrequentWord(arr, arr.length);
        System.out.println(ans);
    }
}