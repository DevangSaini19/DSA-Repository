class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
    List<Integer> ans = new ArrayList<>();
    int top = 0,right = matrix[0].length - 1,left = 0,bottom = matrix.length - 1;
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++) {
                ans.add(matrix[top][i]);
            }
            top++;
            for(int j=top;j<=bottom;j++) {
                ans.add(matrix[j][right]);
            }
            right--;
            if (top > bottom || left > right) break;
            for(int a=right;a>=left;a--) {
                ans.add(matrix[bottom][a]);
            }
            bottom--;
            for(int b=bottom;b>=top;b--) {
                ans.add(matrix[b][left]);
            }
            left++;
        }
        return ans;
    }
}