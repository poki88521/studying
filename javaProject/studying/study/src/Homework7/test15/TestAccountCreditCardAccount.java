package Homework7.test15;

import java.util.Scanner;

public class TestAccountCreditCardAccount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CreditCardAccount creaditAccount = new CreditCardAccount(1, 2, 2);
        System.out.println("--------信用卡账户的初始信息---------\n" + creaditAccount.toString());
        creaditAccount.depoit(input.nextDouble());
        System.out.println("--------信用卡账户存款后的信息--------\n" + creaditAccount.toString());
        creaditAccount.withdraw(input.nextDouble());
        System.out.println("--------信用卡账户取款后的信息--------\n" + creaditAccount.toString());
        System.out.println("\n*********************************************\n");
        SavingsCard savingsCard = new SavingsCard(2, 2);
        System.out.println("--------储蓄卡账户的初始信息---------\n" + savingsCard.toString());
        savingsCard.depoit(input.nextDouble());
        System.out.println("--------储蓄卡账户存款后的信息--------\n" + savingsCard.toString());
        savingsCard.withdraw(input.nextDouble());
        System.out.println("--------储蓄卡账户取款后的信息--------\n" + savingsCard.toString());
        input.close();
    }
}

class Account {
    protected int id;
    protected double balance;
    public Account() {
    }
    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }
    public void depoit(double money) {
        balance += money;
    }
    public void withdraw(double money) {
        if (balance >= money) {
            balance -= money;
        } else {
            System.out.println("余额不足");
        }
    }
    public String toString() {
        return "账户 " + id + " 余额 " + balance;
    }
}

class CreditCardAccount extends Account {
    private double creditCardLimit;
    public CreditCardAccount() {
        super();
        this.creditCardLimit = 5000;
    }
    public CreditCardAccount(int id, double balance, double creditCardLimit) {
        super(id, balance);
        this.creditCardLimit = creditCardLimit;
    }
    public void withdraw(double money) {
        if (balance + creditCardLimit >= money) {
            balance -= money;
        } else {
            System.out.println("余额不足");
        }
    }
    public String toString() {
        return "账户 " + id + " 余额 " + balance + " 额度 " + creditCardLimit;
    }
}

class SavingsCard extends Account {
    public SavingsCard() {
        super();
    }
    public SavingsCard(int id, double balance) {
        super(id, balance);
    }
    public void withdraw(double money) {
        if (balance >= money) {
            balance -= money;
        } else {
            System.out.println("余额不足");
        }
    }
    public String toString() {
        return "账户 " + id + " 余额 " + balance;
    }
}