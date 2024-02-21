package homework;

import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите свой возраст: ");
        int age = sc.nextInt();
        int units = age % 10;

        if (age > 120) {
            System.out.println("Error");
        } else if (age < 0) {
            System.out.println("Error");
        }else if (units == 1 && age != 11 && age != 111) {
            System.out.println("Вам " + age + " год ");
        } else if (units == 2 && age != 12 && age != 112) {
            System.out.println("Вам " + age + " года ");
        } else if (units == 3 && age != 13 && age != 113) {
            System.out.println("Вам " + age + " года ");
        } else if (units == 4 && age != 14 && age != 114) {
            System.out.println("Вам " + age + " года ");
        } else if (units >= 5) {
            System.out.println("Вам " + age + " лет ");
        }else if (units == 0) {
            System.out.println("Вам " + age + " лет ");
        }else {
            System.out.println("Вам " + age + " лет ");
        }
    }
}
