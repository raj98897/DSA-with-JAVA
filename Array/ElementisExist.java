public class ElementisExist {
    public static int func(int[] arr, int x){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == x) return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int x = 3;
        int result = func(arr, x);
        System.out.print(result);
    }
    
}
