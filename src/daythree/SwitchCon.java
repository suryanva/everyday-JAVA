package daythree;

public class SwitchCon {
    public static void main(String[] args) {
        int num = 3;
        //Enhanced Switch case
        switch (num) {
            case 1 -> System.out.println("One");
            case 2 -> System.out.println("Two");
            case 3 -> System.out.println("Three");
            default -> System.out.println("Out of Range");
        }
    }
}
