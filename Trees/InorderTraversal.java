class Solution {
    public void Inorder(TreeNode root,ArrayList<Integer> list) {
        if(root==null) {
            return;
        }
        Inorder(root.left,list);
        list.add(root.val);
        Inorder(root.right,list);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        Inorder(root,list);
        return list;
    }
}