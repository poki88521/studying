package Exp20260417.exp1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Company c = new Company();
        MonthWorker mw = new MonthWorker(sc.next(), sc.nextDouble());
        WeekWorker ww = new WeekWorker(sc.next(), sc.nextDouble());
        c.addEmployee(mw);
        c.addEmployee(ww);
        System.out.println(c.toString());
    }
}

class Company{
    private Employee[] workers = new Employee[10];
    private int numberOfWorkers;

    public Company(){
    }

    public String toString(){
        String workerString = "";
        for (int i = 0; i < workers.length; i++) {
            if(workers[i] == null) break;
            workerString += workers[i].toString();
        }
        return workerString + "公司年工资总额 " + computeTotalSal();
    }

    public double computeTotalSal(){
        double total = 0;
        for (int i = 0; i < workers.length; i++) {
            if(workers[i] == null) break;
            total += workers[i].earnings();
        }
        return total;
    }

    public void addEmployee(Employee em){
        workers[numberOfWorkers] = em;
        numberOfWorkers++;
    }
}



abstract class Employee{
    protected String name;

    public Employee() {
    }

    public abstract double earnings();

    public abstract String toString();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}



class MonthWorker extends Employee{
    private double monthSal;

    public MonthWorker(){
    }

    public MonthWorker(String name, double monthSal) {
        this.name = name;
        this.monthSal = monthSal;
    }

    @Override
    public double earnings() {
        return monthSal * 12;
    }

    @Override
    public String toString() {
        return "姓名 " + getName() + "\n"
                + "月薪为 " + getMonthSal() + "\n"
                + "年薪为 " + earnings() + "\n";
    }

    public double getMonthSal() {
        return monthSal;
    }

    public void setMonthSal(double monthSal) {
        this.monthSal = monthSal;
    }
}



class WeekWorker extends Employee{
    private double weekSal;

    public WeekWorker(){
    }

    public WeekWorker(String name, double weekSal) {
        this.name = name;
        this.weekSal = weekSal;
    }

    @Override
    public double earnings() {
        return weekSal * 52;
    }

    @Override
    public String toString() {
        return "姓名 " + getName() + "\n"
                + "周薪为 " + getWeekSal() + "\n"
                + "年薪为 " + earnings() + "\n";
    }

    public double getWeekSal() {
        return weekSal;
    }

    public void setWeekSal(double weekSal) {
        this.weekSal = weekSal;
    }
}
