package daythree;

public class Conditionals {
    public static void main(String[] args) {
        int a = 10;
        int b = 34;
        if(a>b){
            System.out.println(a);
        }
        else  {
            System.out.println(b);
        }

        //Terinary Operator
        int age = 18;
        String result = age>=18 ? "allowed" : "not allowed";
        System.out.println(result);
    }
}
