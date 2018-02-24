public class IsBalanced {


    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        int left=height(root.left);
        int right=height(root.right);
        return Math.abs(left-right)<=1 && isBalanced(root.left) && isBalanced(root.right);
    }

    public int height(TreeNode root){
        if(root == null)
            return 0;

        int resL = 1+height(root.left);
        int resR = 1+height(root.right);
        return resL>resR ? resL:resR;

    }

}
