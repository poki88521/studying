package Demo20260312;


public class Test2 {
    public static void main(String[] args) {
        Circle c1 = new Circle(1.0);
        Circle c2 = new Circle(15);
        System.out.println("circle1的面积是" + c1.getArea());
        System.out.println("circle2的面积是" + c2.getArea());
    }
}

class Circle{
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double getArea(){
        return 3.14 * Math.pow(radius, 2);
    }
}