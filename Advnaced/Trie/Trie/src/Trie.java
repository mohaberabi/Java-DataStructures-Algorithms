public class Trie {


    TrieNode trie;


    Trie() {

        trie = new TrieNode();
    }


    boolean search(String key) {
        TrieNode curr = trie;

        for (int i = 0; i < key.length(); i++) {
            int index = key.charAt(i) - 'a';
            if (curr.child[index] == null) {
                return false;
            }
            curr = curr.child[index];

        }
        return curr.isEnd;
    }

    void insert(String key) {
        TrieNode curr = trie;
        for (int i = 0; i < key.length(); i++) {
            int index = key.charAt(i) - 'a';
            if (curr.child[index] == null) {
                curr.child[index] = new TrieNode();
            }
            curr = curr.child[index];
        }
        curr.isEnd = true;
    }

    TrieNode delete(TrieNode root, String key, int i) {

        if (root == null) {
            return null;
        }
        if (i == key.length()) {
            root.isEnd = false;
            if (isEmpty(root)) {
                root = null;
            }
            return root;
        }

        int index = key.charAt(i) - 'a';
        root.child[index] = delete(root.child[index], key, i + 1);
        if (isEmpty(root) && !root.isEnd) {
            root = null;
        }
        return root;
    }

    private boolean isEmpty(TrieNode node) {
        for (int i = 0; i < 26; i++) {
            if (node.child[i] != null) {
                return false;
            }
        }
        return true;
    }
}
