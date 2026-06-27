class Solution {
    public int height(TreeNode root) {
        if(root==null) {
            return 0;
        }
        int left = height(root.left);
        int right = height(root.right);
        if(left==-1 || right==-1) {
            return -1;
        }
        int diff = Math.abs(left - right);
        if(diff>1) {
            return -1;
        }
        return Math.max(left,right)+1;

    }
    public boolean isBalanced(TreeNode root) {
        if(root==null) {
            return true;
        }
        int sum = height(root);
        if(sum==-1) {
            return false;
        }
        return true;

    }
}
