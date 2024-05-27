import com.sun.source.tree.Tree;

public class TreeNode {

    char val;
    TreeNode left;
    TreeNode right;
    int frequency;

    public TreeNode(char v, int f) {
        frequency = f;
        val = v;
        left = right = null;
    }


}
