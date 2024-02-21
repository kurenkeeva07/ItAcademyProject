package practice;

import java.util.Scanner;

import static javax.swing.JOptionPane.showMessageDialog;

public class Calculator {
    public static void main(String[] args) {
        showMessageDialog(null, "Welcome to our Calculator");
        Scanner sc = new Scanner(System.in);
        double number1 = sc.nextDouble();
        String operation = sc.next();
        double number2 = sc.nextDouble();

        double result = 0;

        switch (operation) {
            case "+" :
                result = number1 + number2;
                break;
            case "-" :
                result = number1 - number2;
                break;
            case "*" :
                result = number1 * number2;
                break;
            case "/" :
                if (number2 == 0) {
                    System.out.println("Error");
                }
                result = number1 / number2;
                break;
            default:
                showMessageDialog(null, "Error");
                System.out.println("Error");
        }
        System.out.println(number1 + operation + number2 + " = " + result);
    }
}
