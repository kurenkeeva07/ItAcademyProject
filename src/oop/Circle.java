package oop;

public class Circle {
    double radius;
    String color;
    boolean isTransparent = false;

    public boolean isTransparent() {
        return isTransparent;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setTransparent(boolean transparent) {
        isTransparent = transparent;
        if (!transparent)
            System.out.println("yes");
        else {
            System.out.println("no");
        }
    }
    public double getPerimeter() {
    return 2 * 3.14 * radius;
    }
    public double getSquare() {
        return 3.14 * radius * radius;
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    public Circle(double radius, String color, boolean isTransparent) {
        this.radius = radius;
        this.color = color;
        this.isTransparent = isTransparent;
    }
}
