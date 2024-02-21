package practice;

import java.util.Random;

public class ArrayTask3 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[10];
        int less50Sum = 0;
        int more49Sum = 0;
        int less50Count = 0;
        int more49Count = 0;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(101);
            if (numbers[i] < 50) {
                less50Sum += numbers[i];
                less50Count++;
            } else {
                more49Sum += numbers[i];
                more49Count++;
            }
            System.out.println("Random number[" + i + "] = " + numbers[i]);
        }
        System.out.printf("Average of random numbers from 0 to 49: %.2f  \n", (float) less50Sum / less50Count);
        System.out.printf("Average of random numbers from 50 to 100: %.2f  \n", (float) more49Sum / more49Count);
    }
}
