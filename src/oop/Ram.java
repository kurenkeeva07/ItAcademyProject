package oop;

public class Ram {
    int size;
    String model;

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public Ram(int size, String model) {
        this.size = size;
        this.model = model;
    }
    @Override
    public String toString() {
        return "Ram: size: " + getSize() + ", model: " + getModel();
    }
}
