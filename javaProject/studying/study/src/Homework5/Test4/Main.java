package Homework5.Test4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Triangle t = new Triangle(sc.nextDouble(), sc.nextDouble(),
                sc.nextDouble(), sc.next(), sc.nextBoolean());
        System.out.println("三条边 ");
        System.out.print(t.getSide1() + " ");
        System.out.print(t.getSide2() + " ");
        System.out.print(t.getSide3() + " ");
        System.out.println();
        System.out.println("颜色 " + t.getColor());
        System.out.println("是否填充 " + t.isFilled());
        System.out.println("周长 " + t.getPerimeter());
        System.out.println("面积 " + t.getArea());
    }
}

class Triangle{
    private double side1;
    private double side2;
    private double side3;
    private boolean filled;
    private String color;

    public Triangle() {
        this.side1 = 1;
        this.side2 = 1;
        this.side3 = 1;
    }

    public Triangle(double side1, double side2,
                    double side3, String color, boolean filled) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.filled = filled;
        this.color = color;
    }

    public double getPerimeter(){
        return side1 + side2 + side3;
    }

    public double getArea(){
        double p = this.getPerimeter() / 2;
        return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
