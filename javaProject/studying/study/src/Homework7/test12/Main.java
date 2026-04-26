package Homework7.test12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        double rectWidth = sc.nextDouble();
        double rectHeight = sc.nextDouble();
        double triSide1 = sc.nextDouble();
        double triSide2 = sc.nextDouble();
        double triSide3 = sc.nextDouble();
        sc.close();
        GeometricObject[] objs = new GeometricObject[3];
        objs[0] = new Circle(radius);
        objs[1] = new Rectangle(rectWidth, rectHeight);
        objs[2] = new Triangle(triSide1, triSide2, triSide3);
        double total = sumArea(objs);
        System.out.println("总面积是 " + (Math.round(total * 100) / 100.0));
    }
    public static double sumArea(GeometricObject[] a) {
        double sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i].getArea();
        }
        return sum;
    }
}

abstract class GeometricObject {
    public abstract double getArea();
}

class Circle extends GeometricObject {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends GeometricObject {
    private double width;
    private double height;
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double getArea() {
        return width * height;
    }
}

class Triangle extends GeometricObject {
    private double side1;
    private double side2;
    private double side3;
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public double getArea() {
        double p = (side1 + side2 + side3) / 2;
        return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
    }
}