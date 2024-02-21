package homework;

import java.util.Random;

public class Homework13 {
    public static void main(String[] args) {
        Random random = new Random();
        int size1 = 3, size2 = 3, sum = 0;
        int[][] square = new int[size1][size2];
        for (int i = 0; i < size1; i++){
            for (int j = 0; j < size2; j++) {
                square[i][j] = random.nextInt(9);
                System.out.print(square[i][j] + "\t");
                sum += square[i][j];
            }
        System.out.println();
         }
        float average = (float) sum / (size1 * size2);
        System.out.println("Average of bright: " + average);
    }
}
