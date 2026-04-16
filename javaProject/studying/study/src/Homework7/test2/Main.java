package Homework7.test2;


import java.util.Arrays;
import java.util.Scanner;

class Student implements Comparable<Student> {
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public int compareTo(Student o) {
        return this.score - o.score;
    }

    public String toString() {
        return "姓名：" + name + "\n成绩：" + score;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[3];
        for (int i = 0; i < 3; i++) {
            String name = sc.next();
            int score = sc.nextInt();
            students[i] = new Student(name, score);
        }
        sc.close();
        Arrays.sort(students);
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
    }
}
