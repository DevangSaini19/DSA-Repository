class Solution {
    public int Sum(TreeNode root,int sum) {
        if(root==null) {
            return 0;
        }
        sum = sum*10 + root.val;
        if(root.left==null && root.right==null) {
            return sum;
        }
        int left = Sum(root.left,sum);
        int right = Sum(root.right,sum);
        return left + right;

    }
    public int sumNumbers(TreeNode root) {
        int sum = 0;
    return Sum(root,sum);          
    }
}