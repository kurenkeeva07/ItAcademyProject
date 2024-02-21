package homework;

import java.util.Scanner;

public class Homework12 {
    public static void main(String[] args) {
        System.out.println("Enter your range: ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        for(int number = num1; number <= num2; number++) {
            boolean isSimple = true;
            for(int divider = 2; divider < number; divider++) {
                if (number % divider == 0) {
                    isSimple = false;
                    break;
                }
            }
            if (isSimple)
                System.out.println("Simple number: " + number);
        }
    }
}
