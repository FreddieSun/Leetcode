import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderBottom {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        if (root == null)
            return res;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        TreeNode last = root;
        TreeNode nLast = last;
        while (!queue.isEmpty()) {
            TreeNode cur = queue.poll();
            temp.add(cur.val);

            if (cur.left != null) {
                queue.offer(cur.left);
                nLast = cur.left;
            }
            if (cur.right != null) {
                queue.offer(cur.right);
                nLast = cur.right;
            }
            if (cur == last) {
                res.add(temp);
                temp = new ArrayList<>();
                last = nLast;
            }
        }
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < res.size(); i++) {
            result.add(res.get(res.size() - 1 - i));
        }
        return result;
    }
}
