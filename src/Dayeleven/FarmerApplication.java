package Dayeleven;

import java.util.Scanner;

class Farmer{
    private float pa;
    private float td;
    private float si;
    static private float ri;

    static {
        ri = 2.5f;
    }

    public void acceptInput(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Dear, Kindly enter the amount needed");
        pa = scan.nextFloat();
        System.out.println("Dear, Kindly enter the time needed ");
        td = scan.nextFloat();
    }

    public void compute(){
        si=(pa*ri*td)/100;
    }

    public void disp(){
        System.out.println("Simple interst is "+ si);
    }
}
public class FarmerApplication {
    public static void main(String[] args) {
        Farmer f1 = new Farmer();
        Farmer f2 = new Farmer();

        f1.acceptInput();
        f1.compute();
        f1.disp();

        f2.acceptInput();
        f2.compute();
        f2.disp();
    }
}
