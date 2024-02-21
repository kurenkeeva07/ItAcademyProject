package homework;

import java.util.Scanner;

public class Homework7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number1 = sc.nextInt();
        int result = 0;
        for (int mult = 1; mult <=10; mult++) {
            result += number1;
            System.out.println(number1 + " * " + mult + " = " + result);
        }
    }
}
