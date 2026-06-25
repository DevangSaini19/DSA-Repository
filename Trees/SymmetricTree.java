class Solution {
    public boolean Traverse(TreeNode l,TreeNode r) {
        if(l == null && r == null) {
            return true;
        }  
        if(l == null || r == null) {
            return false;
        } 
        if(l.val!=r.val) {
            return false;
        } 
    boolean p =  Traverse(l.left,r.right);
    boolean q = Traverse(l.right,r.left);
    return p && q;
        }

    public boolean isSymmetric(TreeNode root) {
        if(root==null) {
            return true;
        }
        return Traverse(root.left,root.right);
    }
}