package topic;

import java.util.Random;

import static javax.swing.JOptionPane.showMessageDialog;

public class MyRandom {
    public static void main(String[] args) {
        Random rn = new Random();
        int num1 = rn.nextInt();
        num1 = rn.nextInt(5000);
        System.out.println(num1);

        //showMessageDialog(null, "Your random number: " + num1);

        int min = 100;
        int max = 1000;
        int result = rn.nextInt((max - min) + 1) + min;
        System.out.println("Random number between min(" + min + ") and max(" + max + ") = " + result);

        showMessageDialog(null, "Your random number between min(100) and max(1000) = " + result);




    }
}