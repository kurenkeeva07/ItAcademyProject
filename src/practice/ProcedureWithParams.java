package practice;

public class ProcedureWithParams {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int c = 7;
        printSum(a, b, c);
        printSum(17, 84, 44);
        printSum(9375, 5235, 6342);

        calculateAverage(70, 30);
        calculateAverage(100, 70);
    }
    static void printSum(int num1, int num2, int num3) {
        int sum = num1 + num2 + num3;
        System.out.println("Sum: " + sum);
    }

    static void calculateAverage(int num1, int num2) {
        int average = (num1 + num2) / 2;
        System.out.println("Average: " + "(" + num1 + " + " + num2 + ")" + " / " + 2 + " = " + average);
    }
}

