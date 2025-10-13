public class BubbleSort {
    public static void main(String[] args){
        int arr[] = {2,5,6,1,2,7,9,8};
        int n = arr.length;
        for(int i=n-1; i>=0; i--){
            for(int j=0; j<i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int el: arr){
            System.out.print(el + " ");
        }
    }
    
}
