class Solution {
    int ans = 0;
    public int height(TreeNode root) {
        if(root==null) {
            return 0;
        }
        int lefth = height(root.left);
        int righth = height(root.right);
        ans = Math.max(ans,lefth+righth);
        return Math.max(lefth,righth)+1;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null) {
            return 0;
        }
        height(root);
        return ans;
        
    }
}