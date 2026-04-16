package Exp20260417.exp2;

import java.util.ArrayList;
import java.util.Scanner;

public class TestEmployee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee(scanner.nextInt(), scanner.next(), scanner.nextDouble()));
        Equipment e = new PC(scanner.next(), scanner.next());
        employees.add(new Programmer(scanner.nextInt(), scanner.next(), scanner.nextDouble(),Status.BUSY,e, scanner.nextDouble()));
        e = new Printer(scanner.next(), scanner.next());
        employees.add(new Designer(scanner.nextInt(), scanner.next(),  scanner.nextDouble(),Status.VOCATION,e, scanner.nextDouble(),scanner.nextInt()));
        System.out.println("--------------------------------员工列表----------------------------------");
        System.out.println("ID\t姓名\t工资\t职位\t状态\t奖金\t股票\t领用设备");
        for(int i = 0; i < employees.size(); i++){
            System.out.println(employees.get(i).toString());
        }
    }
}

class Employee{
    protected int id;
    protected String name;
    protected double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString(){
        return this.id + "\t" + this.name + "\t"
                + this.salary + "\t" + "普通员工";
    };
}


class Status {
    private String name;
    public static final Status BUSY = new Status("工作");
    public static final Status VOCATION = new Status("休假");

    private Status(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

interface Equipment{
    String getDescription();
}

class PC implements Equipment{
    private String model;
    private String display;

    public PC(String model, String display) {
        this.model = model;
        this.display = display;
    }

    @Override
    public String getDescription() {
        return "PC机" + "(" + this.model + "/" + this.display + ")";
    }
}

class Printer implements Equipment{
    private String name;
    private String type;

    public Printer(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String getDescription() {
        return "打印机" + "(" + this.name + "/" + this.type + ")";
    }
}

class Programmer extends Employee{
    protected Status status;
    protected Equipment equipment;
    protected double bonus;

    public Programmer(int id, String name, double salary,
                      Status status, Equipment equipment, double bonus) {
        super(id, name, salary);
        this.status = status;
        this.equipment = equipment;
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return this.id + "\t" + this.name + "\t"
                + this.salary + "\t" + "程序员\t"
                + status.getName() + "\t" + this.bonus + "\t"
                + "    \t" + equipment.getDescription();
    }
}


class Designer extends Programmer{
    private int stock;

    public Designer(int id, String name, double salary,
                    Status status, Equipment equipment, double bonus, int stock) {
        super(id, name, salary, status, equipment, bonus);
        this.stock = stock;
    }

    @Override
    public String toString() {
        return this.id + "\t" + this.name + "\t"
                + this.salary + "\t" + "设计师\t"
                + status.getName() + "\t" + this.bonus + "\t"
                + this.stock +"\t" + equipment.getDescription();
    }
}