

public class PassingStringToMethod {
    public static void change(String x){
        x = "Ram";
    }
    public static void main(String[] args) {
        String x = "Raaz";
        System.out.println(x);
        change(x);
        System.out.println(x);
    }    
}
