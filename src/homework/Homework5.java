package homework;

import java.util.Scanner;

public class Homework5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers: ");
        int numberX = sc.nextInt();
        int numberA = sc.nextInt();
        int var = 0;
        long result = 0;

        if (numberA >= 0) {
            while (var != numberA){
            result+=numberX;
            var++;
            }
        } else {
            while (var != numberX && var != -numberX) {
                result+=numberA;
                var++;
            }
        }
        System.out.println(numberX + " * " + numberA + " = " + result);
    }
}
