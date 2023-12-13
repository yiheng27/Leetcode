class Solution {
    public int numSpecial(int[][] mat) { //using sumRow[] & sumCol[]
        int m = mat.length; //row number
        int n = mat[0].length; //col number
        int number = 0;
        
        int[] sumRow = new int[m];
        int[] sumCol = new int[n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if (mat[i][j] == 1){
                    sumRow[i]++;
                    sumCol[j]++;
                }
            }
        }

        for(int r=0; r<m; r++){
            for(int c=0; c<n; c++){
                if (mat[r][c] == 1){
                    if(sumRow[r] == 1 && sumCol[c] == 1){
                        number++;
                    }
                }
            }
        }
        return number;
    }

    public int numSpecial2(int[][] mat){ //without extra space
        int m = mat.length; //row number
        int n = mat[0].length; //col number
        int number = 0;

        for(int row=0; row<m; row++){
            int start = -1;
            for(int col = 0; col<n; col++){//iterate through row
                if(mat[row][col] == 1){
                    if (start != -1){ //if repeated 1 in row
                        start = -1;
                        break;
                    } else{
                        start = col; //first 1 in row
                    }
                    
                }
            }
            if(start==-1){ //if repeated, go next row
                continue;
            }
            for(int r=0; r<m; r++){ //iterate that col
                if(mat[r][start] == 1){ //if = 1
                    if(r == row){ //if r is current row
                        continue; //go next
                    }else{
                        number--;
                        break; //else not the only 1 in col, go next
                    }
                }
            }
            number++; //col only have one 1
        }
        return number;
    }
}