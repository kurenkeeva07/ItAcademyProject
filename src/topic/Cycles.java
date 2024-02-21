package topic;

import java.util.Scanner;

public class Cycles {
    public static void main(String[] args) {
     //   while(true) {
     //       System.out.println("Hello!");
     //   }
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");

        long number = sc.nextLong();
        long count = 0;
        while (number > 0) {
            number = number /10;
            count++;
        }
        System.out.println("Amount of digits: " + count);
    }
}
