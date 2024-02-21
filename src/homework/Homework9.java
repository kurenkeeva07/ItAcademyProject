package homework;

import java.util.Scanner;

public class Homework9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        int count = 0;
        int sum = 0;
        float average;

        do {
            System.out.println("Enter your number: ");
            number = sc.nextInt();
            count++;
            sum += number;
        } while (number != 0);
            average = (float) sum / count + 1;
            System.out.println("Amount of digits: " + (count - 1));
            System.out.println("Sum: " + sum);
            System.out.println("Average: " + average);

    }
}
