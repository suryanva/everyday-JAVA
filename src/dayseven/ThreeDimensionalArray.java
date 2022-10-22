package dayseven;

import java.util.Arrays;
import java.util.Scanner;

public class ThreeDimensionalArray {
    public static void main(String[] args) {
        int a[][][] = new int[3][2][4];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                for (int k = 0; k < a[i][j].length; k++) {
                    Scanner in = new Scanner(System.in);
                    System.out.println("Give me the number for"+i+" "+j+" "+k);
                    a[i][j][k] = in.nextInt();
                }
            }
        }
        System.out.println(Arrays.deepToString(a));

    }
}
