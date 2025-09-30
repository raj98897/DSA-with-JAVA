import java.util.Arrays;
public class MatrixMultiplication {
    public static void main(String[] args) {
        int a[][] = {{2,4,3},{5,6,6}};
        int b[][] = {{2,4},{5,6},{8,9}};

        if(a[0].length != b.length){
            System.out.println("Matrix multiplication not possible: columns of A must equal rows of B.");
            return;
        }
        int rows = a.length;
        int cols = b[0].length;
        int common = b.length;

        int[][] product = new int[rows][cols];

        for(int i=0; i<rows;i++){
            for(int j=0; j<cols; j++){
                for(int k = 0; k<common; k++){
                    product[i][j] += a[i][k] * b[k][j];

                }
            }
        }

        System.out.println("Result of matrix multiplication: ");
        for(int i=0; i<product.length;i++){
            System.out.println(Arrays.toString(product[i]));
        }

    }
}
