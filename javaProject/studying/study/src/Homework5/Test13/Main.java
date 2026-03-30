package Homework5.Test13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle r1 = new Rectangle(sc.nextDouble(), sc.nextDouble());
        show(r1);
        System.out.println("矩形对象的个数为" + Rectangle.getNumberOfRectangle());
        Rectangle r2 = new Rectangle(sc.nextDouble(), sc.nextDouble());
        show(r2);
        System.out.println("矩形对象的个数为" + Rectangle.getNumberOfRectangle());



    }

    static void show(Rectangle r1){
        System.out.print("宽为" + r1.getWidth());
        System.out.print("高为" + r1.getHeight());
        System.out.println("面积为" + r1.getArea());
        System.out.println("周长为" + r1.getPerimeter());
    }
}

class Rectangle{
    private static int numberOfRectangle;
    private double width;
    private double height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
        numberOfRectangle++;
    }
    
    public double getArea(){
        return width * height;
    }
    
    public double getPerimeter(){
        return 2 * (width + height);
    }

    public static int getNumberOfRectangle() {
        return numberOfRectangle;
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
}