package practise;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayTask1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Random random = new Random();

        System.out.println("Enter minimum: ");
        int min = sc.nextInt();
        System.out.println("Enter maximum: ");
        int max = sc.nextInt();

        int[] array = new int[100];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt((max - min) + 1) + min;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println("Array[" + i + "] = " + array[i]);
        }
        System.out.println(Arrays.toString(array));
    }
}
