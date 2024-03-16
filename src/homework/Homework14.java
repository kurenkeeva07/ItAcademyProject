package homework;

import java.util.Scanner;

public class Homework14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your array: ");
        int size1 = sc.nextInt();
        int[] array = new int[size1];
        int count = 0;
        int max = array[0];
        for(int i = 0; i < size1; i++) {
            array[i] = sc.nextInt();
            if (array[i] > max) {
                max = array[i];
                count++;
            }
        }
        System.out.println("Maximum of elements: " + max);
        System.out.println("Amount of elements: " + count);
    }
}
