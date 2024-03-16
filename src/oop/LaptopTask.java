package oop;

import java.util.Arrays;

public class LaptopTask {
    public static void main(String[] args) {
        Hdd hdd = new Hdd(10, 100);
        Hdd hdd2 = new Hdd(15, 150);
        Hdd[] hddArray = new Hdd[]{hdd, hdd2};
        Ram ram = new Ram(100, "ddr");
        Os os = new Os("os", 1.02);
        Cpu cpu = new Cpu("ddp", 10, 2.44);
        char[] stickers = new char[]{'а', 'б', 'в', 'г', 'д', 'е'};
        Laptop laptop = new Laptop(hddArray, ram, os, cpu, stickers);

        //System.out.println(laptop);

        laptop.setHddArray(hddArray);
        Cpu cpu2 = new Cpu("i9", 15, 2.44);
        laptop.setCpu(cpu2);
        Os os2 = new Os("Ubuntu", 16.04);
        laptop.setOs(os2);

        System.out.println(laptop);
    }
}
