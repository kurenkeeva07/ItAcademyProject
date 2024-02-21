package homework;

import java.util.Scanner;

public class Homework14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your array: ");
        int size1 = sc.nextInt(), count = 0, max = 0, amount = 0;
        int[] array = new int[size1];
        for(int i = 0; i < size1; i++) {
            array[i] = sc.nextInt();
            count++;
            if (array[i] > max) {
                max = array[i];
                amount = 1;
            } else if (array[i] == max) {
                amount++;
            }
        }
        System.out.println("Maximum of elements: " + max);
        System.out.println("Amount of elements: " + count);
    }
}
