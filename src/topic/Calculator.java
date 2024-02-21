package topic;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("numder 1: ");
        int x = sc.nextInt();

        System.out.print("number 2: ");
        int y = sc.nextInt();

        System.out.println("action");
        String act = sc.nextLine();
        act = sc.nextLine();

        switch (act){
            case "+":
                int res1 = x + y;
                System.out.println(res1);

            case "-":
                int res2 = x - y;
                System.out.println(res2);

            case "*":
                int res3 = x * y;
                System.out.println(res3);

            case "/":
                int res4 = x / y;
                System.out.println(res4);


        }
    }
}
