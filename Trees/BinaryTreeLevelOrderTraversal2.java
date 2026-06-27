class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> list = new ArrayList<>();
        q.offer(root);
        while(!q.isEmpty()) {
            int size = q.size();
            List<Integer> level = new ArrayList<>();
            for(int i=0;i<size;i++) {
                if (root == null) {
                return new ArrayList<>();
                }
                TreeNode curr = q.poll();
                if(curr.left!=null) {
                    q.offer(curr.left);
                }
                if(curr.right!=null) {
                    q.offer(curr.right);
                }
                level.add(curr.val);
            }
            list.add(0,level);
        }
        return list;
        
    }
}