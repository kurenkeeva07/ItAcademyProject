package topic;

import java.util.Scanner;

public class MyScanner {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        System.out.print("Input a number: ");
        byte num = sc.nextByte();
        System.out.printf("Your number: %d \n", num );

        System.out.print("Input name: ");
        String name = sc.nextLine();

        System.out.print("Input age: ");
        int age = sc.nextInt();

        System.out.print("Input height: ");
        float height = sc.nextFloat();

        System.out.printf("Name: %s Age: %d Height: %.2f \n", name, age,height);
        sc.close();










    }
}