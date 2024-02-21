package topic;

import java.util.Scanner;

public class Function {
    public static void main(String[] args) {
        System.out.println("Enter numbers to calculate: ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();;
        int sum = calculateSum(num1, num2, num3);
        System.out.println("Your sum: " + sum);
    }
    static int calculateSum(int num1, int num2, int num3) {
        int sum = num1 + num2 + num3;
        return sum;
    }
}
