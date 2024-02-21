package homework;

import java.util.Scanner;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Homework1 {
    public static void main(String[] args) {

        String nm = showInputDialog("Enter your name");
        showMessageDialog(null, "Hello, " + nm + "!");

        String pointA1 = showInputDialog("Enter the first coordinate of point A");
        float x1x = Float.parseFloat(pointA1);
        String pointA2 = showInputDialog("Enter the second coordinates of point A");
        float x2x = Float.parseFloat(pointA2);

        String pointB1 = showInputDialog("Enter the first coordinate of point B");
        float y1y = Float.parseFloat(pointB1);
        String pointB2 = showInputDialog("Enter the second coordinate of point B");
        float y2y = Float.parseFloat(pointB2);

        double pow1 = Math.pow((x1x - x2x), 2);
        double pow2 = Math.pow((y1y - y2y), 2);
        double rs = Math.sqrt(pow1 + pow2);

        showMessageDialog(null, "The length of segment AB = " + rs);


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Hello, " + name + "!");

        System.out.println("Enter the coordinates of point A: ");
        double x1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        System.out.println("Enter the coordinates of point B: ");
        double y1 = sc.nextDouble();
        double y2 = sc.nextDouble();

        double step1 = Math.pow((x1 - x2), 2);
        double step2 = Math.pow((y1 - y2), 2);
        //System.out.println(step1);

        double result = Math.sqrt(step1 + step2);
        System.out.print("The length of segment AB = " + result);





    }
}
