package dayseven;

import java.util.Arrays;
import java.util.Scanner;

public class JaggedArray {
    public static void main(String[] args) {
        int a[][]= new int[3][];
        //Jagged array is where you have different size for each row items
        a[0] = new int[3];
        a[1] = new int[2];
        a[2] = new int[4];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                Scanner input = new Scanner(System.in);
                System.out.println("Give me a number for "+i+" "+j+" ");
                a[i][j] = input.nextInt();
            }
        }

        System.out.println(Arrays.deepToString(a));

    }
}
