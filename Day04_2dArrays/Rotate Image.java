Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [[7,4,1],[8,5,2],[9,6,3]]



class Solution {
    public void rotate(int[][] matrix) {
        for(int i=0; i<matrix.length; i++){
            for(int j= i+1; j< matrix.length; j++){
                int temp= matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]= temp;
            }
        }

        for(int i=0; i< matrix.length; i++){

            int low=0; int high= matrix.length-1;

            while(low<high){
                int temp= matrix[i][low];
                matrix[i][low]=matrix[i][high];
                matrix[i][high]= temp;

                low++;
                high--;

            }
        }
    }
}