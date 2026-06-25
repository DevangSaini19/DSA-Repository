class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null) {
            return false;
        }
        targetSum = targetSum - root.val;
        if(root.left==null && root.right==null) {
            if(targetSum==0) {
                return true;
            }
            return false;
        }
        boolean p = hasPathSum(root.left,targetSum);
        boolean q = hasPathSum(root.right,targetSum);
        return p || q;
    }
}