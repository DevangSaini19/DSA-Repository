class Solution {
    public boolean helper(TreeNode root,long max,long Min) {
        if(root==null) {
            return true;
        }
        if(!(root.val<max && root.val>Min)) {
            return false;
        }
    boolean p =  helper(root.left,root.val,Min);
    boolean q =  helper(root.right,max,root.val);
        return p && q;
    }
    public boolean isValidBST(TreeNode root) {
        long max = Long.MAX_VALUE;
        long Min = Long.MIN_VALUE;
        return helper(root,max,Min);
    }
}