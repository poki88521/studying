package Homework5.Test7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vehicle v = new Vehicle(sc.nextFloat());
        System.out.println("初始速度是" + v.getSpeed());
        float up = sc.nextFloat();
        v.speedUp(up);
        System.out.println("加速" + up + "后的速度是" + v.getSpeed());
        float down = sc.nextFloat();
        v.speedDown(down);
        System.out.println("降速" + down + "后的速度是" + v.getSpeed());

    }
}
class Vehicle{
    private float speed;

    public Vehicle() {

    }

    public Vehicle(float speed) {
        this.speed = speed;
    }

    public void speedUp(float speed){
        this.speed += speed;
        if(this.speed > 240) this.speed = 240;
    }

    public void speedDown(float speed){
        this.speed -= speed;
        if(this.speed < 0) this.speed = 0;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }
}