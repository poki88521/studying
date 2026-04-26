package Homework7.test4;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r1 = sc.nextDouble();
        String c1 = sc.next();
        double r2 = sc.nextDouble();
        String c2 = sc.next();
        sc.close();
        Circle circle1 = new Circle(c1, r1);
        Circle circle2 = new Circle(c2, r2);
        if (circle1.equals(circle2)) {
            System.out.println("两个圆相等");
        } else {
            Circle circle = (Circle) GeometricObject.max(circle1, circle2);
            System.out.println("大圆的属性");
            System.out.print(circle.toString());
        }
    }
}

abstract class GeometricObject implements Comparable<GeometricObject> {
    protected String color;

    public GeometricObject() {
    }

    public GeometricObject(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract double getArea();

    public int compareTo(GeometricObject o) {
        return Double.compare(this.getArea(), o.getArea());
    }

    public static GeometricObject max(GeometricObject o1, GeometricObject o2) {
        if (o1.compareTo(o2) >= 0) {
            return o1;
        } else {
            return o2;
        }
    }
}

class Circle extends GeometricObject {
    protected double radius;

    public Circle() {
    }

    public Circle(String color, double radius) {
        super(color);
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

    public boolean equals(Circle circle) {
        return Double.compare(this.radius, circle.radius) == 0;
    }

    public String toString() {
        return "颜色是 " + color + "\n半径是 " + radius;
    }

    public int compareTo(GeometricObject o) {
        return super.compareTo(o);
    }
}
