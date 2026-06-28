class Solution {
    public void traverse(TreeNode root,String currentpath,List<String> list){
        if(root==null) {
            return;
        }
        if(currentpath.isEmpty()) {
            currentpath +=root.val;
        }
        else {
        currentpath = currentpath+"->"+root.val;
        }
        if(root.left==null && root.right==null) {
            list.add(currentpath);
            return;
        }
        traverse(root.left,currentpath,list);
        traverse(root.right,currentpath,list);
    }
        
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        String currentpath = "";
        traverse(root,currentpath,list);
        return list;
    }
}