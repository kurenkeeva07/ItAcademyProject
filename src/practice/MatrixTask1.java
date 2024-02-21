package practice;

import java.util.Random;

public class MatrixTask1 {
    public static void main(String[] args) {
        Random random = new Random();

        int sum = 0, rowsCount = 4, columnsCount = 4;
        int[][] matrix = new int[rowsCount][columnsCount];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(256);
                System.out.print(matrix[i][j] + "\t");
                sum += matrix[i][j];
            }
            System.out.println();
        }
        float averageBrightness = (float) sum / (rowsCount * columnsCount);
        System.out.println("Average of brightness: " + averageBrightness);
        System.out.println("Result:");

        int[][] blackAndWhiteMatrix = new int[rowsCount][columnsCount];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < averageBrightness) {
                    blackAndWhiteMatrix[i][j] = 0;
                } else blackAndWhiteMatrix[i][j] = 255; {
                    System.out.print(blackAndWhiteMatrix[i][j] + "\t");
                }
            }
            System.out.println();
        }
    }
}
