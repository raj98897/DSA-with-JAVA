public class RotateAnArray {
    public static int[] Reverse(int arr[], int start, int end){
        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }
    public static void RotateArr(int arr[], int d){
        int n = arr.length;
        d %= n;
        Reverse(arr,0,d-1);
        Reverse(arr,d,n-1);
        Reverse(arr,0,n-1);

    }
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,6,7,8,9};
        int d = 3;
        RotateArr(arr,d);
        for(int num : arr){
            System.out.print(num + " ");
        }

    }
    
}
