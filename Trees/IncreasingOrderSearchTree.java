class Solution {
    ArrayList<Integer> list = new ArrayList<>();
    public void InOrder(TreeNode root) {
        if(root==null) {
            return;
        }
        InOrder(root.left);
        list.add(root.val);
        InOrder(root.right);
    }
    public TreeNode increasingBST(TreeNode root) {
        InOrder(root);
        TreeNode dummy = new TreeNode(root.val);
        TreeNode curr = dummy;
        for(int i=0;i<list.size();i++) {
            TreeNode newNode = new TreeNode(list.get(i));
            curr.right = newNode;
            curr = newNode;
        }
        return dummy.right;
    }
}