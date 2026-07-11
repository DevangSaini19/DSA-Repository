// Brute Force
// class Solution {
//     public boolean searchMatrix(int[][] matrix, int target) {
//         for(int i=0;i<matrix.length;i++) {
//             for(int j=0;j<matrix[0].length;j++) {
//                 if(matrix[i][j]==target) {
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }
// }

class Solution { // Optimzed Solution using Binary Search
    public boolean searchMatrix(int[][] matrix, int target) {
    int rows = matrix.length;
    int cols = matrix[0].length;
        int l = 0;
        int r = rows * cols - 1;
        while(l<=r) {
        int mid = l + (r-l)/2;
        int a = mid/cols;
        int b = mid % cols;
        int v = matrix[a][b];
        if(v==target) {
            return true;
        }
        if(v<target) {
            l = mid + 1;
        }
        else {
            r = mid - 1;
        }
    }
    return false;
    }
}