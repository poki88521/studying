package Homework5.Test16;

import java.util.Scanner;

class Point{
    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

class Circle{

    private int radius;
    private Point center;

    public Circle() {
    }

    public Circle(int radius, Point center) {
        this.radius = radius;
        this.center = center;
    }

    public Circle(int x, int y, int radius){
        this(radius, new Point(x, y));
    }

    void showCenter(){

        System.out.println("center: x="+center.getX()+" y="+center.getY());

    }

    void showCircle(){

        showCenter();

        System.out.println("radius= "+getRadius());

    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }
}

public class Ex {

    public static void main(String[] args){

        Scanner input=new Scanner(System.in);

        int x=input.nextInt();

        int y=input.nextInt();

        int r=input.nextInt();

        System.out.println("the information of the circle:");

        Circle c=new Circle(x,y,r);

        c.showCircle();

    }

}
