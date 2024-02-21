package topic;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class MessageDialog {
    public static void main(String[] args) {
        showMessageDialog(null, "Continue");

        String name = showInputDialog("Enter your  name");
        System.out.println("Your name: " + name);

        String age = showInputDialog("Enter your age");
        int ag = Integer.parseInt(age);
        System.out.println("Your age: " + ag);

        String height = showInputDialog("Enter your height");
        double hgh = Double.parseDouble(height);
        System.out.println("Your height: " + hgh + "m");

        String weight = showInputDialog("Enter your weight");
        double wgh = Double.parseDouble(weight);
        int wegh = Integer.parseInt(weight);
        System.out.println("Your weight: " + weight + "kg");

        String num1 =  showInputDialog("First number: ");
        double var1 = Double.parseDouble(num1);
        String num2 = showInputDialog("Second number: ");
        double var2 = Double.parseDouble(num2);

        double sum = var1 + var2;

        String result = "First number: " + var1 + "\n" +
                        "Second number: " + var2 + "\n" +
                        "Summa: " + sum;

        showMessageDialog(null, result);

        System.out.println(result);












     }
}