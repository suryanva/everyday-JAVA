package Dayeleven;

import java.rmi.AlreadyBoundException;

class Alien{

    private int age;
    private String name;

    static int count;

    {
        count++;
    }
    public Alien(){

    }
    public Alien(int age){
        this.age = age;
    }
    public Alien(int age, String name){
        this.age=age;
        this.name =name;
    }
}

public class WapCountObject {
    public static void main(String[] args) {
        Alien a1 = new Alien();
        Alien a2 = new Alien(24);
        Alien a3 = new Alien(35,"Rahool");

        System.out.println(Alien.count);
    }
}
