package dayten.encapsulation;

//usage of Constructor

class Fansed {

    public Fansed(int cost,int warranty,String brand){
        this.cost = cost;
        this.warranty =warranty;
        this.brand = brand;
    }
    public int getCost() {
        return cost;
    }


    public String getBrand() {
        return brand;
    }


    public int getWarranty() {
        return warranty;
    }


    private int cost;
    private String brand;
    private int warranty;
}

public class LaunchConstructor {
    public static void main(String[] args) {
        Fansed obj = new Fansed(500,5,"Usha");
        System.out.println(obj.getBrand());
        System.out.println(obj.getCost());
        System.out.println(obj.getWarranty());

    }

}
