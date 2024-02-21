package topic;

import java.util.Scanner;

public class Procedure {
    public static void main(String[] args) {
        printMultiplicationTable();

    }
        static void printMultiplicationTable() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Input your number: ");
            int number = sc.nextInt();
            for (int count = 1; count <= 10; count++) {
                System.out.println(number + " * " + count + " = " + number * count);
            }
        }
}
