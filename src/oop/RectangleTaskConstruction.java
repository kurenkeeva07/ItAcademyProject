package oop;

public class RectangleTaskConstruction {
    double length;
    double width;
    public RectangleTaskConstruction (double l, double w) {
        if (l > 0 && w > 0) {
            length = l;
            width = w;
        } else {
            System.out.println("Write positive number!");
        }
    }
    public double getLength() {
        return length;
    }
    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
