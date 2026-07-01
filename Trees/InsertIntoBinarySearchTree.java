class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode newNode = new TreeNode(val);
        if(root==null) {
            root = newNode;
            return root;
        }
        if(root.left==null ) {
            if(root.val>val) {
                root.left = newNode;
                return root;
            }
        }
        if(root.right==null) {
            if(root.val<val) {
                root.right = newNode;
                return root;
            }
        }
        if(root.left==null && root.right==null) {
            if(root.val<val) {
                root.right = newNode;
                return root;
            }
            if(root.val>val) {
                root.left = newNode;
                return root;
            }
        }
        if(root.val<val) {
            TreeNode right = insertIntoBST(root.right,val);
        }
        if(root.val>val) {
            TreeNode left = insertIntoBST(root.left,val);
        }
        return root;
        
    }
}