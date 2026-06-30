class Solution {
    int count = 0;
    public void traverse(TreeNode root,long targetSum) {
        if(root==null) {
            return;
        }
    count+= count(root,targetSum);
    traverse(root.left,targetSum);
    traverse(root.right,targetSum);
    }
    public int count(TreeNode root ,long targetSum) {
        if(root==null) {
            return 0;
        }
        targetSum = targetSum - root.val;
        int current = 0;
        if(targetSum==0) {
            current = 1;
        }
        int left = count(root.left,targetSum);
        int right = count(root.right,targetSum);
        return current + left + right; 
    }
    public int pathSum(TreeNode root, int targetSum) {
        if(root==null) {
            return 0;
        }
        traverse(root,targetSum);
        return count;   
    }
}