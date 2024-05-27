package binaryTree;

import com.sun.source.tree.Tree;
import common.TreeNode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree {


    public static void inOrderIteration(TreeNode root) {
        Stack<TreeNode> s = new Stack<>();
        TreeNode curr = root;
        while (curr != null || !s.isEmpty()) {
            while (curr != null) {
                s.push(curr);
                curr = curr.left;
            }
            curr = s.pop();
            System.out.println(curr.data);
            curr = curr.right;
        }
    }

    public static void preOrderIterative(TreeNode root) {
        if (root == null) {
            return;
        }
        Stack<TreeNode> s = new Stack<>();
        s.push(root);
        while (!s.isEmpty()) {
            TreeNode curr = s.pop();
            System.out.println(curr.data);
            if (curr.right != null)
                s.push(curr.right);
            if (curr.left != null)
                s.push(curr.left);
        }
    }

    public static void inOrder(TreeNode root) {
///left root right
        if (root != null) {
            inOrder(root.left);
            System.out.println(root.data);
            inOrder(root.right);
        }
    }

    public static void preOrder(TreeNode root) {
        //root left right
        if (root != null) {
            System.out.println(root.data);
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    void printFromK(int k, TreeNode root) {

        if (root == null) {
            return;
        }
        if (k == 0) {
            System.out.println(root.data);

        } else {
            printFromK(k - 1, root.left);
            printFromK(k - 1, root.right);
        }
    }

    public static int getSize(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            return 1 + getSize(root.left) + getSize(root.right);
        }
    }

    public static int getMax(TreeNode root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        } else {
            return Math.max(root.data, Math.max(getMax(root.left), getMax(root.right)));
        }
    }


    public static void breadthFirstTraversal(TreeNode root) {
        if (root == null) return;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            System.out.print(current.data + " ");
            queue.add(current.left);
            queue.add(current.right);
        }
    }


    public static void leftView(TreeNode root) {

        if (root == null)
            return;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();

            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll();

                // Print the first node encountered at each level (leftmost node).
                if (i == 0) {
                    System.out.println(node.data);
                }

                // Add the left and right children of the current node to the queue for the next level.
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
        }
    }

    public static int getHeight(TreeNode root) {
        if (root == null) {
            return 0;
        } else {

            int leftHeight = getHeight(root.left);
            int rightHeight = getHeight(root.right);

            // Return the maximum height between left and right subtrees, plus the current node.
            return 1 + Math.max(leftHeight, rightHeight);

        }
    }

    public static void posOrder(TreeNode root) {
        //left right root

        if (root != null) {
            posOrder(root.left);
            posOrder(root.right);
            System.out.println(root.data);
        }
    }


    public static boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }

        if (Math.abs(getHeight(root.left) - getHeight(root.right)) > 1) {
            return false;
        }

        return isBalanced(root.left) && isBalanced(root.right);
    }
}
