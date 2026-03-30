package Homework5.Test18;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Point p1 = new Point(3, 4);
        Point p2 = new Point(sc.nextDouble(), sc.nextDouble());
        System.out.println("p1距离原点的距离为" + p1.getDistanceToBase());
        System.out.println("p2距离原点的距离为" + p2.getDistanceToBase());
    }
}

class Point{
    private double x;
    private double y;

    public Point() {
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getDistanceToBase(){
        return Math.sqrt(x * x + y * y);
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
