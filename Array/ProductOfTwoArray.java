public class ProductOfTwoArray {
    public static int[]  func(int[] arr1, int[] arr2){
        int[] result = new int [arr1.length];
        for(int i=0; i<arr1.length;i++){
            result[i] = arr1[i] * arr2[i];
           
        }
         return result;
    }
     public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {5, 6, 7, 8};

        int[] productArray = func(arr1, arr2);

        // Print result
        for (int val : productArray) {
            System.out.print(val + " ");
        }
    }
}
