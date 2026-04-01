package Demo20260330;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle c = new Circle(sc.nextDouble(), sc.next(), sc.nextBoolean());
        Rectangle r = new Rectangle(sc.nextDouble(), sc.nextDouble(),
                sc.next(), sc.nextBoolean());
        c.printCircle();
        r.printRectangle();

    }
}

class GeometricObject{
    private String color;
    private boolean filled;

    public GeometricObject() {
    }

    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "颜色为" + color + "\n" +
                (filled ? "填充" : "未填充");
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

}

class Circle extends GeometricObject{
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }

    public double getPerimeter(){
        return Math.PI * 2 * radius;
    }

    public void printCircle(){
        System.out.println(this.toString());
        System.out.println("圆的半径为" + this.radius);
        System.out.println("圆的直径为" + this.radius * 2);
        System.out.printf("圆的周长为%.2f\n", this.getPerimeter());
        System.out.printf("圆的面积为%.2f\n", this.getArea());
        System.out.println();
        System.out.println();
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
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

    public Rectangle(double width, double height, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getArea(){
        return width * height;
    }

    public double getPerimeter(){
        return 2 * (width + height);
    }

    public void printRectangle(){
        System.out.println(this.toString());
        System.out.println("矩形的宽为" + width);
        System.out.println("矩形的长为" + height);
        System.out.println("矩形的周长为" + this.getPerimeter());
        System.out.println("矩形的面积为" + this.getArea());
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
