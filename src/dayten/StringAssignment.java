package dayten;

public class StringAssignment {
    public static void main(String[] args) {
//        WAP TO REVERSE A STRING 'iNeuron'
        String s1 = "iNeuron";
        String s2 = "";
        for (int i = s1.length()-1; i >= 0 ; i--) {
            s2 = s2 + s1.charAt(i);
        }
        System.out.println(s2);
    }
}
