package Homework7.test9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double waterVolume = sc.nextDouble();
        double gasVolume = sc.nextDouble();
        sc.close();
        WaterBill waterBill = new WaterBill(waterVolume);
        GasBill gasBill = new GasBill(gasVolume);
        double total = waterBill.getBill() + gasBill.getBill();
        System.out.println("该居民缴费总额为" + total);
    }
}

abstract class Bill {
    protected double volume;
    public abstract double getBill();
}

class GasBill extends Bill {
    private double rate = 2.28;
    public GasBill() {
    }
    public GasBill(double volume) {
        this.volume = volume;
    }
    public double getBill() {
        return volume * rate;
    }
}

class WaterBill extends Bill {
    private double[] rate = {5, 7, 9};
    public WaterBill() {
    }
    public WaterBill(double volume) {
        this.volume = volume;
    }
    public double getBill() {
        double total = 0;
        if (volume <= 180) {
            total = volume * rate[0];
        } else if (volume <= 260) {
            total = 180 * rate[0] + (volume - 180) * rate[1];
        } else {
            total = 180 * rate[0] + 80 * rate[1] + (volume - 260) * rate[2];
        }
        return total;
    }
}
