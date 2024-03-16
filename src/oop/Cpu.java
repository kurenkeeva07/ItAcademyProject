package oop;

public class Cpu {
    String model;
    int coreCount;
    double rate;

    public int getCoreCount() {
        return coreCount;
    }

    public double getRate() {
        return rate;
    }

    public String getModel() {
        return model;
    }

    public void setCoreCount(int coreCount) {
        this.coreCount = coreCount;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public Cpu(String model, int coreCount, double rate) {
        this.model = model;
        this.coreCount = coreCount;
        this.rate = rate;
    }
    @Override
    public String toString() {
        return "Cpu: model: " + getModel() + ", count of core: " + getCoreCount() + ", rate: " + getRate();
    }
}
