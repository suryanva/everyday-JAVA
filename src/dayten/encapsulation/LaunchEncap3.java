package dayten.encapsulation;

// Shawdoing problem when there is a conflict between instance variable and local variable
class Fan {
    private int cost;
    private String brand;

    public void setCost(int cost){
        this.cost = cost;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public int getCost(){
        return cost;
    }
    public String getBrand(){
        return brand;
    }
}

public class LaunchEncap3 {
    public static void main(String[] args) {
        Fan obj = new Fan();
        obj.setBrand("Usha");
        obj.setCost(1500);
        System.out.println(obj.getBrand());
        System.out.println(obj.getCost());

    }

}
