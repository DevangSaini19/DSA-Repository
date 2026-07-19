class Solution {
    public int getmax(TreeNode node) {
        if(node==null) {
            return Integer.MIN_VALUE;
        }
        int max = getmax(node.left);
        int rmax = getmax(node.right);
        int temp = Math.max(max,rmax);
        return Math.max(node.val,temp);
    }
    public int countDominantNodes(TreeNode root) {
        if(root==null) {
            return 0;
        }
        int count = 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()) {
            int size = q.size();
            for(int i=0;i<size;i++) {
            TreeNode temp = q.poll();
            int n = Integer.MIN_VALUE;
            int m = Integer.MIN_VALUE;
            if(temp.left!=null) {
                n = getmax(temp.left);
                q.offer(temp.left);
            }
            if(temp.right!=null) {
                m = getmax(temp.right);
                q.offer(temp.right);
            }
            if(temp.val>=m && temp.val>=n) {
                count++;
            }
            }
        }
        return count;    
    }
}