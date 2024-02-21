package practice;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayTask4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Enter your number from 0 to 5: ");
        int number = sc.nextInt();
        int iX = -1;
        int[] numbers = new int[100];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(6);
            if (numbers[i] == number){
                iX = i;
                System.out.println("Found number[" + iX + "] = " + number);
                System.out.println(Arrays.toString(numbers));
            }
        }
        if (iX < 0)
            System.out.println("You wrote incorrectly!");
    }
}
