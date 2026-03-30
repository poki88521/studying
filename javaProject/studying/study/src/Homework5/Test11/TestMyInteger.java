package Homework5.Test11;

import java.util.Scanner;

public class TestMyInteger {
    public static void main(String[] a){
        Scanner input = new Scanner(System.in);
        int value = input.nextInt();
        String str= input.next();
        MyInteger myInteger=new MyInteger(value);
        System.out.println();
        System.out.println(myInteger.getValue()+"为奇数----> "+myInteger.isOdd());
        System.out.println(myInteger.getValue()+"为偶数----> "+myInteger.isEven());
        System.out.println(myInteger.getValue()+"为素数----> "+myInteger.isPrime());
        System.out.println();
        value = MyInteger.parseInt(str);
        System.out.println(value+"为奇数----> "+MyInteger.isOdd(value));
        System.out.println(value+"为偶数----> "+MyInteger.isEven(value));
        System.out.println(value+"为素数----> "+MyInteger.isPrime(value));
    }
}

class MyInteger{
    private int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public static boolean isEven(int value){
        return value % 2 == 0;
    }

    public static boolean isOdd(int value){
        return value % 2 != 0;
    }

    public static boolean isPrime(int value){
        for (int i = 2; i < Math.sqrt(value); i++) {
            if(value % i == 0) return false;
        }
        return true;
    }

    public boolean isEven(){
        return isEven(this.value);
    }

    public boolean isOdd(){
        return isOdd(this.value);
    }

    public boolean isPrime(){
        return isPrime(this.value);
    }

    public static int parseInt(String s){
        return Integer.parseInt(s);
    }

    public int getValue() {
        return value;
    }
}
