package oop;

import java.util.Scanner;
public class RectangleTaskConstruction1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input length and width of rectangle: ");
        RectangleTaskConstruction rect = new RectangleTaskConstruction(scanner.nextDouble(), scanner.nextDouble());
        System.out.println("Length: " + rect.getLength() + "\n" +
                "Width: " + rect.getWidth());
    }
}
