import java.util.LinkedList;
import java.util.Queue;

public class MaxWidth {


    int maxWidth(Node root) {
        if (root == null) {
            return 0;
        }
        Queue<Node> q = new LinkedList<>();

        q.add(root);
        int ans = 0;


        while (!q.isEmpty()) {
            int count = q.size();
            ans = Math.max(ans, count);
            for (int i = 0; i < count; i++) {
                Node curr = q.poll();
                if (curr.left != null) {
                    q.add(curr.left);
                }
                if (curr.right != null) {
                    q.add(curr.right);
                }

            }
        }

        return ans;

    }
}
