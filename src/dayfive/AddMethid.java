package dayfive;

public class AddMethid {
    public static void main(String[] args) {
        int a =23;
        int b = 33;
        int result = add(a,b);
        System.out.println(result);
    }

     static int add(int a, int b) {
        int calc = a + b;
        return  calc;
    }
}
