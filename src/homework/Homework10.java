package homework;

import java.util.Scanner;

public class Homework10 {
    public static void main(String[] args) {
        System.out.println("Enter N: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        printLine(number);
        printLine(number);
    }
    static void printLine(int number) {

         while (number > 0) {
             System.out.print("-");
             number--;
         }
         System.out.println();
    }
}
