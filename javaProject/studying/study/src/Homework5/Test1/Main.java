package Homework5.Test1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student stu1 = new Student(sc.next(), new Score(sc.nextInt(), sc.nextInt()));
        Student stu2 = new Student(sc.next(), new Score(sc.nextInt(), sc.nextInt()));
        System.out.println(stu1.toString());
        System.out.println(stu2.toString());
    }
}

class Score{
    private float experiment;
    private float project;

    public Score() {
    }

    public Score(float experiment, float project) {
        this.experiment = experiment;
        this.project = project;
    }

    @Override
    public String toString() {
        return "实验成绩 " + experiment + "\n" + "项目成绩" + project + "\n";
    }

    public float getExperiment() {
        return experiment;
    }

    public void setExperiment(float experiment) {
        this.experiment = experiment;
    }

    public float getProject() {
        return project;
    }

    public void setProject(float project) {
        this.project = project;
    }
}

class Student{
    private String name;
    private Score score;

    public Student() {
    }

    public Student(String name, Score score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return "学生姓名 " + name + "\n" + score.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Score getScore() {
        return score;
    }

    public void setScore(Score score) {
        this.score = score;
    }
}