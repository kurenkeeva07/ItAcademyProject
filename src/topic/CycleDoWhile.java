package topic;

import java.util.Scanner;

public class CycleDoWhile {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int number;
        do {
            System.out.println("Enter your number: ");
            number = sc.nextInt();
        } while (number >= 0); {
            System.out.println("Finish!");
        }
    }
}
