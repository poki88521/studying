package Demo20260316;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("数组的最大元素是" + ArrayUtil.max(arr));
        System.out.println("数组的最小元素是" + ArrayUtil.min(arr));
        System.out.println("数组的平均值是" + ArrayUtil.average(arr));
    }
}

class ArrayUtil{
    public static int min(int[] arr){
        int n = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < n) n = arr[i];
        }
        return n;
    }

    public static int max(int[] arr){
        int n = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > n) n = arr[i];
        }
        return n;
    }

    public static double average(int[] arr){
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
    }
}