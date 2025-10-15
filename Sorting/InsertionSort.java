class InsertionSort{
    public static void main(String[] args) {
        int arr[] = {3,2,4,2,1,5};
        for(int i=1; i < arr.length; i++){
            int j = i-1;
            int original = arr[i];
            while(j >= 0 && original < arr[j]){
                arr[j+1] = arr[j];
                j--;

            }
            arr[j+1] = original;
        }
        for(int el : arr){
            System.out.print(el + " ");
        }
    }
}