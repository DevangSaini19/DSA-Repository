class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
    if(root==null) {
        return 0;
    } 
    int sum = 0;
    if(root.left!=null && root.left.left==null && root.left.right==null) {
        sum+=root.left.val;
    }
    int left = sumOfLeftLeaves(root.left);
    int right = sumOfLeftLeaves(root.right);
    return sum + left + right;

    }
}