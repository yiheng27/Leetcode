class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int m = grid.length; //number of rows
        int n = grid[0].length; //number of columns
        int[] diffRow = new int[m];
        int[] diffCol = new int[n];
        for(int r = 0; r<m; r++){ //iterate row
            for(int c = 0; c<n; c++){ //iterate col
                if(grid[r][c] == 1){
                    diffRow[r]++;
                    diffCol[c]++;
                }else{ //grid == 0
                    diffRow[r]--;
                    diffCol[c]--;
                }
            }
        }

        int[][] diff = new int[m][n];
        for(int r = 0; r<m; r++){ //iterate row
            for(int c = 0; c<n; c++){ //iterate col
                diff[r][c] = diffRow[r] + diffCol[c];
            }
        }
        return diff;
    }
    
}