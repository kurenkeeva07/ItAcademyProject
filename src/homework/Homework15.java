package homework;

import java.util.Random;

public class Homework15 {
    public static void main(String[] args) {
        Random random = new Random();

        int sum = 0, rowsCount = 4, columnsCount = 4, maxElement = 0, minElement;
        int[][] matrix = new int[rowsCount][columnsCount];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(90);
                System.out.print(matrix[i][j] + "\t");
                if(matrix[i][j] > maxElement){
                    matrix[i][j] = maxElement;
                //} else if (matrix[i][j] < minElement) {

                }
            }
            System.out.println();
            System.out.println("Maximum: " + maxElement);
           // System.out.println("Minimum: " + minElement);
        }
    }
}
