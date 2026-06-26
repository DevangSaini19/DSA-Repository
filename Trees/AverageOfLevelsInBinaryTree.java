class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<Double> list = new ArrayList<>();
        q.offer(root);
        while(!q.isEmpty()) {
            int size = q.size();
            double sum = 0;
            for(int i=0;i<size;i++) {
                TreeNode curr = q.poll();
                if(curr.left!=null) {
                    q.offer(curr.left);
                }
                if(curr.right!=null) {
                    q.offer(curr.right);
                }
                sum+=curr.val;
            }
            double avg = sum/size;
            list.add(avg);
        }
        return list;
    }
}