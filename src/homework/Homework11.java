package homework;

import static javax.swing.JOptionPane.*;

public class Homework11 {
    public static void main(String[] args) {
        String currency = showInputDialog("Input your currency (USD, RUB, EUR, KZT)");
        String salesAndPurchase = showInputDialog("Write 1 if Sales" + "\n " + "Write 2 if purchase");
        int number = Integer.parseInt(salesAndPurchase);
        String amount = showInputDialog("Enter amount: ");
        double count = Double.parseDouble(amount);
        //double sale = getSalesOfCurrency( currency, count);
        //double purch = getPurchaseOfCurrency(currency, count);

       // if (sale && purch > 200000) {
         //   throw new Error();
         if (number == 2)
            showMessageDialog(null, "Sum of purchase of currency: " + getPurchaseOfCurrency(currency, count));
         else if (number ==1)
             showMessageDialog(null,"Sum of sales of currency: "+getSalesOfCurrency(currency, count));
         else
             showMessageDialog(null, "Your wrote incorrectly. \n Write correctly!");
       // }
        throw new Error();
    }
    static double getSalesOfCurrency(String currency, double count) {
        double sale;
        switch (currency.toUpperCase()) {
            case "USD":
                sale = 89.72;
                break;
            case "RUB":
                sale = 1;
                break;
            case "EUR":
                sale = 97;
                break;
            case "KZT":
                sale = 0.2;
                break;
            default:
                showMessageDialog(null, "Your wrote incorrect currently. \n Write correctly!");
                throw new Error();
        }
        double sum = sale * count;
        if (sum >= 200000) throw new Error();
        else return sum;
    }
    static double getPurchaseOfCurrency(String currency, double count) {
        double purch;
        switch (currency.toUpperCase()) {
            case "USD":
                purch = 89.40;
                break;
            case "RUB":
                purch = 0.97;
                break;
            case "EUR":
                purch = 96.30;
                break;
            case "KZT":
                purch = 12.58;
                break;
            default:
                showMessageDialog(null, "Your wrote incorrect currently. \n Write correctly!");
                throw new Error();
        }
        double sum = purch * count;
        if (sum >= 200000) throw new Error();
        else return sum;
    }
}




