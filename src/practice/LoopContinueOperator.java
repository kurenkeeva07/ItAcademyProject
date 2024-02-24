package practice;

import java.util.Scanner;

public class LoopContinueOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array: ");
        int size = sc.nextInt();
        int[] array = new int[size];

        System.out.println();

        for (int i = 0; i < array.length; i++) {
            array [i] = i;
            if (i % 2 == 0) continue;
            System.out.println(i * i);
        }
        System.out.println();
        for (int i : array) {
            if (i % 2 == 0) continue;
            System.out.println(i * i);
        }
    }
}
