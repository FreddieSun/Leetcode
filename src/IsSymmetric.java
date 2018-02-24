public class IsSymmetric {
    public boolean isSymmetric(TreeNode root) {
        //recursive version
        // since the whole tree is symmetric , every node's subtree is symmetric.
        if(root == null)
            return true;
        return isSymmetric(root.left,root.right);
    }

    public boolean isSymmetric(TreeNode left,TreeNode right){
        if(left==null&&right==null)
            return true;
        else if(left==null||right==null)
            return false;
        return (left.val==right.val)&&isSymmetric(left.left,right.right)&&isSymmetric(left.right,right.left);
    }
}
