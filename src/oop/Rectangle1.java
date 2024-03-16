package oop;

import java.util.Scanner;

public class Rectangle1 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        Rectangle rectangleTwo = new Rectangle();

        System.out.println("Input length of rectangle: ");
        rectangleTwo.setLength(scanner.nextDouble());

        System.out.println("Input width of rectangle: ");
        rectangleTwo.setWidth(scanner.nextDouble());

        System.out.println("Choose color: ");
        rectangleTwo.color = scanner.next();

        System.out.println("Square os Rectangle: " + rectangleTwo.getRectangleSquare());
        System.out.println("Color: " + rectangleTwo.color);
        System.out.println();

        Rectangle rectangleOne = new Rectangle();

        System.out.println("Input length of rectangle: ");
        rectangleOne.length = scanner.nextDouble();

        System.out.println("Input width of rectangle: ");
        rectangleOne.width = scanner.nextDouble();

        System.out.println("Square os Rectangle: " + rectangleOne.getRectangleSquare());
        System.out.println();

    }
}
