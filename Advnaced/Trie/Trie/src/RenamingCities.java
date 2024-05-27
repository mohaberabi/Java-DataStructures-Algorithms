//import java.util.HashMap;
//import java.util.TreeMap;
//
//public class RenamingCities {
//
//
//    public static class Node {
//        boolean isEnd;
//        public TreeMap<Character, Node> map;
//
//        public Node() {
//            isEnd = false;
//            map = new TreeMap<>();
//        }
//
//    }
//
//    public static void renameCities(String[] arr, int n) {
//
//        TrieNode curr = new TrieNode();
//
//        for (int word = 0; word < n; word++) {
//
//            for (int i = 0; i < arr[word].length(); i++) {
//                int index = arr[word].charAt(i) - 'a';
//                String add = "";
//                if (curr.child[index] == null) {
//                    add += arr[word].charAt(i);
//                    curr.child[index] = new TrieNode();
//                }
//                arr[word] = add;
//                curr = curr.child[index];
//                curr.insert(arr[word]);
//            }
//
//        }
//
//    }
//
//    public static void main(String[] args) {
//        String[] arr = {"shimala", "safari", "jammu", "delhi", "jammu", "dehradun"};
//        renameCities(arr, arr.length);
//        for (String s : arr) {
//            System.out.println(s);
//        }
//    }
//}
