package Homework7.test19;

import java.util.Scanner;

public class TestTrolly {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Good[] goods = new Good[2];
        String origin = input.next();
        String name1 = input.next();
        double unitPrice1 = input.nextDouble();
        double discount1 = input.nextDouble();
        double amount1 = input.nextDouble();
        goods[0] = new Fruit(origin, name1, unitPrice1, discount1, amount1);
        String breed = input.next();
        String name2 = input.next();
        double unitPrice2 = input.nextDouble();
        double discount2 = input.nextDouble();
        double amount2 = input.nextDouble();
        goods[1] = new Drink(breed, name2, unitPrice2, discount2, amount2);
        Trolly trolly = new Trolly("tid", goods);
        System.out.println();
        System.out.println(trolly.toString());
        input.close();
    }
}

class Good {
    protected String name;
    protected double unitPrice;
    protected double discount;
    protected double amount;
    public Good() {
        this.discount = 1;
    }
    public Good(String name, double unitPrice, double discount, double amount) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.discount = discount;
        this.amount = amount;
    }
    public double count() {
        return unitPrice * discount * amount;
    }
}

class Fruit extends Good {
    private String origin;
    public Fruit(String origin, String name, double unitPrice, double discount, double amount) {
        super(name, unitPrice, discount, amount);
        this.origin = origin;
    }
    public String toString() {
        return name + " 产地=" + origin + " 单价(元/公斤)=" + unitPrice + " 折扣=" + discount + " 重量(公斤)=" + amount;
    }
}

class Drink extends Good {
    private String breed;
    public Drink(String breed, String name, double unitPrice, double discount, double amount) {
        super(name, unitPrice, discount, amount);
        this.breed = breed;
    }
    public String toString() {
        return name + " 品牌=" + breed + " 单价(元/瓶)=" + unitPrice + " 折扣=" + discount + " 数量(瓶)=" + amount;
    }
}

class Trolly {
    private String tid;
    private Good[] goods;
    public Trolly(String tid, Good[] goods) {
        this.tid = tid;
        this.goods = goods;
    }
    public double sum() {
        double total = 0;
        for (int i = 0; i < goods.length; i++) {
            total += goods[i].count();
        }
        return total;
    }
    public String toString() {
        String result = "购物车" + tid + "共有" + goods.length + "件商品\n";
        for (int i = 0; i < goods.length; i++) {
            result += goods[i].toString();
            if (i != goods.length - 1) {
                result += "\n";
            }
        }
        result += "\n应付款" + sum() + "元";
        return result;
    }
}
