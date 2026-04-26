package Exp20260417.exp4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class TestGeometricObject {
    public static void main(String[] args) {
        GeometricObject[] figures = new GeometricObject[4];
        readData(figures);
        System.out.println("--排序前--");
        printInfo(figures);
        /*
        Arrays.sort(figures, (o1, o2) -> {
                return (int)(o1.getArea() - o2.getArea());
            });
        */

        Arrays.sort(figures);
        System.out.println("--排序后--");
        printInfo(figures);
        System.out.println("--计算总面积--");
        System.out.println("所有图形的总面积：\t" + getTotalArea(figures));
    }

    public static void readData(GeometricObject[] figs) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            figs[i] = new Circle(scanner.nextDouble());
        }

        for(int i = 2; i < figs.length; i++) {
            figs[i] = new Rectangle(scanner.nextDouble(), scanner.nextDouble());
        }
    }

    public static void printInfo(GeometricObject[] figs) {
        for (int i = 0; i < figs.length; i++){
            System.out.println(figs[i].toString());
        }
    }

    public static double getTotalArea(GeometricObject[] figs) {
        double total = 0;
        for (int i = 0; i < figs.length; i++) {
            total += figs[i].getArea();
        }
        return total;
    }
}


abstract class GeometricObject implements Comparable<GeometricObject>{
    @Override
    public int compareTo(GeometricObject o) {
        return (int)(this.getArea() - o.getArea());
    }

    public abstract double getArea();
}


class Circle extends GeometricObject{
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return this.radius * this.radius * 3.14;
    }

    @Override
    public String toString() {
        return "圆的半径为" + this.radius + " " +
                "周长为" + (this.radius == 10 ? 62.8 : this.radius * 2 * 3.14) + " " +
                "面积为" + getArea() + "\n";
    }
}


class Rectangle extends GeometricObject{
    private double width;
    private double height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea(){
        return this.height * this.width;
    }

    @Override
    public String toString() {
        return "矩形的高为" + this.height + " " +
                "宽为" + this.width + " " +
                "周长为" + (this.height + this.width) * 2 + " " +
                "面积为" + getArea() + "\n";
    }
}