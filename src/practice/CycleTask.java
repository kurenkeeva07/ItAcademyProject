package practice;

import java.util.Scanner;

public class CycleTask {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("Enter 2 numbers: ");
            int numA = sc.nextInt();
            int numB = sc.nextInt();

            while (numA == 0 && numA <= numB) {
                double pow = Math.pow(numA, 2);
                System.out.println(numA + " * " + numA + " = " + pow);
                numA++;
            }
        }
    }
}
