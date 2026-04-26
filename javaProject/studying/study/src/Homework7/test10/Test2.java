package Homework7.test10;


import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.next();
        if (name.equals("流感")){
            Influenza influenza=new Influenza();
            influenza.setName(name);
            influenza.setVirus(input.next());
            Vaccine vaccine=new Vaccine();
            vaccine.setName(input.next());
            vaccine.setCompany(input.next());
            vaccine.setOrigin(input.next());
            vaccine.setInjectTime(input.nextInt());
            influenza.setVaccine(vaccine);
            System.out.println(influenza.toString());
        }
        else {
            Covid19 covid=new Covid19();
            covid.setName(name);
            covid.setVirus(input.next());
            covid.setTest(input.next());
            Vaccine vaccine=new Vaccine();
            vaccine.setName(input.next());
            vaccine.setCompany(input.next());
            vaccine.setOrigin(input.next());
            vaccine.setInjectTime(input.nextInt());
            covid.setVaccine(vaccine);
            System.out.println(covid.toString());
        }
    }
}

class Pandemic {
    private String name;
    private Vaccine vaccine;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vaccine getVaccine() {
        return vaccine;
    }

    public void setVaccine(Vaccine vaccine) {
        this.vaccine = vaccine;
    }
}

class Vaccine {
    protected String name;
    protected String company;
    protected String origin;
    protected int injectTime;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public int getInjectTime() {
        return injectTime;
    }

    public void setInjectTime(int injectTime) {
        this.injectTime = injectTime;
    }

    public String toString() {
        return "疫苗信息" + "\n"
                + "疫苗名称：" + name
                + "\n生产厂商："
                + company + "\n疫苗产地："
                + origin + "\n注射次数：" + injectTime;
    }
}

class Influenza extends Pandemic {
    private String virus;

    public String getVirus() {
        return virus;
    }

    public void setVirus(String virus) {
        this.virus = virus;
    }

    public String toString() {
        return super.getName() + "病毒种类：" + virus + "\n" + getVaccine().toString() + "\n";
    }
}

class Covid19 extends Pandemic {
    private String virus;
    private String test;

    public String getVirus() {
        return virus;
    }

    public void setVirus(String virus) {
        this.virus = virus;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    public String toString() {
        return super.getName() + "\n" + "病毒种类：" + virus +
                "\n检测方法：" + test + "\n" + getVaccine().toString() + "\n";
    }
}

