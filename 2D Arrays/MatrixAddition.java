import java.util.Arrays;
public class MatrixAddition {
    public static void main(String[] args){
        int a[][] = {{1,2,3},{4,5,6}};
        int[][] b = {{4,5,6},{1,2,3}};

        // Check if addition is possible
        if (a.length != b.length || a[0].length != b[0].length) {
            System.out.println("Matrix addition not possible: dimensions do not match.");
            return;
        }
        
        int[][] sum = new int[a.length][a[0].length];
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[i].length; j++){
                sum[i][j] = a[i][j] + b[i][j];
            }
        }

        for(int i=0; i<sum.length; i++){
            System.out.println(Arrays.toString(sum[i]));
        }
    }
    
}
