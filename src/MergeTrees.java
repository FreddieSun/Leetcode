

public class MergeTrees {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if(t1==null&&t2==null)
            return null;
        else{
            int value = (t1 == null ? 0:t1.val)+(t2 == null ? 0: t2.val);

            TreeNode result=new TreeNode(value);

            result.left=mergeTrees(t1==null? null:t1.left,t2==null ? null:t2.left);

            result.right=mergeTrees(t1==null? null:t1.right,t2==null ? null:t2.right);

            return result;
        }

    }


}
