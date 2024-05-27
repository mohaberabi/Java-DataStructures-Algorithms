public class TrieNode {

    boolean isEnd;
    TrieNode[] child;


    public TrieNode() {

        isEnd = false;
        child = new TrieNode[256];
    }

    boolean search(String key) {
        TrieNode curr = this;

        for (int i = 0; i < key.length(); i++) {
            int index = key.charAt(i) - 'a';
            if (curr.child[index] == null) {
                return false;
            }
            curr = curr.child[index];

        }
        return curr.isEnd;
    }

    boolean search(String key, String pattern) {
        TrieNode curr = this;

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            if (curr.child[c] == null) {
                return false;
            }
            curr = curr.child[c];

        }
        return true;
    }

    void insert(String key) {
        TrieNode curr = this;
        for (int i = 0; i < key.length(); i++) {
            int index = key.charAt(i) - 'a';
            if (curr.child[index] == null) {
                curr.child[index] = new TrieNode();
            }
            curr = curr.child[index];
        }
        curr.isEnd = true;
    }

    void insert(String key, boolean isCapital) {
        if (!isCapital) {
            insert(key);
        } else {
            TrieNode curr = this;
            for (int i = 0; i < key.length(); i++) {
                int index = key.charAt(i) - 'A';
                if (curr.child[index] == null) {
                    curr.child[index] = new TrieNode();
                }
                curr = curr.child[index];
            }
            curr.isEnd = true;
        }
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
