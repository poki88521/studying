package Homework5.Test9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Course c = new Course(sc.next(),
                new Student[]{new Student(sc.nextInt(), sc.next()),
                        new Student(sc.nextInt(), sc.next())}, 2);
        System.out.println(c.toString());
    }
}

class Student{
    private int stuNo;
    private String name;

    public Student() {
    }

    public Student(int stuNo, String name) {
        this.stuNo = stuNo;
        this.name = name;
    }

    @Override
    public String toString() {
        return "学号" + stuNo + " " + "姓名" + name + "\n";
    }

    public int getStuNo() {
        return stuNo;
    }

    public void setStuNo(int stuNo) {
        this.stuNo = stuNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


class Course{
    private String name;
    private Student[] stuList;
    private int numberOfStudents;

    public Course() {
    }

    public Course(String name, Student[] stuList, int numberOfStudents) {
        this.name = name;
        this.stuList = stuList;
        this.numberOfStudents = numberOfStudents;
    }

    public Course(String name) {
        this.name = name;
    }

    public void addStudent(Student s){
        if(stuList == null) stuList = new Student[10];
    }

    @Override
    public String toString() {
        String res = "课程名称 " + name + "\n" + "选课学生名单" + "\n";
        for (int i = 0; i < stuList.length; i++) {
            res += stuList[i].toString();
        }
        return res;
    }
}