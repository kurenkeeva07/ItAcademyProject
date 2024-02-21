package practice;

import java.util.Scanner;


public class FunctionTask {
    public static void main(String[] args) {
        System.out.println("Enter your number: ");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum1 = 0;

        int sum2 = calculateSum(num, sum1);
        System.out.println("Your sum: " + sum2);

        if (sum2 > 50) {
            System.out.println("Your sum more than 50");
        } else {
            System.out.println("Your sum not more than 50");
        }
    }
    static int calculateSum(int num, int sum) {
        while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        return sum;
    }
}
