package daynine;

public class StringFinal {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer("Kohli");
        sb1.append("IND");
        System.out.println(sb1);

        final StringBuffer sb2 = new StringBuffer("Tendulkar");
        sb2.append("IND");
        System.out.println(sb2);

//        sb2 = new StringBuffer("Abcd");// WIll get compile time error
//        System.out.println(sb2);
    }
}
