class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
    Queue<TreeNode> q = new LinkedList<>(); 
    List<List<Integer>> list = new ArrayList<>();
    if(root==null) {
        return new ArrayList<>();
    }
    q.offer(root);
    int count = 1;
    while(!q.isEmpty()) {
        int size = q.size();
        List<Integer> level = new ArrayList<>();
        boolean lefttoright = true;
        for(int i=size;i>0;i--) {
            TreeNode curr = q.poll();
            if(curr.left!=null) {
                q.offer(curr.left);
            }
            if(curr.right!=null) {
                q.offer(curr.right);
            }
            if(count%2==0) {
                level.add(0,curr.val);
            }
            else {
                level.add(curr.val);
            }     
        }
        count++;
        list.add(level);
    }
    return list;
    }
}