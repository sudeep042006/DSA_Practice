/*
 * @lc app=leetcode id=54 lang=java
 *
 * [54] Spiral Matrix
 */

// @lc code=start
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;

        while(startRow <= endRow && startCol <= endCol){
            //top
            for(int j = startCol; j <= endCol; j++){
                ans.add(matrix[startRow][j]);
            }

            //right
            for(int i = startRow + 1; i <= endRow; i++){
                ans.add(matrix[i][endCol]);
            }

            //bottom
            if(startRow != endRow){
                for(int j = endCol-1; j >= startCol; j-- ){
                    ans.add(matrix[endRow][j]);
                }
            }

            //left
            if(startCol != endCol){
                for(int i = endRow-1; i >= startRow + 1; i--){
                    ans.add(matrix[i][startCol]);
                }
            }
            startRow++;
            startCol++;
            endCol--;
            endRow--;
        }

        return ans;
    }
}
// @lc code=end

