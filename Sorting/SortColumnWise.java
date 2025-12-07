import java.util.*;
public class SortColumnWise {
    public static int[][] transposeMatrix(int[][] matrix){
        int n = matrix.length;
        int m = matrix.length;
        int[][] transpose = new int[m][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }
    public static int[][] sortMatrixColumnWise(int[][] matrix){
        int[][] transpose = transposeMatrix(matrix);
        for(int i=0; i<transpose.length; i++){
            Arrays.sort(transpose[i]);
        }
        return transposeMatrix(transpose);
    }
    public static void main(String[] args) {
        
    }
    
}
