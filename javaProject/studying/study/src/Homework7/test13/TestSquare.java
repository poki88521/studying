package Homework7.test13;

import java.util.Scanner;
import java.util.Arrays;

public class TestSquare {
    public static void main(String[] args) {
        Square[] data = new Square[5];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < data.length; i++) {
            data[i] = new Square(input.nextInt());
        }
        System.out.println("数组原顺序：");
        for (Square squ : data)
            System.out.println(squ.getArea());
        System.out.println("升序排序后：");
        Square.sortByArea(data);
        for (Square squ : data)
            System.out.println(squ.getArea());
        input.close();
    }
}

class Square implements Comparable<Square> {
    private double side;
    public Square(int side) {
        this.side = side;
    }
    public double getArea() {
        return side * side;
    }
    public int compareTo(Square o) {
        return Double.compare(this.getArea(), o.getArea());
    }
    public static void sortByArea(Square[] arr) {
        Arrays.sort(arr);
    }
}

