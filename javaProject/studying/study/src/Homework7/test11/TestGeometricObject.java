package Homework7.test11;

import java.util.Date;
import java.util.Scanner;

public class TestGeometricObject {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入圆的相关信息：");
        boolean filled1 = scanner.nextBoolean();
        double radius1 = scanner.nextDouble();
        Circle c1 = new Circle(Color.BLUE, filled1, radius1);
        boolean filled2 = scanner.nextBoolean();
        double radius2 = scanner.nextDouble();
        Circle c2 = new Circle(Color.GOLD, filled2, radius2);
        System.out.println(c1.toString());
        System.out.println(c1.equals(c2));
        System.out.println("请输入矩形的相关信息：");
        boolean filled3 = scanner.nextBoolean();
        double width1 = scanner.nextDouble();
        double height1 = scanner.nextDouble();
        Rectangle r1 = new Rectangle(Color.RED, filled3, width1, height1);
        boolean filled4 = scanner.nextBoolean();
        double width2 = scanner.nextDouble();
        double height2 = scanner.nextDouble();
        Rectangle r2 = new Rectangle(Color.GREEN, filled4, width2, height2);
        System.out.println(r1.toString());
        System.out.println(r1.equals(r2));
        scanner.close();
    }
}

class Color {
    private float red;
    private float green;
    private float blue;
    public static final Color BLACK = new Color(0.0f, 0.0f, 0.0f);
    public static final Color BLUE = new Color(0.0f, 0.0f, 1.0f);
    public static final Color GOLD = new Color(1.0f, 0.84313726f, 0.0f);
    public static final Color GRAY = new Color(0.5019608f, 0.5019608f, 0.5019608f);
    public static final Color GREEN = new Color(0.0f, 0.5019608f, 0.0f);
    public static final Color RED = new Color(1.0f, 0.0f, 0.0f);
    public static final Color WHITE = new Color(1.0f, 1.0f, 1.0f);
    public Color() {
    }
    public Color(float red, float green, float blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Color color = (Color) obj;
        return Float.compare(color.red, red) == 0 &&
                Float.compare(color.green, green) == 0 &&
                Float.compare(color.blue, blue) == 0;
    }
    public String toString() {
        if (this.equals(BLACK)) return "黑色";
        if (this.equals(BLUE)) return "蓝色";
        if (this.equals(GOLD)) return "金色";
        if (this.equals(GRAY)) return "灰色";
        if (this.equals(GREEN)) return "绿色";
        if (this.equals(RED)) return "红色";
        if (this.equals(WHITE)) return "白色";
        return "未知颜色";
    }
}

class GeometricObject {
    private Color color;
    private boolean isFilled;
    private Date createdDate;
    public GeometricObject() {
        this.color = Color.WHITE;
        this.isFilled = false;
        this.createdDate = new Date();
    }
    public GeometricObject(Color color, boolean isFilled) {
        this.color = color;
        this.isFilled = isFilled;
        this.createdDate = new Date();
    }
    public String toString() {
        return "颜色 " + color.toString() + "\n是否填充 " + (isFilled ? "填充" : "不填充");
    }
}

class Rectangle extends GeometricObject {
    private double width;
    private double height;
    public Rectangle() {
        super();
        this.width = 0;
        this.height = 0;
    }
    public Rectangle(double width, double height) {
        super();
        this.width = width;
        this.height = height;
    }
    public Rectangle(Color color, boolean isFilled, double width, double height) {
        super(color, isFilled);
        this.width = width;
        this.height = height;
    }
    public double getArea() {
        return width * height;
    }
    public String toString() {
        return super.toString() + "\n宽为 " + width + "\n高为 " + height +
                "\n面积 " + Tools.round2d(getArea());
    }
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Rectangle rectangle = (Rectangle) obj;
        return Math.abs(this.getArea() - rectangle.getArea()) < 1e-6;
    }
}

class Circle extends GeometricObject {
    private double radius;
    public Circle() {
        super();
        this.radius = 0;
    }
    public Circle(double radius) {
        super();
        this.radius = radius;
    }
    public Circle(Color color, boolean isFilled, double radius) {
        super(color, isFilled);
        this.radius = radius;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }
    public String toString() {
        return super.toString() + "\n半径 " + radius + "\n面积 " + Tools.round2d(getArea());
    }
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Circle circle = (Circle) obj;
        return Math.abs(this.radius - circle.radius) < 1e-6;
    }
}


class Tools{
    public static double round2d(double n){
        return ((double)Math.round(n * 100)) / 100;
    }
}
