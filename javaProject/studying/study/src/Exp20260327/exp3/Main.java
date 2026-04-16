package Exp20260327.exp3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyPoint p1 = new MyPoint(scanner.nextDouble(), scanner.nextDouble());
        MyPoint p2 = new MyPoint(scanner.nextDouble(), scanner.nextDouble());
        System.out.println("使用MyPoint的参数为MyPoint的实例方法distance计算p1和p2的距离为：\t" + Math.round(p1.distance(p2) * 100) / 100.0);
        System.out.println("使用MyPoint的类方法distance计算p1和p2的距离为：\t" +  Math.round(MyPoint.distance(p1, p2) * 100) / 100.0 );
        System.out.println("使用MyPoint的参数为double的实例方法distance计算p1到某个点的距离为：\t" + Math.round( p1.distance(5.8,6.0) * 100) / 100.0 );
    }

}

class MyPoint{
    private double x = 0;
    private double y = 0;

    public MyPoint(){}

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public static double distance(MyPoint p1, MyPoint p2){
        return Math.sqrt(Math.pow(p1.getX() - p2.getX(), 2)
         + Math.pow(p1.getY() - p2.getY(), 2));
    }

    public double distance(double x, double y){
        return Math.sqrt(Math.pow(x - this.getX(), 2)
                + Math.pow(y - this.getY(), 2));
    }

    public double distance(MyPoint p){
        return Math.sqrt(Math.pow(p.getX() - this.getX(), 2)
                + Math.pow(p.getY() - this.getY(), 2));
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
