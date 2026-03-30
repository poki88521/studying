package Homework5.Test3;

import java.util.Scanner;

public class TestPoint {
    public static void main(String[] a){
        Scanner in = new Scanner(System.in);
        Point p1 = new Point();
        p1.setX(in.nextDouble());
        p1.setY(in.nextDouble());
        Point p2 = new Point(in.nextDouble(),in.nextDouble());
        System.out.printf("\n两点距离为%.2f" , p1.distance(p2));
        System.out.printf("\n两点距离为%.2f" , p1.distance(20,30));
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

    public double distance(Point p){
        return Math.sqrt(Math.pow(this.x - p.getX(), 2)
                + Math.pow(this.y - p.getY(), 2));
    }

    public double distance(double x, double y){
        return Math.sqrt(Math.pow(this.x - x, 2)
                + Math.pow(this.y - y, 2));
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
