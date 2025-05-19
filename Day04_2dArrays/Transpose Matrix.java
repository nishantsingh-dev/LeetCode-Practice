Example 1:

Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [[1,4,7],[2,5,8],[3,6,9]]

class Solution {
    public int[][] transpose(int[][] matrix) {

        int[][] transposed = new int[matrix[0].length][matrix.length];

        for(int i = 0 ; i< matrix[0].length ; i++){
            for(int j = 0 ; j<matrix.length ; j++){
                transposed[i][j] = matrix[j][i];
            }
        }

        return transposed;
        
    }
}