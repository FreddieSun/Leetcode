public class MaxDepth {
    public int maxDepth(TreeNode root) {

        if(root==null)
            return 0;

        int resL = 1+maxDepth(root.left);
        int resR = 1+maxDepth(root.right);

        return resL>resR ? resL:resR;
    }
    //* Definition for a binary tree node.
    public class TreeNode {
        int val;
        MergeTrees.TreeNode left;
        MergeTrees.TreeNode right;
        TreeNode(int x) { val = x; }
    }


}
