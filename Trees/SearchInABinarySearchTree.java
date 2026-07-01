class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        if(root==null) {
            return null;
        }
        if(root.val==val) {
            return root;
        }
        if(root.left==null && root.right==null) {
            return null;
        }
        TreeNode left = searchBST(root.left,val);
        TreeNode right = searchBST(root.right,val);
        if(left!=null && left.val==val) {
            return left;
        }
        if(right!=null && right.val==val) {
            return right;
        }
        return null;
    }
}