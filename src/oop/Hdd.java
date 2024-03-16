package oop;

public class Hdd {
    int size;
    double speed;

    public double getSpeed() {
        return speed;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public Hdd(int size, double speed) {
        this.size = size;
        this.speed = speed;
    }
    @Override
    public  String toString() {
        return "Hdd: size: " + getSize() + ", speed: " + getSpeed();
    }
}
