package dayeight;

public class LaunchStringConcat {
    public static void main(String[] args) {
        String str = "Telusko";
        String str2 = "Ineuron";
        System.out.println(str);//Telusko
        System.out.println(str.concat(str2));//TeluskoIneuron
        System.out.println(str2);//Ineuron
        String str3 = str.concat(str2);
        System.out.println(str3);//TelsukoIneuron
    }
}
