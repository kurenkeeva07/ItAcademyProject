package practise;

import java.util.Scanner;

public class CycleDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integer: ");

        int number = sc.nextInt();
        boolean hasSameNumberNear = false;

        do {
            int last = number % 10;
            number = number / 10;
            int preLast = number % 10;
            if (last == preLast) {
                hasSameNumberNear = true;
                break;
            }
        } while (number > 0);
            if (hasSameNumberNear) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
    }
}
