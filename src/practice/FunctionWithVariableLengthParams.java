package practice;

public class FunctionWithVariableLengthParams {
    public static void main(String[] args) {
        calculateSum(1,2,3,4,5,6,7,8,9,10);
        calculateSum(1,2,3,4,5);
        calculateSum(43,74,26,7,32,7,4,5,8);
    }
    public static void calculateSum(int... nums) {
        int sum = 0;
        for (int i : nums) {
            if (i % 2 == 0) continue;
            int oddNumberSquare = i * i;
            sum += oddNumberSquare;
        }
        System.out.println("Amount of numbers: " + nums.length + "\t Sum of odd numbers: " + sum);
    }
}

