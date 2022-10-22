package dayseven;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        //Array is an indexed based DS to store large amount of homogeneous data.
        int abc[] = new int[5];

        for (int i = 0; i < abc.length; i++) {
            Scanner inp = new Scanner(System.in);
            System.out.println("Give me a new Number for "+i+" index");
            abc[i] = inp.nextInt();
        }

        System.out.println(java.util.Arrays.toString(abc));
    }
}
