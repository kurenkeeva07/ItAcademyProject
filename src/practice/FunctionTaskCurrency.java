package practice;

import static javax.swing.JOptionPane.*;

public class FunctionTaskCurrency {
    public static void main(String[] args) {

        String currency = showInputDialog("Input your currency (USD, RUB, EUR, CNY)");
        showMessageDialog(null, "Exchange rate to som: " + getCurrentCurrencyRate(currency));
        //int result = showConfirmDialog(null, "Do you agree?");

    }

    static double getCurrentCurrencyRate(String currency){
            double rate;
            switch (currency.toUpperCase()) {
                case "USD":
                    rate = 89.32;
                    break;
                case "RUB":
                    rate = 0.98;
                    break;
                case "EUR":
                    rate = 97.17;
                    break;
                case "CNY":
                    rate = 12.58;
                    break;

                    default:
                        showMessageDialog(null, "Your wrote incorrect currently. \n Write correctly!");
                        throw new Error();
            }
            return rate;
    }
}

