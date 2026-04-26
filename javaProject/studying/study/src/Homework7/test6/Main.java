package Homework7.test6;

public class Main {
    public static void main(String[] args) {
        Student tom = new Student("Tom", Student.FRESHMAN, "北京青年志愿者协会");
        Faculty jerry = new Faculty("Jerry", Faculty.ASSOCIATE_PROFESSOR, "北京市慈善义工协会");
        System.out.println("姓名" + tom.getName());
        System.out.println("年级" + tom.getGrade());
        System.out.println("所属社团" + tom.getSociety());
        System.out.println("姓名" + jerry.getName());
        System.out.println("职称" + jerry.getTitle());
        System.out.println("所属社团" + jerry.getSociety());
    }
}

interface Volunteer {
    String getSociety();
}

class Person {
    protected String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return name;
    }
}

class Student extends Person implements Volunteer {
    public static final int FRESHMAN = 1;
    public static final int SOPHOMORE = 2;
    public static final int JUNIOR = 3;
    public static final int SENIOR = 4;
    private int grade;
    private String society;

    public Student(String name, int grade, String society) {
        super(name);
        this.grade = grade;
        this.society = society;
    }

    public int getGrade() {
        return grade;
    }

    public String getSociety() {
        return society;
    }

    public String toString() {
        return name + " " + grade;
    }
}

class Faculty extends Person implements Volunteer {
    public static final String TEACHING_ASSISTANT = "助教";
    public static final String LECTURER = "讲师";
    public static final String ASSOCIATE_PROFESSOR = "副教授";
    public static final String PROFESSOR = "教授";
    private String title;
    private String society;

    public Faculty(String name, String title, String society) {
        super(name);
        this.title = title;
        this.society = society;
    }

    public String getTitle() {
        return title;
    }

    public String getSociety() {
        return society;
    }

    public String toString() {
        return name + " " + title;
    }
}
