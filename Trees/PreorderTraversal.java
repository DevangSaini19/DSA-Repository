class Solution {
    public void Preorder(TreeNode root,ArrayList<Integer> list) {
        if(root==null) {
            return;
        }
        list.add(root.val);
        Preorder(root.left,list);
        Preorder(root.right,list);
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        Preorder(root,list);
        return list;
            
    }
}
