package topic;

import java.util.Random;
import java.util.Scanner;

public class JaggedArrays {
    public static void main(String[] args) {

        Random random = new Random();

        int[][] numbers = new int[3][];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = new int [random.nextInt(10)];
            for (int j = 0; j < numbers[i].length; j++) {
                numbers[i][j] = random.nextInt(200);
                System.out.print(numbers[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
