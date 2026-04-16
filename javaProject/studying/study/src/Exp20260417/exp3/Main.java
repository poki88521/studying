package Exp20260417.exp3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student stu = new Student(sc.next(), sc.next(), sc.next(), sc.next(), sc.nextInt());
        Faculty fac = new Faculty(sc.next(), sc.next(), sc.next(), sc.next(),
                sc.next(), sc.nextDouble(), new MyDate(sc.nextInt(), sc.nextInt(), sc.nextInt()),
                sc.next(), sc.nextInt());
        Staff sta = new Staff(sc.next(), sc.next(), sc.next(), sc.next(),
                sc.next(), sc.nextDouble(), new MyDate(sc.nextInt(), sc.nextInt(), sc.nextInt()),
                sc.next());
        System.out.println(stu.toString());
        System.out.println(fac.toString());
        System.out.println(sta.toString());
    }
}

class Person{
    protected String name;
    protected String add;
    protected String phoneNo;
    protected String email;

    public Person(){

    }

    public Person(String name, String add, String phoneNo, String email) {
        this.name = name;
        this.add = add;
        this.phoneNo = phoneNo;
        this.email = email;
    }

    @Override
    public String toString() {
        return "姓名为 " + this.name + "\n" +
                "地址为 " + this.add + "\n" +
                "电话为 " + this.phoneNo + "\n" +
                "Email为 " + this.email + "\n";
    }
}


class Student extends Person{
    private int classStatus;

    public Student(String name, String add, String phoneNo, String email, int classStatus) {
        super(name, add, phoneNo, email);
        this.classStatus = classStatus;
    }

    @Override
    public String toString() {
        return super.toString() +
                "班级为" + this.classStatus + "\n";
    }

    public int getClassStatus() {
        return classStatus;
    }

    public void setClassStatus(int classStatus) {
        this.classStatus = classStatus;
    }
}


class MyDate{
    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public String toString() {
        return "雇佣日期为 " + this.year + "年" + this.month + "月" + this.day + "日" + "\n";
    }
}

class Employee extends Person{
    protected String office;
    protected double salary;
    protected MyDate dateHired;

    public Employee(String name, String add, String phoneNo, String email,
                    String office, double salary, MyDate dateHired) {
        super(name, add, phoneNo, email);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    @Override
    public String toString() {
        return super.toString() +
                "办公地点为 " + this.office + "\n" +
                "薪水为 " + this.salary + "\n" +
                this.dateHired.toString();
    }
}


class Faculty extends Employee{
    private String officeHours;
    private int rank;

    public Faculty(String name, String add, String phoneNo, String email,
                   String office, double salary, MyDate dateHired,
                   String officeHours, int rank) {
        super(name, add, phoneNo, email, office, salary, dateHired);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return super.toString() +
                "办公时间为 " + this.officeHours + "\n" +
                "级别为 " + this.rank + "\n";
    }
}


class Staff extends Employee{
    private String title;

    public Staff(String name, String add, String phoneNo, String email,
                 String office, double salary, MyDate dateHired,
                 String title) {
        super(name, add, phoneNo, email, office, salary, dateHired);
        this.title = title;
    }

    @Override
    public String toString() {
        return super.toString() +
                "职称为" + this.title + "\n";
    }
}