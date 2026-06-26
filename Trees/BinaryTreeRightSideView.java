class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        if(root==null) {
            return new ArrayList<>();
        }
        q.offer(root);
        while(!q.isEmpty()) {
            int size = q.size();
            for(int i=0;i<size;i++) {
                TreeNode curr = q.poll();
                if(curr.left!=null) {
                    q.offer(curr.left);
                }
                if(curr.right!=null) {
                    q.offer(curr.right);
                }
                if(i==size-1) {
                list.add(curr.val);
                }
            } 
        }
        return list;
    }
}