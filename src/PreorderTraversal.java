import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<Integer>();
        if(root==null) return list;
        helper(list,root);
        return list;
    }

    public void helper(List<Integer> list,TreeNode root){
        if(root == null)
            return ;
        list.add(root.val);
        helper(list,root.left);
        helper(list,root.right);
    }

    public List<Integer> preorderTraversalIterative(TreeNode root){
        List<Integer> res=new ArrayList<Integer>();
        if(root==null) return res;
        Stack<TreeNode> stack=new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode cur=stack.pop();
            // first push the right child node, because this is a stack. LIFO
            if(cur.right!=null) stack.push(cur.right);
            if(cur.left!=null) stack.push(cur.left);
            res.add(cur.val);
        }

        return res;
    }
}
