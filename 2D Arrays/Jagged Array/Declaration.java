public class Declaration {
    public static void main(String[] args) {
        int arr[][] = new int [2][];
        arr[0] = new int[3];
        arr[1] = new int[2];

        // Method 1st for initialize a Jagged array
        int arr_name[][] = new int[][] {
            new int[] {1,2,3,4,5},
            new int[] {6,7,8},
            new int[] {9,10}
        };

        // Method 2nd 
        int[][] arr_name2 = {
            {1,2,3,4},
            {5,6,7},
            {8,9,10}
        };



        int count = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length;j++){
                arr[i][j] = count++;
            }
        }
        for(int i=0; i<arr.length;i++){
            for(int j=0; j<arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
