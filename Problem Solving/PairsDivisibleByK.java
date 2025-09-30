public class PairsDivisibleByK {
    public static void main(String[] args) {
        int arr[] = {2,2,1,7,5,3};
        int k = 4;
        long count =0;
        int map[] = new int[k];
        for(int i=0; i< arr.length; i++){
            int mod = arr[i]%k;
            int inverse = (k-mod)%k;
            count += map[inverse];
            map[mod]+=1;
        }
        System.out.print(count);
    }    
}
