package Homework7.test17;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        String circleColor = sc.next();
        boolean circleFilled = sc.nextBoolean();
        double width = sc.nextDouble();
        double height = sc.nextDouble();
        String rectColor = sc.next();
        boolean rectFilled = sc.nextBoolean();
        sc.close();
        Circle c = new Circle(radius, circleColor, circleFilled);
        c.printCircle();
        System.out.println();
        Rectangle r = new Rectangle(width, height, rectColor, rectFilled);
        System.out.println("颜色为" + r.getColor());
        System.out.println(r.isFilled() ? "填充" : "未填充");
        System.out.println("矩形的宽为" + r.getWidth());
        System.out.println("矩形的长为" + r.getHeight());
        System.out.println("矩形的周长为" + (Math.round(r.getPerimeter() * 100) / 100.0));
        System.out.println("矩形的面积为" + (Math.round(r.getArea() * 100) / 100.0));
    }
}

class GeometricObject {
    private String color;
    private boolean filled;
    public GeometricObject() {
        this.color = "white";
        this.filled = false;
    }
    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public boolean isFilled() {
        return filled;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public String toString() {
        return "颜色为" + color + "\n" + (filled ? "填充" : "未填充");
    }
}

class Circle extends GeometricObject {
    private double radius;
    public Circle() {
        super();
        this.radius = 0;
    }
    public Circle(double radius) {
        super();
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    public double getDiameter() {
        return 2 * radius;
    }
    public void printCircle() {
        System.out.println(super.toString());
        System.out.println("圆的半径为" + radius);
        System.out.println("圆的直径为" + getDiameter());
        System.out.println("圆的周长为" + (Math.round(getPerimeter() * 100) / 100.0));
        System.out.println("圆的面积为" + (Math.round(getArea() * 100) / 100.0));
    }
}

class Rectangle extends GeometricObject {
    private double width;
    private double height;
    public Rectangle() {
        super();
        this.width = 0;
        this.height = 0;
    }
    public Rectangle(double width, double height) {
        super();
        this.width = width;
        this.height = height;
    }
    public Rectangle(double width, double height, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea() {
        return width * height;
    }
    public double getPerimeter() {
        return 2 * (width + height);
    }
}

