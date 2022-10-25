package dayten;

import java.util.Scanner;

public class ProblemThree {
    public static void main(String[] args) {
//        WAP to check if the String is Anagram or not.
        Scanner in = new Scanner(System.in);
        System.out.println("Give me a word ");
        String s1 = in.nextLine();
        String s2 = "";
        for (int i = s1.length()-1; i >= 0 ; i--) {
            s2 = s2 + s1.charAt(i);
        }
        if (s1.equals(s2)){
            System.out.println(s1+" is a Palindrome");
        }
        else System.out.println(s1 + " is not a Palindrome");
    }
}
