package Demo20260309;


import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] score = new int[n];
        char[] grade = new char[n];
        for (int i = 0; i < n; i++) {
            score[i] = sc.nextInt();
            grade[i] = getGrade(score[i]);
        }
        show(score);
        show(grade);
    }

    public static char getGrade(int score){
        char grade;
        if(score < 60) grade = 'E';
        else if(score < 70)grade = 'D';
        else if(score < 80) grade = 'C';
        else if(score < 90) grade = 'B';
        else grade = 'A';
        return grade;
    }

    public static void show(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if(i != arr.length - 1){
                System.out.print(" ");
            }else{
                System.out.print("]");
            }
        }
        System.out.println();
    }

    public static void show(char[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if(i != arr.length - 1){
                System.out.print(" ");
            }else{
                System.out.print("]");
            }
        }
        System.out.println();
    }
}

/*

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] arr1 = new double[10];
        int[] arr2 = new int[5];
        for (int i = 0; i < 10; i++) {
            arr1[i] = sc.nextDouble();
        }
        for (int i = 0; i < 5; i++) {
            arr2[i] = sc.nextInt();
        }
        System.out.println(average(arr1));
        System.out.println(average(arr2));
    }

    public static double average(int[] arr){
        double sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum / arr.length;
    }

    public static double average(double[] arr){
        double sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum / arr.length;
    }
}


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += sc.nextInt();
        }
        System.out.println("5个数的和是：" + sum);
    }
}



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        for (int i = 0; i < 6; i++) {
            sum += sc.nextDouble();
        }
        System.out.println(sum);
    }
}



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a1 = new int[2];
        double[] a2 = new double[2];
        a1[0] = sc.nextInt();
        a1[1] = sc.nextInt();
        a2[0] = sc.nextDouble();
        a2[1] = sc.nextDouble();
        System.out.println("2个整数中较大值为：" + Math.max(a1[0], a1[1]));
        System.out.println("2个浮点数中较大值为：" + Math.max(a2[0], a2[1]));
    }
}



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] arr = new double[4];
        for (int i = 0; i < 12; i++) {
            arr[i % 4] = arr[i % 4] + sc.nextDouble();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("第" + i +  "列元素的和为" + arr[i]);
        }
    }
}




import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 0;
        for (int i = 0; i < n; i++) {
            int temp = sc.nextInt();
            if(max == 0 || temp > max) max = temp;
        }
        System.out.println("最大数是" + max);
    }
}


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        show(arr);
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        show(arr);
    }

    public static void show(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if(i != arr.length - 1) System.out.print(" ");
        }
        System.out.print("]");
        System.out.println();
    }
}







 */
