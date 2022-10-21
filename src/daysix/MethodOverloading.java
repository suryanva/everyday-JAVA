package daysix;


class Calculator {

    public int add(int a ,int b){
        int c = a+b;
        return c;
    }
    public int add(int a ,int b,int c){
        int d = a+b+c;
        return d;
    }

}
public class MethodOverloading {
    public static void main(String[] args) {
        int num1 =5;
        int num2 = 6;
        int num3 = 8;

        Calculator i = new Calculator();

        int result = i.add(num2,num1,num3); //delegate your work

        System.out.println(result);

    }
}
