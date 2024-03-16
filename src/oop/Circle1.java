package oop;

import java.util.Scanner;

public class Circle1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input radius: ");
        double radius = sc.nextDouble();
        System.out.println("Input color: ");
        String color = sc.next();
        System.out.println("Is it transparent?");
        boolean isTransparent = sc.hasNext();
        Circle circle1 = new Circle(radius, color, isTransparent);
        System.out.println("Perimeter: " + circle1.getPerimeter() + "\n" +
                "Square: " + circle1.getSquare() + "\n" +
                "Color: " + circle1.getColor());
    }
}
