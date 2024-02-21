package practice;

public class NestedLoopsTask1 {
    public static void main(String[] args) {
        for(int number = 2; number <= 1000; number++) {
            boolean isSimple = true;
            for(int divider = 2; divider < number; divider++) {
                if (number % divider == 0) {
                    isSimple = false;
                    break;
                }
            }
            if (isSimple)
                System.out.println("Simple number: " + number);
        }
    }
}
