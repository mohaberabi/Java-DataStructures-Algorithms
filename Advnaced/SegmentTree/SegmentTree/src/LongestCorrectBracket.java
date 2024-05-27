public class LongestCorrectBracket {

    static class Node {
        int open;
        int closed;
        int pairs;

        public Node() {
        }
    }

    public static Node merge(Node leftChild, Node rightChild) {
        Node parentNode = new Node();
        int minMatched = Math.min(leftChild.open, rightChild.closed);
        parentNode.pairs = leftChild.pairs + rightChild.pairs + minMatched;
        parentNode.open = leftChild.open + rightChild.open - minMatched;
        parentNode.closed = leftChild.closed + rightChild.closed - minMatched;
        return parentNode;
    }

    public static int getMid(int s, int e) {
        return s + (e - s) / 2;
    }

    public static Node getLongestSequenceUtil(Node[] st, int ss, int se, int qs, int qe, int si) {
        if (ss > qe || se < qs) {
            return new Node();
        }

        if (ss >= qs && se <= qe) {
            return st[si];
        }


        int mid = getMid(ss, se);
        Node left = getLongestSequenceUtil(st, ss, mid, qs, qe, si * 2 + 1);
        Node right = getLongestSequenceUtil(st, mid + 1, se, qs, qe, si * 2 + 2);

        Node res = merge(left, right);
        return res;
    }


    public static int getLongestSequence(Node[] st, String str, int qs, int qe, int n) {
        Node res = getLongestSequenceUtil(st, 0, n - 1, qs, qe, 0);

        return 2 * res.pairs;
    }
}
