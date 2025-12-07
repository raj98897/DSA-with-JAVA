public class StringsToCharArray {
    public static void main(String[] args) {
        String s = "Varsha Singh";
        char[] arr = s.toCharArray();
        for(char ele: arr){
            System.out.print(ele + " ");
        }
        System.out.println(arr);
    }
}
