package Homework7.test3;

import java.util.Scanner;

public class TestGeometric {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GeometricObject[] objs = new GeometricObject[3];
        for (int i = 0; i < 3; i++) {
            double width = sc.nextDouble();
            double height = sc.nextDouble();
            String color = sc.next();
            boolean filled = sc.nextBoolean();
            objs[i] = new Square(width, height, color, filled);
        }
        sc.close();
        for (int i = 0; i < objs.length; i++) {
            System.out.print(objs[i]);
            System.out.println();
        }
    }
}

interface Colorable {
    void howToColor();
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
        return "Color=" + color + "\nFilled=" + filled;
    }
}

class Square extends GeometricObject implements Colorable {
    private double width;
    private double height;

    public Square(double width, double height, String color, boolean filled) {
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

    public void howToColor() {
        System.out.println("Color all four sides");
    }

    public String toString() {
        if (isFilled()) {
            howToColor();
        }
        return super.toString();
    }
}
