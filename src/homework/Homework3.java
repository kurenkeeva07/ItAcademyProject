package homework;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter five integer: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();
        int num5 = sc.nextInt();

        if ( num1 == num2 && num2 == num3 && num3 == num4 && num4 == num5) {
            System.out.println("All integers are the same");
        } else if (num1 >= num2 && num1 >= num3 && num1 >= num4 && num1 >= num5) {
            System.out.println("Maximum integer: " + num1);
        } else if (num2 > num1 && num2 >= num3 && num2 >= num4 && num2 >= num5) {
            System.out.println("Maximum integer: " + num2);
        } else if (num3 > num1 && num3 > num2 && num3 >= num4 && num3 >= num5) {
            System.out.println("Maximum integer: " + num3);
        } else if (num4 > num1 && num4 > num2 && num4 > num3 && num4 >= num5) {
            System.out.println("Maximum integer: " + num4);
        } else {
            System.out.println("Maximum integer: " + num5);
        }
    }
}
