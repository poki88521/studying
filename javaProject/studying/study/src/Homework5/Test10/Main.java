package Homework5.Test10;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Account a = new Account(input.nextInt(),input.nextDouble());
        System.out.println("账户是" + a.getId() + "\n初始余额是" + a.getBalance());
        a.withdraw(input.nextDouble());
        a.deposit(input.nextDouble());
    }
}

class Account{
    private int id;
    private double balance;

    public Account() {
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public void withdraw(double money){
        if(money > balance){
            System.out.println("余额不足");
        }
        else{
            balance -= money;
            System.out.println("取款后余额是" + balance);
        }
    }

    public void deposit(double money){
        balance += money;
        System.out.println("存款后余额是" + balance);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}