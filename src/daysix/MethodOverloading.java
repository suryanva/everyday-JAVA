package daysix;


import java.util.Scanner;

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
        Scanner inp = new Scanner(System.in);
        System.out.println("Input num 1");
        int num1 =inp.nextInt();
        System.out.println("Input num 2");
        int num2 = inp.nextInt();
        System.out.println("Input num 3");
        int num3 = inp.nextInt();

        Calculator i = new Calculator();

        int result = i.add(num2,num1,num3); //delegate your work
        int result2 = i.add(num3,num1);

        System.out.println(result);

    }
}
