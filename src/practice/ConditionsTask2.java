package practice;

import java.util.Scanner;

public class ConditionsTask2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Anton's age: ");
        float antonAge = sc.nextFloat();
        System.out.println("Boris's age: ");
        float borisAge = sc.nextFloat();
        System.out.println("Victor' age: ");
        float victorAge = sc.nextFloat();

        if (antonAge > borisAge && antonAge > victorAge) {
            System.out.println("Anton is the oldest");
        } else if (borisAge > antonAge && borisAge > victorAge) {
            System.out.println("Boris is the oldest");
        } else if (victorAge > antonAge && victorAge > borisAge) {
            System.out.println("Victor is the oldest");
        }
        else if (antonAge == borisAge && antonAge > victorAge) {
            System.out.println("Anton and Boris are the oldest");
        } else if (borisAge == victorAge && borisAge > antonAge) {
            System.out.println("Boris and Victor are the oldest");
        } else if (antonAge == victorAge && victorAge > borisAge) {
            System.out.println("Anton and Victor are the oldest");
        } else if (antonAge == borisAge && borisAge == victorAge) {
            System.out.println("They are the same age");
        }
    }
}
