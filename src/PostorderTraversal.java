import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PostorderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res=new ArrayList<Integer>();
        if(root == null) return res;
        helper(res,root);
        return res;
    }

    public void helper(List<Integer> res,TreeNode root){
        if(root == null) return;
        helper(res,root.left);
        helper(res,root.right);
        res.add(root.val);
    }

    public List<Integer> postorderTraversalStack(TreeNode root) {
        List<Integer> res=new ArrayList<Integer>();
        Stack<TreeNode> stack=new Stack<>();
        TreeNode cur=root;
        while(cur!=null||!stack.isEmpty()){
            while(cur!=null) {
                stack.push(cur);
                cur = cur.left;
            }
            cur=stack.pop();
            res.add(cur.val);
            cur=stack.pop();
            stack.push(cur);
            cur=cur.right;
        }


        return res;
    }

}
