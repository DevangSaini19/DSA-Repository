class Solution {
    public TreeNode helper(int[] preorder, int a , int b,int[] inorder , int c , int d,HashMap<Integer,Integer> map) {
        if(a>b || c>d) {
            return null;
        }
        TreeNode root = new TreeNode(preorder[a]);
        int n = map.get(root.val);
        int numleft = n - c;
        root.left = helper(preorder,a+1,a+numleft,inorder,c,n-1,map);
        root.right = helper(preorder,a + numleft + 1, b, inorder,n + 1,d, map);
        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<inorder.length;i++) {
            map.put(inorder[i],i);
        }
        int a = 0;
        int b = preorder.length - 1;
        int c = 0;
        int d = inorder.length - 1;
        return helper(preorder,a,b,inorder,c,d,map);

    }
}