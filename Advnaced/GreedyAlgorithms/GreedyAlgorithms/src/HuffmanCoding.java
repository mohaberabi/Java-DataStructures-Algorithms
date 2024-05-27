import com.sun.source.tree.Tree;

import java.util.PriorityQueue;

public class HuffmanCoding {


    static TreeNode buildHuffmanTree(char[] chars, int[] freq, int n) {


        PriorityQueue<TreeNode> pq = new PriorityQueue<>((a, b) -> a.frequency - b.frequency);

        for (int i = 0; i < n; i++) {
            pq.add(new TreeNode(chars[i], freq[i]));
        }
        while (pq.size() > 1) {
            TreeNode left = pq.poll();
            TreeNode right = pq.poll();
            TreeNode root = new TreeNode('$', left.frequency + right.frequency);
            root.left = left;
            root.right = right;
            pq.add(root);
        }

        return pq.peek();
    }


    static void huffmanDecode(TreeNode root, String decode) {
        if (root == null) {
            return;
        }

        if (root.val != '$') {
            System.out.println(root.val + " " + decode);
            return;
        }
        huffmanDecode(root.left, decode + '0');
        huffmanDecode(root.right, decode + "1");
    }

    public static void main(String[] args) {
        char[] chars = {'a', 'd', 'e', 'f'};

        int[] freq = {30, 40, 80, 60};
        TreeNode root = buildHuffmanTree(chars, freq, freq.length);
        huffmanDecode(root, "");
    }
}
