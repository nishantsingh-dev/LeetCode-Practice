Input: mat = [[1,2,3],
              [4,5,6],
              [7,8,9]]
Output: 25
Explanation: Diagonals sum: 1 + 5 + 9 + 3 + 7 = 25
Notice that element mat[1][1] = 5 is counted only once.


class Solution {
    public int diagonalSum(int[][] mat) {

        int res = 0 ;

        for( int  i = 0 ; i< mat.length ; i++){

            res += mat[i][i];
            res += mat[mat.length-i-1][i];
        
        }

        return mat.length%2 == 0 ? res : res - mat[mat.length/2][mat.length/2];
        
    }
}