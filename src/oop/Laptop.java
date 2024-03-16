package oop;

import java.util.Arrays;

public class Laptop {
    Hdd[] hddArray;
    Ram ram;
    Os os;
    Cpu cpu;
    char[] stickers;

    public char[] getStickers() {
        return stickers;
    }

    public void setStickers(char[] stickers) {
        this.stickers = stickers;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public Hdd[] getHddArray() {
        return hddArray;
    }

    public Os getOs() {
        return os;
    }

    public Ram getRam() {
        return ram;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public void setHddArray(Hdd[] hddArray) {
        this.hddArray = hddArray;
    }

    public void setOs(Os os) {
        this.os = os;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public Laptop(Hdd[] hddArray, Ram ram, Os os, Cpu cpu, char[] stickers) {
        this.hddArray = hddArray;
        this.ram = ram;
        this.os = os;
        this.cpu = cpu;
        this.stickers = stickers;
    }

    @Override
    public String toString() {
        return Arrays.toString(getHddArray()) + "\n" +
                getRam().toString() + "\n" +
                getOs().toString() + "\n" +
                getCpu().toString() + "\n" +
                "Letters: " + Arrays.toString(getStickers());
    }
}


