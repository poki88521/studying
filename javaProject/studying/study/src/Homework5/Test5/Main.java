package Homework5.Test5;


import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Loan l = new Loan(sc.nextDouble(), sc.nextInt(), sc.nextDouble());
        System.out.println("贷款年利率是" + l.getAnnualInterestRate());
        System.out.println("贷款总额是" + l.getLoanAmount());
        System.out.println("贷款年限是" + l.getNumberOfYears());
        System.out.println("月还款额是" + l.getMonthlyPayment());
        System.out.println("还款总额是" + l.getTotalPayment());
    }
}
class Loan{
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;

    public Loan() {
    }

    public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
    }

    @Deprecated
    public BigDecimal getMonthlyPayment_d1(){
        BigDecimal rate = new BigDecimal(annualInterestRate / 1200);
        BigDecimal la = new BigDecimal(loanAmount);
        BigDecimal one = new BigDecimal(1);
        BigDecimal twelve = new BigDecimal(12);
        return la.multiply(rate.divide(one.subtract((one.divide(one.add(rate),
                        new MathContext(20, RoundingMode.HALF_DOWN))).pow(numberOfYears * 12)),
                new MathContext(16, RoundingMode.HALF_DOWN)));
    }

    @Deprecated
    public double getMonthlyPayment_d2(){
        double rate = annualInterestRate  / 1200;
        double temp = 1;
        for (int i = 0; i < numberOfYears * 12; i++) {
            temp *= 1 / (1 + rate);
        }
        return loanAmount * rate / (1 - temp);
    }

    public double getMonthlyPayment(){
        double rate = annualInterestRate  / 1200;
        return loanAmount * rate / (1 - Math.pow(1 + rate, -numberOfYears * 12));
    }

    @Deprecated
    public BigDecimal getTotalPayment_d1(){
        return getMonthlyPayment_d1().multiply(new BigDecimal(numberOfYears * 12));
    }

    public double getTotalPayment(){
        return getMonthlyPayment() * numberOfYears * 12;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }

    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }
}