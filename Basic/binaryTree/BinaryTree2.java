package binaryTree;

import com.sun.source.tree.Tree;
import common.TreeNode;

public class BinaryTree2 {


    static boolean isIdentical(TreeNode root1, TreeNode root2) {

        if (root1 == null && root2 == null) {

            return true;
        }

        if (root1 == null || root2 == null) {
            return false;

        }

        if (root1.data != root2.data) {
            return false;
        }
        return isIdentical(root1.right, root2.right) && isIdentical(root1.left, root2.left);
    }

    static int isSumOfChildrenEqualToRoot(TreeNode root) {

        if (root == null) {
            return 1;
        }
        if (root.left != null && root.right != null) {
            int sum = root.left.data + root.right.data;
            if (sum != root.data) {
                return 0;
            }

        } else if (root.left != null) {
            if (root.left.data != root.data) {
                return 0;
            }
        } else if (root.right != null) {
            if (root.right.data != root.data) {
                return 0;
            }
        }
        int leftResult = isSumOfChildrenEqualToRoot(root.left);
        int rightResult = isSumOfChildrenEqualToRoot(root.right);

        return leftResult == 0 || rightResult == 0 ? 0 : 1;

    }

    static void convertToMirror(TreeNode root) {
        if (root == null) {
            return;
        }
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        convertToMirror(root.right);
        convertToMirror(root.left);


    }

    static boolean isSubtree(TreeNode t, TreeNode s) {
        if (t == null && s == null) {
            return true;
        }
        if (t == null || s == null) {
            return false;
        }
        if (t.data == s.data && isIdentical(t, s)) {
            return true;
        }
        return isSubtree(t.left, t) || isSubtree(t.right, s);
    }
}
