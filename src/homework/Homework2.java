package homework;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

         System.out.println("Enter 3 numbers: ");
         float num1 = sc.nextFloat();
         float num2 = sc.nextFloat();
         float num3 = sc.nextFloat();

         if (num1 == num2 && num2 == num3) {
             System.out.println("All numbers are the same");
         } else if (num1 != num2 && num1 != num3 && num2 != num3) {
             System.out.println("No the same numbers");
         } else if (num1 == num2) {
             System.out.println("Two numbers are the same: number 1: " + num1 + " and number 2: " + num2);
         } else if (num1 == num3) {
             System.out.println("Two numbers are the same: number 1: " + num1 + " and number 3: " + num3);
         } else if (num2 == num3) {
             System.out.println("Two numbers are the same: number 2: " + num2 + " and number 3: " + num3);
         }

    }
}
