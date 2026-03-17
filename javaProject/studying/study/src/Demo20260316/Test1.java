package Demo20260316;

import java.util.*;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("排序前");
        show(arr);
        System.out.println();
        System.out.println("排序后");
        Arrays.sort(arr);
        show(arr);
    }

    public static void show(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
