class Solution {
    public void traverse(TreeNode root,int targetSum, List<Integer> currentPath, List<List<Integer>> list) {
        if(root==null) {
            return;
        }
        currentPath.add(root.val);
        targetSum = targetSum - root.val;
        if(root.left==null && root.right==null) {
            if(targetSum==0) {
            list.add(new ArrayList<>(currentPath));
            }
            currentPath.remove(currentPath.size() - 1);
            return;
        }
        traverse(root.left,targetSum,currentPath,list);
        traverse(root.right,targetSum,currentPath,list);
        currentPath.remove(currentPath.size()-1);
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        if(root==null) {
            return new ArrayList<>();
        }
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> currentPath = new ArrayList<>();
        traverse(root,targetSum,currentPath,list);
        return list;
        

    }
}