package oop;

public class Rectangle {
    double length;
    double width;
    String color;

    double getRectangleSquare(){
        return length * width;
    }

    void setLength(double l) {
        if (l > 0)
        length = l;
        else System.out.println("Write integer!");
    }
    void setWidth(double w) {
        if (w > 0)
            width = w;
        else System.out.println("Write integer!");
    }
}
