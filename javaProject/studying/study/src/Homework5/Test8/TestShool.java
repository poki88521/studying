package Homework5.Test8;

import java.util.Scanner;

public class TestShool {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Student stu1 = new Student(scanner.next(), scanner.nextDouble());
        Student stu2 = new Student(scanner.next(), scanner.nextDouble());
        Student stu3 = new Student(scanner.next(), scanner.nextDouble());
        Shool shool = new Shool();
        Student[] students = {stu1,stu2,stu3};
        shool.setStudents(students);
        System.out.println("姓名\t\t" + "成绩");
        System.out.println("-------------------------");
        System.out.println(shool.toString());
        System.out.println("所招学生的平均分为" + shool.getAverageScore() + "分");
    }
}


class Student{
    private String name;
    private double score;

    public Student() {
    }

    public Student(String name, double score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return name + " " + score + "\n";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}

class Shool{
    private String name;
    private Student[] students;

    public Shool() {
    }

    public Shool(String name, Student[] students) {
        this.name = name;
        this.students = students;
    }

    public double getAverageScore(){
        double sum = 0;
        for (int i = 0; i < students.length; i++) {
            sum += students[i].getScore();
        }
        return sum / students.length;
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < students.length; i++) {
            s += students[i].toString();
        }
        return s;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }
}
