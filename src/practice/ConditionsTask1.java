package practice;

import java.util.Scanner;

public class ConditionsTask1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 3 numbers: ");
        float x = sc.nextFloat();
        float y = sc.nextFloat();
        float z = sc.nextFloat();

        if (x >= y) {
            if (x >= z)
                System.out.println("The largest numner: " + x);
        } else {
            if (y > x)
                if (y >= z)
                    System.out.println("The largest number: " + y);
        }
        if (z > x) {
            if (z > y)
                System.out.println("The largest number: " + z);
        } else {
            if ( x == y )
                if ( y == z)
                    System.out.println("The largest number: " + x);
        }
    }
}

