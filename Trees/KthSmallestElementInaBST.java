class Solution {
    public void traverse(TreeNode root,List<Integer> list) {
        if(root==null) {
            return;
        }
        traverse(root.left,list);
        list.add(root.val);
        traverse(root.right,list);
    }
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        traverse(root,list);
        return list.get(k-1);          
    }
}