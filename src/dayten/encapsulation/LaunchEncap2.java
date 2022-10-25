package dayten.encapsulation;

class Alien {
    int age;
    String name;
    public void setAge(int x){
        age = x;
    }

    public void setName(String y) {
        name = y;
    }
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
}

public class LaunchEncap2 {
    public static void main(String[] args) {
        Alien obj = new Alien();
        obj.setAge(25);
        obj.setName("Surya");
        System.out.println(obj.getAge());
        System.out.println(obj.getName());
    }
}
