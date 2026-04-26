package Homework7.test5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double rectLength = sc.nextDouble();
        double rectWidth = sc.nextDouble();
        double circleRadius = sc.nextDouble();
        sc.close();
        Rectangle rect = new Rectangle(rectLength, rectWidth);
        Circle circle = new Circle(circleRadius);
        displayGeometric(rect);
        displayGeometric(circle);
    }

    public static void displayGeometric(GeometricObject object) {
        System.out.println("图形的周长" + round(object.getPerimeter()));
        System.out.println("图形的面积" + round(object.getArea()));
    }

    public static double round(double n){
        return Math.round(n * 100) / 100.0;
    }
}

interface GeometricObject {
    double getPerimeter();
    double getArea();
}

class Rectangle implements GeometricObject {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }

    public double getArea() {
        return length * width;
    }
}

class Circle implements GeometricObject {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}

