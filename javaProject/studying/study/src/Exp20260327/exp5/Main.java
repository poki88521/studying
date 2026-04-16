package Exp20260327.exp5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Star s = new Star(sc.nextInt(), new Position(sc.nextInt(), sc.nextInt()));
        System.out.println(s.toString());
    }
}

class Position{
    private int row;
    private int column;
    public Position(){

    }

    public Position(int row, int column) {
        this.row = row;
        this.column = column;
    }

    @Override
    public String toString() {
        return "行 " + row + "\n" + "列 " + column;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }
}

class Star{
    public static final int RED = 0;
    public static final int BLUE = 1;
    public static final int YELLOW = 2;
    public static final int GREEN = 3;

    private int type = 0;
    private Position position;

    public Star(){

    }

    public Star(int type, Position position) {
        this.type = type;
        this.position = position;
    }

    @Override
    public String toString() {
        String color = "";
        switch(type){
            case RED:
                color += "红色";
                break;
            case BLUE:
                color += "蓝色";
                break;
            case YELLOW:
                color += "黄色";
                break;
            case GREEN:
                color += "绿色";
                break;
            default:
                break;
        }
        return "颜色 " + color + "\n" + position.toString();
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}
