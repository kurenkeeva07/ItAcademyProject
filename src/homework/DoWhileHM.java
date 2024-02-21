package examples;
//Homework5
import java.util.Scanner;

public class DoWhileHM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int number1 = Math.abs(num1);
        int number2 = Math.abs(num2);
        int count = 0;
        long result = 0;

        while (count != number2) {
            result += number1;
            count++;
        }
        if (num1 < 0 && num2 < 0) {
            System.out.println("(" + num1 + ")" + " * " + "(" + num2 + ")" + " = " + result);
        } else if (num1 < 0 && num2 > 0) {
            System.out.println("(" + num1 + ")" + " * " + num2 + " = " + -result);
        } else if (num1 > 0 && num2 < 0) {
            System.out.println(num1 + " * " + "(" + num2 + ")" + " = " + -result);
        } else {
            System.out.println(num1 + " * " + num2 + " = " + result);
        }
    }
}
