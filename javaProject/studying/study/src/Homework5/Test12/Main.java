package Homework5.Test12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tank t1 = new Tank(sc.nextDouble(), 10);
        Tank t2 = new Tank(sc.nextDouble(), 1);
        fire(t1, t2);
        show(t1, t2);
        t1.speedDown(sc.nextDouble());
        t2.speedDown(sc.nextDouble());
        fire(t1, t2);
        show(t1, t2);
    }

    static void fire(Tank t1, Tank t2){
        t1.fire();
        t2.fire();
    }

    static void show(Tank t1, Tank t2){
        System.out.println("tank1目前的速度是" + t1.getSpeed());
        System.out.println("tank2目前的速度是" + t2.getSpeed());
        System.out.println("tank1目前的子弹是" + t1.getBulletAmount());
        System.out.println("tank2目前的子弹是" + t2.getBulletAmount());
    }
}

class Tank{
    private double speed;
    private int bulletAmount;

    public Tank(double speed, int bulletAmount) {
        this.speed = speed;
        this.bulletAmount = bulletAmount;
    }

    public void speedUp(double up){
        this.speed += up;
    }

    public void speedDown(double down){
        this.speed -= down;
    }

    public void fire(){
        if(bulletAmount == 0){
            System.out.println("没有炮弹了");
        }else{
            System.out.println("打出一发炮弹");
            bulletAmount--;
        }
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public int getBulletAmount() {
        return bulletAmount;
    }

    public void setBulletAmount(int bulletAmount) {
        this.bulletAmount = bulletAmount;
    }
}
