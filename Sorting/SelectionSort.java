public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {3,2,1,5,7,9,8,2,3};
        for(int i=0; i<arr.length; i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int el : arr ){
            System.out.print(el + " ");
        }
    }
    
}
