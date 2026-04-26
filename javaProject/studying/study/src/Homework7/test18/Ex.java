package Homework7.test18;


import java.util.Scanner;

public class Ex {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        double a=input.nextDouble();
        double b=input.nextDouble();
        double c=input.nextDouble();
        double d=input.nextDouble();
        double e=input.nextDouble();
        double f=input.nextDouble();
        Figure g[]={new Rectangle(a,b),new Circle(c),new Circle(d),new Rectangle(e,f)};
        System.out.println("the total area is "+ sum(g));
    }
    static double sum(Figure[] g){
        double total = 0;
        for (int i = 0; i < g.length; i++) {
            total += g[i].getArea();
        }
        return total;
    }
}

abstract class Figure {
    public abstract double getArea();
}

class Rectangle extends Figure {
    private double width;
    private double height;
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double getArea() {
        return width * height;
    }
}

class Circle extends Figure {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return 3.14 * radius * radius;
    }
}
