package dayten;

import java.util.Arrays;

public class ProblemTwo {
    public static void main(String[] args) {
//        WAP to reverse a sentence while preserving the position.
//        Input : “Think Twice”
//        Output : “kniht eciwt”
        String s1 = "Think Twice";
        String []s2 = s1.split(" ");
        System.out.println(Arrays.toString(s2));
        String s3 = s2[0];
        String s4 = s2[1];
        String revs3 = "";
        String revs4 = "";
        for (int i = s3.length()-1; i >= 0 ; i--) {
            revs3 = revs3 + s3.charAt(i);
        }
        for (int i = s4.length()-1; i >= 0 ; i--) {
            revs4 = revs4 + s4.charAt(i);
        }
        String output = revs3 +" "+revs4;
        System.out.println(output);
    }
}
