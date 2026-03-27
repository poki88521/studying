package Demo20260327.exp4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle c1 = new Circle();
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double r1 = sc.nextDouble();
        c1.setO(new Point(x1, y1));
        c1.setRadius(r1);
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        double r2 = sc.nextDouble();
        Circle c2 = new Circle(new Point(x2, y2), r2);

        Point p = new Point();
        double xp = sc.nextDouble();
        double yp = sc.nextDouble();
        p.setX(xp);
        p.setY(yp);

        System.out.println("c1的圆心坐标值为(" + c1.getO().getX() + ", " + c1.getO().getY() + ")");
        System.out.printf("c1的面积为%.2f ", c1.getArea());
        System.out.printf("c1的周长为%.2f", c1.getPerimeter());
        System.out.println();
        System.out.println();

        if (c2.contains(p)) {
            System.out.println("点p在c2内部");
        } else {
            System.out.println("点p不在c2内部");
        }

        System.out.printf("c2的面积为%.2f", c2.getArea());
        System.out.println();
        System.out.printf("c2的周长为%.2f", c2.getPerimeter());
        System.out.println();
    }
}

class Point{
    private double x = 0;
    private double y = 0;

    public Point(){}

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public static double distance(Point p1, Point p2){
        return Math.sqrt(Math.pow(p1.getX() - p2.getX(), 2)
                + Math.pow(p1.getY() - p2.getY(), 2));
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


class Circle{
    private Point o = new Point();
    private double radius;

    public Circle(){}

    public Circle(Point o, double radius) {
        this.o = o;
        this.radius = radius;
    }

    public boolean contains(Point p){
        return Point.distance(o, p) <= radius;
    }

    public double getArea(){
        return 3.14 * radius * radius;
    }

    public double getPerimeter(){
        return 3.14 * 2 * radius;
    }

    public Point getO() {
        return o;
    }

    public void setO(Point o) {
        this.o = o;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}