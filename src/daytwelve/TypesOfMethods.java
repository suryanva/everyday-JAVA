package daytwelve;

class Plane {

    public void fly(){
        System.out.println("This plane takes off");
    }
//    this below method is called inherited method
    public void carry(){
        System.out.println("This plane carries");
    }
}

class PassengerPlane extends Plane{
//    this below fly method is called overridden method
    public void fly(){
        System.out.println("This plane takes off with more safety");
    }
//    This below method is called specialized method
    public void zoom(){
        System.out.println("this plane goes superfast");
    }

}

public class TypesOfMethods {
    public static void main(String[] args) {
        PassengerPlane obj1 = new PassengerPlane();
        obj1.fly();
        obj1.zoom();

        Plane obj2 = new PassengerPlane();
        obj2.fly();
        ((PassengerPlane) obj2).zoom();// This is called as Downcasting, Parent accessing specilized method from the child class.
    }
}
