

public class BuiltInMethods {
    public static void main(String[] args) {
        String str = "Varsha Singh";
        String strs = "Lily Mohan";
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.length());
        System.out.println(str.indexOf('a'));
        System.out.println(str.lastIndexOf('h'));
        System.out.println(str.indexOf("Singh"));
        System.out.println(str.indexOf("Raj")); // if index are not exist in the string then it return -1;
        System.out.println(str.contains("Singh"));
        System.out.println(str.startsWith("Var"));
        System.out.println(str.endsWith("gh"));
        
        // Lexographically 
        System.out.println(str.compareTo(strs)); // return character difference

        // concatination of strings
         str = str.concat(strs);
        System.out.println(str);


    }    
}
