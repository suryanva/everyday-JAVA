package daythree;

public class Loops {
    public static void main(String[] args) {
        //For loop
        for (int i =0;i<5;i++){
            System.out.print("* ");
        }
        System.out.println(" ");
        //While loop
        int i =0;
        while(i<5){
            System.out.print("* ");
            i++;
        }

        System.out.println(" ");

        //Do while
        int j = 0;
        do{
            j++;
            System.out.print("* ");
        }while(j<5);
    }
}
