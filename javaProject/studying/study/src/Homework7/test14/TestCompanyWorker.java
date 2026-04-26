package Homework7.test14;


import java.util.ArrayList;
import java.util.Scanner;

public class TestCompanyWorker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Worker worker1 = new Worker(scanner.next(), scanner.nextDouble());
        Worker worker2 = new Worker(scanner.next(), scanner.nextDouble());
        Worker worker3 = new Worker(scanner.next(), scanner.nextDouble());
        Company company = new Company();
        company.addWorker(worker1);
        company.addWorker(worker2);
        company.addWorker(worker3);
        System.out.println("姓名\t\t" + "工资");
        System.out.println("-------------------------");
        System.out.println(company.toString());
        System.out.println("工资合计 " + company.earnings());
        scanner.close();
    }
}

class Worker {
    private String name;
    private double sal;
    public Worker() {
    }
    public Worker(String name, double sal) {
        this.name = name;
        this.sal = sal;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setSal(double sal) {
        this.sal = sal;
    }
    public double getSal() {
        return sal;
    }
    public String toString() {
        return name + " " + sal;
    }
}

class Company {
    private String name;
    private ArrayList<Worker> workers;
    public Company() {
        this.workers = new ArrayList<Worker>();
    }
    public Company(String name, ArrayList<Worker> workers) {
        this.name = name;
        this.workers = workers;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setWorkers(ArrayList<Worker> workers) {
        this.workers = workers;
    }
    public ArrayList<Worker> getWorkers() {
        return workers;
    }
    public void addWorker(Worker worker) {
        workers.add(worker);
    }
    public double earnings() {
        double sum = 0;
        for (int i = 0; i < workers.size(); i++) {
            sum += workers.get(i).getSal();
        }
        return sum;
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < workers.size(); i++) {
            sb.append(workers.get(i).toString());
            if (i != workers.size() - 1) {
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}


