package Exp20260327.exp2;


import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Stack s = new Stack(6);
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            s.push(sc.nextInt());
        }
        System.out.println("弹出的栈顶元素是" + s.pop());
        System.out.println("栈顶元素是" + s.peek());
        while(s.peek() != 0){
            System.out.print(s.pop() + " ");
        }
    }
}

class Stack{
    public static final int DEFAULT_CAPACITY = 5;
    private int capacity = DEFAULT_CAPACITY;
    private int size = 0;
    private int[] elements = new int[DEFAULT_CAPACITY];

    public Stack(){}

    public Stack(int capacity){
        elements = new int[capacity];
        this.capacity = capacity;
    }

    public boolean empty(){
        return size == 0;
    }

    public int peek(){
        return elements[size];
    }

    public void push(int value){
        size++;
        if(size >= capacity){
            elements = Arrays.copyOf(elements, 2 * capacity);
        }
        elements[size] = value;
    }

    public int pop(){
        int value = elements[size];
        elements[size] = 0;
        if(size != 0) size--;
        return value;
    }

    public int getSize(){
        return size;
    }
}
