package examples;

import java.util.Scanner;

public class ConditionTaskAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите свой возраст: ");
        int age = sc.nextInt();

        int units = age % 10;
        int decimals =  age / 10 % 10;
        int hundreds = age /100 % 10;
        String result;

        if (decimals != 1 && units > 1 && units <= 4) {
            result = " года";
        } else if (units == 1) {
            result = " год";
        } else {
            result = " лет";
        }
        System.out.println("Вам " + age + result);
    }
}
