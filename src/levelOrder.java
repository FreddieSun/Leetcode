import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class levelOrder {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        if ( root == null ) return res;
        // use a queue to record the node in every level
        Queue<TreeNode> queue = new LinkedList<>();
        // offer the root node (first level into the queue) to trigger the loop
        queue.offer(root);
        while(!queue.isEmpty()){
            // need a variable to record the size of each level
            // in every loop, queue contains the nodes in each level
            int size = queue.size();
            // need a list to record the value in each level
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < size; i++){
                TreeNode cur = queue.poll();
                if(cur.left != null) queue.offer(cur.left);
                if(cur.right != null)  queue.offer(cur.right);
                list.add(cur.val);
            }
            res.add(list);
        }
        return res;
    }

    public List<List<Integer>> levelOrder2(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        if ( root == null ) return res;
        helper(res, root, 0);
        return res;
    }

    // helper method, recursive, use a integer value to record the level of the tree
    public void helper(List<List<Integer>> res, TreeNode root, int level){
        if(root == null) return;
        // add a new list for the new level
        if (level >= res.size())
            res.add(new ArrayList<>());

        // now I want to add value into the this level
        res.get(level).add(root.val);

        helper(res, root.left, level + 1);
        helper(res, root.right , level + 1);
    }

    public List<List<Integer>> levelOrder3(TreeNode root) {

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
        return res;
    }
}
