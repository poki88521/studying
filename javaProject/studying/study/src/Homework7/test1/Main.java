package Homework7.test1;

import java.util.Scanner;

class Score {
    private double mianShi;
    private double biShi;

    public Score() {
    }

    public Score(double mianShi, double biShi) {
        this.mianShi = mianShi;
        this.biShi = biShi;
    }

    public double getTotalScore() {
        return mianShi * 0.3 + biShi * 0.7;
    }

    public String toString() {
        return "面试成绩 " + mianShi + "\n笔试成绩 " + biShi;
    }
}

class Student {
    private int no;
    private String name;
    private Score score;

    public Student() {
    }

    public Student(int no, String name, Score score) {
        this.no = no;
        this.name = name;
        this.score = score;
    }

    public String toString() {
        return "学号 " + no + "\n姓名 " + name + "\n" + score.toString() + "\n总成绩 " + score.getTotalScore();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int no = scanner.nextInt();
        String name = scanner.next();
        double mianShi = scanner.nextDouble();
        double biShi = scanner.nextDouble();
        scanner.close();

        Score score = new Score(mianShi, biShi);
        Student student = new Student(no, name, score);

        System.out.print(student);
    }
}

