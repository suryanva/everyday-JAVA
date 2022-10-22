package dayseven;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        int a[][]= new int[3][4];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                Scanner in = new Scanner(System.in);
                System.out.println("Give me a number for "+i+"  "+j);
                a[i][j] = in.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(a));
    }
}
