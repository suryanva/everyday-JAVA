package daythree;

public class Loops {
    public static void main(String[] args) {
        //For loop
        for (int j = 0; j <= 5; j++) {
            for (int i =0;i<j;i++){
                System.out.print("* ");
            }
            System.out.println();
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
