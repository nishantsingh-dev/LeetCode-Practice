Input: grid = [[0,0,1,0,0,0,0,1,0,0,0,0,0],
               [0,0,0,0,0,0,0,1,1,1,0,0,0],
			   [0,1,1,0,1,0,0,0,0,0,0,0,0],
			   [0,1,0,0,1,1,0,0,1,0,1,0,0],
			   [0,1,0,0,1,1,0,0,1,1,1,0,0],
			   [0,0,0,0,0,0,0,0,0,0,1,0,0],
			   [0,0,0,0,0,0,0,1,1,1,0,0,0],
			   [0,0,0,0,0,0,0,1,1,0,0,0,0]]
Output: 6
Explanation: The answer is not 11, because the island must be connected 4-directionally.

class Solution {
    private int n, m;
    public int maxAreaOfIsland(int[][] grid) {
        n= grid.length;
        m = grid[0].length;
        int ans =0;
        

        for(int  i = 0 ; i< n ; i++){
            for(int j = 0 ; j< m ; j++){
                if(grid[i][j]>0){
                    ans = Math.max(ans, trav(grid, i , j));
                }
            }
        }

        return ans;
    }

    private int trav(int[][]grid, int i , int j){
        if(i<0 || i>=n || j<0 || j>= m || grid[i][j]<1){
            return 0 ;
        }
        grid[i][j]=0;

        return 1+trav(grid,i-1 ,j)+trav(grid,i ,j-1)+trav(grid,i+1 ,j)+trav(grid,i ,j+1);
    
    }
}