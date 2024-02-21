package homework;

import java.util.Scanner;

public class Homework8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input your range: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int result = num1;

        if(num1 % 2 == 0) {
            num1 = num1 + 1;
            result++;
        }
        do {
            num1 = num1 + 2;
            result += num1 ;
        } while (num1 <= num2 - 2); {
            System.out.println("Sum of your range: " + result);
        }
    }
}
