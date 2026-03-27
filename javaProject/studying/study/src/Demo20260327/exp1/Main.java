package Demo20260327.exp1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fan f1 = new Fan();
        Fan f2 = new Fan();
        f1.setRadius(sc.nextInt());
        f1.setColor(sc.next());
        f1.setOn(sc.nextBoolean());
        f2.setRadius(sc.nextInt());
        f2.setColor(sc.next());
        f2.setOn(sc.nextBoolean());
        f1.setSpeed(Fan.FAST);
        f2.setSpeed(Fan.MEDIUM);
        System.out.println(f1.toString());
        System.out.println(f2.toString());
    }
}

class Fan{
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    private int speed = SLOW;
    private double radius = 5;
    private String color = "blue";
    private boolean on = false;

    public Fan(){

    }

    public Fan(int speed, double radius, String color, boolean on){
        this.speed = speed;
        this.color = color;
        this.on = on;
        this.radius = radius;
    }

    @Override
    public String toString() {
        String s ="";
        if(on){
            s += "该风扇的速度为" + speed + "\n";
            s += "颜色是" + color + "\n";
        }else{
            s += "风扇没有开启" + "\n";
            s += "该风扇的颜色是" + color + "\n";
        }
        s += "半径是" + radius;
        return s;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }
}
