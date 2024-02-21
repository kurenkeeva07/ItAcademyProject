package topic;

import java.util.Scanner;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Conditions {
    public static void main(String[] args) {

        boolean isEquals = 5 == 3;
        boolean isMore = 5 > 6;
        boolean isLess = 5 < 6;
        boolean isLessOrEquals = 5 <= 2;
        boolean isMoreOrEquals = 5 >= 2;
        boolean isNotEquals = 5 != 8;

        System.out.println("5 is less than 6 is " + isLess);
        System.out.println(isEquals + " " + isMore + " " + isLessOrEquals + " " + isMoreOrEquals + " " + isNotEquals);


        String num1 = showInputDialog("Enter 1 number ");
        float x = Float.parseFloat(num1);
        String num2 = showInputDialog("Enter 2 number ");
        float y = Float.parseFloat(num2);

        if (x > y) {
            showMessageDialog(null,"The smallest number: " + y);
        }
        else {
            showMessageDialog(null, "The smallest number; " + x);
        }

        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();

        if (a > b) {
            System.out.println("The smallest number: " + b);
        }
        else {
            System.out.println("The smallest number: " + a);
        }

    }
}