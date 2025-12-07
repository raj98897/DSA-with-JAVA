

public class MoreStringMethods {
    public static void main(String[] args) {
        String s = "Bhakti";
        s += " hi shakti hai";
        s += 10;
        s += 'X';
        s += '\0';
        s += '\n';
        s += 'R';
        s = "Hero: " + s;
        double n = 000.006700;
        String x = "" + n;
        System.out.println(s);
        System.out.println("Bhakti"+10+20);
        System.out.println(10 + 20 + "Shakti");
        System.out.println(10 + "Bhakti" + 20);
        System.out.println('A'+2+"Isha");
        System.out.println(x.length());
    }    
}
