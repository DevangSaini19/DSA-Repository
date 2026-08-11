class Solution {
    List<Integer> list = new ArrayList<>();
    public void helper(TreeNode root) {
        if(root==null) {
            return;
        }
        helper(root.left);
        list.add(root.val);
        helper(root.right);
    }
    public boolean findTarget(TreeNode root, int k) {
        if(root==null) {
            return false;
        }
        helper(root);
        int l = 0;
        int r = list.size() - 1;
        while(l<r) {
            int sum = list.get(l) + list.get(r);
            if(sum==k) {
                return true;
            }
            else if(sum<k) {
                l++;
            }
            else {
                r--;
            }
        }
        return false;
    }
}