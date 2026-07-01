class Solution {
    public void Preorder(TreeNode root, ArrayList<TreeNode> list) {
        if(root==null) {
            return;
        }
        list.add(root);
        Preorder(root.left,list);
        Preorder(root.right,list);
        
    }
    public void List(TreeNode root,ArrayList<TreeNode> list) {
        if(root==null) {
            return;
        }
        TreeNode dummy = new TreeNode(0);
        TreeNode curr = dummy; 
        for(int i=0;i<list.size();i++) {
            TreeNode newNode = list.get(i);
            curr.left = null;
            curr.right = newNode;
            curr = newNode;
        }
    }
    public void flatten(TreeNode root) {
        if(root==null ) {
            return;
        }
        if(root.left==null && root.right==null) {
            return;
        }
        ArrayList<TreeNode> list = new ArrayList<>();
        Preorder(root,list);
        List(root,list);
    }
}