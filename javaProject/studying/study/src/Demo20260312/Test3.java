package Demo20260312;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Point p1 = new Point(3, 4);
        Point p2 = new Point(sc.nextDouble(), sc.nextDouble());
        System.out.println("p1距离原点的距离为" + p1.getDistance());
        System.out.println("p2距离原点的距离为" + p2.getDistance());
    }
}

class Point{
    private double x;
    private double y;

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getDistance(){
        return Math.sqrt(x * x + y * y);
    }
}