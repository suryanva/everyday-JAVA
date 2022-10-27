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
}
