package Demo20260312;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
        Rectangle r = new Rectangle();
        r.setWidth(w);
        r.setHeight(h);
        System.out.println("宽为" + r.getWidth());
        System.out.println("高为" + r.getHeight());
        System.out.println("面积为" + r.getArea());
        System.out.println("周长为" + r.getPerimeter());

    }
}

class Rectangle{
    private double width;
    private double height;

    public Rectangle(){
        this.width = 1;
        this.height = 1;
    }

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double getArea(){
        return width * height;
    }

    public double getPerimeter(){
        return 2 * (width + height);
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