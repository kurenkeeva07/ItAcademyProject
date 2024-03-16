package oop;

public class Os {
    String name;
    double version;

    public void setVersion(double version) {
        this.version = version;
    }

    public double getVersion() {
        return version;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Os(String name, double version) {
        this.name = name;
        this.version = version;
    }
    @Override
    public String toString() {
        return "Os: name: " + getName() + ", version: " + getVersion();
    }
}
