import java.util.ArrayList;

public class LowestCommonAnscestor {


    //assume two integers data exist in the tree
    Node lcaOptimal(Node root, int n1, int n2) {
        if (root == null) {
            return null;
        }
        if (root.data == n1 || root.data == n2) {
            return root;
        }

        Node lcaLeft = lcaOptimal(root.left, n1, n2);
        Node lcaRight = lca(root.right, n1, n2);
        if (lcaLeft != null && lcaRight != null) {
            return root;
        }
        if (lcaLeft != null) {
            return lcaLeft;
        } else {
            return lcaRight;
        }
    }

    boolean findPath(Node root, ArrayList<Node> p, int n) {
        if (root == null) {
            return false;
        }
        p.add(root);
        if (n == root.data) {
            return true;
        }
        if (findPath(root.left, p, n) || findPath(root.right, p, n)) {
            return true;
        }
        p.remove(p.size() - 1);
        return false;
    }

    Node lca(Node root, int n1, int n2) {
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();
        if (!findPath(root, path1, n1) || !findPath(root, path2, n2)) {
            return null;
        }
        for (int i = 0; i < path1.size() - 1 && i < path2.size() - 1; i++) {
            if (path1.get(i + 1) != path2.get(i + 1)) {
                return path1.get(i);
            }
        }
        return null;
    }
}
