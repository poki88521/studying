package Homework7.test7;

import java.util.Scanner;

public class TestCircleRectangle {
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        Circle c = new Circle(sc.nextDouble(), sc.next(), sc.nextBoolean());
        Rectangle r = new Rectangle();
        r.setWidth(sc.nextDouble());
        r.setHeight(sc.nextDouble());
        r.setColor(sc.next());
        r.setFilled(sc.nextBoolean());

        c.printCircle();
        System.out.println();
        System.out.println(r.toString());
        System.out.println();
        if (IsCylinder(c, r))
            System.out.println("该圆形和矩形的信息能构成一个圆柱体，其体积是" + getVolume(c, r));
        else
            System.out.println("该圆形和矩形的信息不能构成一个圆柱体");
    }

    public static boolean IsCylinder(Circle c, Rectangle r) {
        double circumference = 2 * 3 * c.getRadius();
        return Math.abs(r.getWidth() - circumference) < 1e-6 || Math.abs(r.getHeight() - circumference) < 1e-6;
    }

    public static double getVolume(Circle c, Rectangle r) {
        double circumference = 2 * 3 * c.getRadius();
        double height;
        if (Math.abs(r.getWidth() - circumference) < 1e-6) {
            height = r.getHeight();
        } else {
            height = r.getWidth();
        }
        double area = 3 * c.getRadius() * c.getRadius();
        return area * height;
    }
}

class GeometricObject {
    private String color;
    private boolean filled;

    public GeometricObject() {
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
        return 3 * radius * radius;
    }

    public double getPerimeter() {
        return 2 * 3 * radius;
    }

    public double getDiameter() {
        return 2 * radius;
    }

    public void printCircle() {
        System.out.print("圆的半径为" + radius + "\n" + super.toString());
    }
}

class Rectangle extends GeometricObject {
    private double width;
    private double height;

    public Rectangle() {
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

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public String toString() {
        return "矩形的宽为" + width + "\n矩形的长为" + height + "\n" + super.toString();
    }
}
