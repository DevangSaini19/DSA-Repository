class Solution {
    int ans = Integer.MAX_VALUE;
    public void Inorder(TreeNode root,List<Integer> list) {
        if(root==null) {
            return;
        }
        Inorder(root.left,list);
        list.add(root.val);
        Inorder(root.right,list);
    }
    public int minDiffInBST(TreeNode root) {
        if(root==null) {
            return 0;
        }
        List<Integer> list = new ArrayList<>();
        Inorder(root,list);
        for(int i=0;i<list.size()-1;i++) {
            int num = list.get(i+1) - list.get(i);
            if(ans>num) {
                ans = num;
            }
        }
        return ans;
    }
}