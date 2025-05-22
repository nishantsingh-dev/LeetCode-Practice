Example 1:

Input: grid = [
  ["1","1","1","1","0"],
  ["1","1","0","1","0"],
  ["1","1","0","0","0"],
  ["0","0","0","0","0"]
]
Output: 1
Example 2:

Input: grid = [
  ["1","1","0","0","0"],
  ["1","1","0","0","0"],
  ["0","0","1","0","0"],
  ["0","0","0","1","1"]
]
Output: 3
 

class Solution {
    int m, n;
    public int numIslands(char[][] grid) {
       int numberOfIslands = 0 ; 
        m = grid.length;
        n = grid[0].length;

        for(int i = 0 ; i< m ; i++){
            for(int j = 0 ; j<n ; j++){
                if(grid[i][j]=='1'){
                    dfs(grid, i , j );
                    numberOfIslands++;
                }

            }
        }
        return numberOfIslands;
    }

    private void dfs(char[][]grid, int i , int j){

        if(i<0 || j<0|| i>=m || j>=n || grid[i][j]=='0'){
           return; 
        }

        grid[i][j]='0';

        dfs(grid, i-1 , j);
        dfs(grid, i , j-1);
        dfs(grid, i+1 , j);
        dfs(grid, i , j+1);
    }
}