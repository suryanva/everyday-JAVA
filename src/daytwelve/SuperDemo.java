package daytwelve;

// whenever a constructor is called from the sub class, the constructor of super class will also be executed
class X{

    public X(){
        System.out.println("In X");
    }
}

class Y extends X{
    public Y(){
        System.out.println("In Y");
    }
}
public class SuperDemo {
    public static void main(String[] args) {
        Y obj = new Y();
    }
}
