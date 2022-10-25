package daynine;

public class Launch5 {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer("sachin");
        StringBuffer sb2 = new StringBuffer("sachin");
        System.out.println(sb1 == sb2);
        System.out.println(sb1.equals(sb2));//.equals comes from Object Class

// Below is Immutable
        String s1 = new String("tendulkar");
        String s2 = new String("tendulkar");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));//.equals comes from String Class



    }
}
