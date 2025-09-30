public class MaximumSubarray {
    public static void main(String[] args) {
        int mx = Integer.MIN_VALUE;
        int arr[] = { 3, -4, 2, 3, -2, 4};
        int sum = 0;
        // Kadane's algorithm
        for(int i=0; i< arr.length;i++){
            sum += arr[i];
            if(mx < sum ) mx = sum;
            if(sum < 0) sum = 0;
        }
        System.out.print(mx);
    }

}
