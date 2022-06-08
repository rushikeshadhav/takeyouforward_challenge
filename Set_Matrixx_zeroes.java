import java.util.* ;
import java.io.*; 
public class Solution {
    public static void setZeros(int matrix[][]) {
        // Write your code here..
        int row = matrix.length;
        int col = matrix[0].length;
        int[] dummy1 = new int[row];
        int[] dummy2 = new int[col];
        Arrays.fill(dummy1, -1);
        Arrays.fill(dummy2, -1);

        for(int i = 0; i<row; i++){
            for(int j = 0; j<col; j++){
                if(matrix[i][j] == 0){
                    dummy1[i] = 0;
                    dummy2[j] = 0;
                }
            }
        }
        
        for(int i = 0; i<row; i++){
            for(int j = 0; j<col; j++){
                if(dummy1[i] == 0 || dummy2[j] == 0){
                    matrix[i][j] = 0;
                }
            }
        }
    }

}