package Homework7.test16;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r1 = sc.nextDouble();
        double r2 = sc.nextDouble();
        sc.close();
        Circle c1 = new Circle(r1);
        Circle c2 = new Circle(r2);
        double c1Perimeter = c1.getPerimeter();
        double c1Area = c1.getArea();
        double c2Perimeter = c2.getPerimeter();
        double c2Area = c2.getArea();
        System.out.println("c1的周长是" + (Math.round(c1Perimeter * 100) / 100.0));
        System.out.println("c1的面积是" + (Math.round(c1Area * 100) / 100.0));
        System.out.println("c2的周长是" + (Math.round(c2Perimeter * 100) / 100.0));
        System.out.println("c2的面积是" + (Math.round(c2Area * 100) / 100.0));
        int cmp = c1.compareTo(c2);
        if (cmp > 0) {
            System.out.println("c1比c2大");
        } else if (cmp < 0) {
            System.out.println("c1比c2小");
        } else {
            System.out.println("c1与c2相等");
        }
    }
}

abstract class GeometricObject {
    public abstract double getArea();
    public abstract double getPerimeter();
}

class Circle extends GeometricObject implements Comparable<Circle> {
    private double r;
    public Circle() {
        this.r = 0;
    }
    public Circle(double r) {
        this.r = r;
    }
    public void setR(double r) {
        this.r = r;
    }
    public double getR() {
        return r;
    }
    public double getArea() {
        return Math.PI * r * r;
    }
    public double getPerimeter() {
        return 2 * Math.PI * r;
    }
    public int compareTo(Circle o) {
        return Double.compare(this.r, o.r);
    }
}

