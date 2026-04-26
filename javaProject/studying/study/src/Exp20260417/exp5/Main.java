package Exp20260417.exp5;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static Teacher t1 = new Teacher(1, "张建国", 45, "男");
    static Teacher t2 = new Teacher(2, "李芳", 38, "女");
    static Student s1 = new Student(1, "张三", 20, "男");
    static Student s2 = new Student(2, "李四", 19, "女");
    static Course c1 = new Course( "Java程序设计", t1);
    static Course c2 = new Course( "数据库原理", t2);
    static Course c3 = new Course( "Web前端开发", null);
    static Course c4 = new Course( "操作系统", null);

    public static void main(String[] args) {
        title();
        int code = sc.nextInt();
        switch(code){
            case 1: test1();break;
            case 2: test2();break;
            case 3: test3();break;
            case 4: test4();break;
            case 5: test5();break;
            case 6: test6();break;
            case 7: test7();break;
            default: break;
        }
    }

    public static void title(){
        System.out.println("1.学生信息展示");
        System.out.println("2.老师信息展示");
        System.out.println("3.课程信息展示");
        System.out.println("4.学生取消选课后展示学生、课程信息");
        System.out.println("5.老师取消讲课后展示老师、课程信息");
        System.out.println("6.课程超出最大人数抛出异常");
        System.out.println("7.教师授课超出最大人数抛出异常");
        System.out.println("选择测试内容：");
    }

    public static void test1(){
        s1.addCourse(c1);
        s1.show();
        s2.addCourse(c2);
        s2.show();
    }

    public static void test2(){
        t1.show();
        t2.show();
    }

    public static void test3(){
        s1.addCourse(c1);
        s2.addCourse(c1);
        c1.show();
        c3.show();
    }

    public static void test4(){
        System.out.println("-----------取消前----------");
        s1.addCourse(c1);
        s2.addCourse(c1);
        c1.show();
        s1.show();
        System.out.println("-----------取消后----------");
        s1.cancelCourse(c1);
        s1.show();
        c1.show();
    }

    public static void test5(){
        System.out.println("-----------取消前----------");
        c1.show();
        System.out.println("-----------取消后----------");
        t1.cancelCourse(c1);
        t1.show();
        c1.show();
    }

    public static void test6(){
        for(int i = 0; i < 60; i++){
            c1.addStudent(new Student(i, "学生" + i,
                    20, i % 2 == 0 ? "男" : "女"));
        }
        c1.show();
        try {
            c1.addStudent(s1);
        }catch(IndexOutOfLimitException e){
            System.out.println("学生人数已满");
        }
    }

    public static void test7(){
        t1.addCourse(c2);
        t1.addCourse(c3);
        t1.show();
        try {
            t1.addCourse(c4);
        } catch (IndexOutOfLimitException e) {
            System.out.println("授课数已达上限");
        }
    }
}


class Person{
    protected int no;
    protected String name;
    protected int age;
    protected String gender;

    public Person(int no, String name, int age, String gender) {
        this.no = no;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void show(Object o){
        if(o instanceof Teacher) System.out.println("类别：教师");
        else if(o instanceof Student) System.out.println("类别：学生");
        else throw new IllegalArgumentException("illegal type");
        System.out.println("编号：" + this.no);
        System.out.println("姓名：" + this.name);
        System.out.println("年龄：" + this.age);
        System.out.println("性别：" + this.gender);
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}


class Course{
    private String name;
    private Teacher teacher;
    private ArrayList<Student> students;

    public Course(String name, Teacher teacher) {
        this.name = name;
        this.teacher = teacher;
        students = new ArrayList<>();
    }

    public void addStudent(Student s){
        if(students.size() == 60)
            throw new IndexOutOfLimitException("too many students");
        students.add(s);
        s.addCourse(this);
    }

    public void removeStudent(Student s){
        students.remove(s);
    }

    public void removeTeacher(Teacher t){
        if(t == teacher) this.teacher = null;
    }

    public void show(){
        System.out.println("课程名：" + this.name);
        if(teacher == null) System.out.println("暂无授课教师");
        else System.out.println("授课教师：" + this.teacher);
        System.out.print("选课学生名单：");
        if(students.isEmpty()){
            System.out.println("暂无");
            return;
        }
        for(Student s : students){
            System.out.print(s.getName() + " ");
        }
        System.out.println();
    }

    public String getName(){
        return this.name;
    }
}


class Teacher extends Person{
    private ArrayList<Course> teachingCourse;

    public Teacher(int no, String name, int age, String gender) {
        super(no, name, age, gender);
        teachingCourse = new ArrayList<>();
    }

    public void addCourse(Course c){
        if(teachingCourse.size() == 3)
            throw new IndexOutOfLimitException("too many courses");
        teachingCourse.add(c);
    }

    public void cancelCourse(Course c){
        c.removeTeacher(this);
        teachingCourse.remove(c);
    }

    public void showCourse(){
        System.out.print("讲授课程：");
        if(teachingCourse.isEmpty()){
            System.out.println("暂无");
            return;
        }
        for(Course c : teachingCourse){
            System.out.print(c.getName() + " ");
        }
        System.out.println();
    }


    public void show(){
        super.show(this);
        showCourse();
    }
}


class Student extends Person{
    private ArrayList<Course> selectedCourse;

    public Student(int no, String name, int age, String gender) {
        super(no, name, age, gender);
        selectedCourse = new ArrayList<>();
    }

    public void addCourse(Course c){
        selectedCourse.add(c);
    }

    public void cancelCourse(Course c){
        c.removeStudent(this);
        selectedCourse.remove(c);
    }

    public void showCourse(){
        System.out.print("已选的课程：");
        if(selectedCourse.isEmpty()){
            System.out.println("暂无");
            return;
        }
        for(Course c : selectedCourse){
            System.out.print(c.getName() + " ");
        }
        System.out.println();
    }


    public void show(){
        super.show(this);
        showCourse();
    }
}


class IndexOutOfLimitException extends RuntimeException{
    public IndexOutOfLimitException(String message) {
        super(message);
    }
}

