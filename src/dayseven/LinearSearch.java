package dayseven;

public class LinearSearch {
    public static void main(String[] args) {
        int a[] = {12,45,67,76,34,78};
        int key = 66;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == key){
                System.out.println("Key found at index of "+ i);
                System.exit(0);
            }
        }
        System.out.println("Key not found");
    }
}
