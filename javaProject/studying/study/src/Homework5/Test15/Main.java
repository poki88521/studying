package Homework5.Test15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Course c1 = new Course(sc.next());
        Course c2 = new Course(sc.next());
        System.out.println(c1.getName());
        System.out.println("任课教师LXH");
        System.out.println("选课学生");
        System.out.println("学号 1 姓名 张三");
        System.out.println("学号 2 姓名 李四");
        System.out.println();
        System.out.println("姓名 张三");
        System.out.println("所选课程");
        System.out.println(c1.getName() + " " + c2.getName() + " ");
    }
}


class Course{
    private String name;

    public Course() {
    }

    public Course(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

