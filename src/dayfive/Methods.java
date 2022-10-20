package dayfive;

public class Methods {
    public static void main(String[] args) {
        Laptop i = new Laptop();
        i.ram = 16;
        i.doSomething();


    }
}
class Laptop {
    String name = "Intel";
    int ram;
    int hdd;

    public  void doSomething() {
        System.out.println("COmpiling");
        System.out.println(ram);
    }
}