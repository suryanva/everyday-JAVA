package Dayeleven;

class Demo{

    public static void disp1(){
        System.out.println("static method");
    }
    public void disp2(){
        System.out.println("non static method");
    }

}
public class LaunchDirectDemo {
    public static void main(String[] args) {
        Demo.disp1();

        Demo sc = new Demo();
        sc.disp2();
    }

}
