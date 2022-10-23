package dayeight;

import java.util.Locale;

public class LaunchStringMethods {
    public static void main(String[] args) {
        String s1 = "DwayneJohnsonRock";
        System.out.println(s1.length());
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
        System.out.println(s1.endsWith("k"));
        System.out.println(s1.charAt(4));
        System.out.println(s1.contains("J"));
        System.out.println(s1.lastIndexOf("o"));
        System.out.println(s1.substring(6,13));
    }
}
