class Solution {
    public void Postorder(TreeNode root,ArrayList<Integer> list) {
        if(root==null) {
            return;
        }
        Postorder(root.left,list);
        Postorder(root.right,list);
        list.add(root.val);
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        Postorder(root,list);
        return list;
    }
}