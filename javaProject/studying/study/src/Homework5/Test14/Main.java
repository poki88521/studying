package Homework5.Test14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BMI b = new BMI(sc.next(), sc.nextInt(),
                sc.nextDouble(), sc.nextDouble());
        System.out.println("姓名" + b.getName());
        System.out.println("年龄" + b.getAge());
        System.out.println("体重指数" + b.getBMI());
        System.out.println(b.getStatus());
    }
}

class BMI{
    private String name;
    private int age;
    private double weight;
    private double height;

    public BMI() {
    }

    public BMI(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public double getBMI(){
        return weight / Math.pow(height, 2);
    }

    public String getStatus(){
        double bmi = this.getBMI();
        String head = "体重状况";
        if(bmi < 18.5){
            return head + "低重";
        } else if (bmi < 25) {
            return head + "正常";
        } else if (bmi < 30) {
            return head + "超重";
        } else {
            return head + "肥胖";
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
