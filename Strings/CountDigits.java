import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = Integer.toString(n);
        int count = 0;
        for(int i=0; i<s.length();i++){
            count++;
        }
        System.out.println(count);
        sc.close();
    }    
}
