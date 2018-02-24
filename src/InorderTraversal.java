import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res=new ArrayList<Integer>();
        if(root==null) return res;
        helper(res,root);
        return res;
    }

    public void helper(List<Integer> res, TreeNode root){
        if(root == null) return;
        helper(res,root.left);
        res.add(root.val);
        helper(res,root.right);
    }

    public List<Integer> inorderTraversalStack(TreeNode root) {
        List<Integer> res=new ArrayList<Integer>();
        Stack<TreeNode> stack=new Stack<>();
        if(root==null) return res;
        TreeNode cur= root;
        while(!stack.isEmpty()||cur!=null){
            while(cur!=null){
                stack.push(cur);
                cur=cur.left;
            }
            cur=stack.pop();
            res.add(cur.val);
            cur=cur.right;
        }
        return res;
    }
