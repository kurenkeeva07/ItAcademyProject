package practice;

import java.util.Random;

//ArrayTask2
public class ArrayTask2 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[10];
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(101);
            sum += numbers[i];
            System.out.println("Random number[" + i + "] = " + numbers[i]);
        }
        System.out.printf("Average of random numbers from 0 to 100: %.2f",  (float) sum / numbers.length);
    }
}
