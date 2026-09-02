class Solution {
    long min = Long.MAX_VALUE;
    long smin = Long.MAX_VALUE;
    public int findSecondMinimumValue(TreeNode root) {
          inorder(root); 
          SecondInorder(root);
          if(smin==Long.MAX_VALUE) {
            return -1;
          }  
          return (int)smin;
    }
    public void inorder(TreeNode root){
        if(root==null) return;
        inorder(root.left);
        min = Math.min(min,root.val);
        inorder(root.right);
    }
    public void SecondInorder(TreeNode root){
        if(root==null) return;
        SecondInorder(root.left);
        if (root.val!=min) {
            smin = Math.min(smin, root.val);
        }
        SecondInorder(root.right);
    }
}