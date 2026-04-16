package Demo20260404.vector;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入向量维度：");
        int dim = sc.nextInt();
        double[] vector = new double[dim];
        System.out.println("请输入此向量：");
        for (int i = 0; i < vector.length; i++) {
            vector[i] = sc.nextDouble();
        }
        double norm = 0;
        for (int i = 0; i < vector.length; i++) {
            norm += Math.pow(vector[i], 2);
        }
        double[] e = new double[dim];
        double[] e_minus = new double[dim];
        for (int i = 0; i < dim; i++) {
            e[i] = vector[i] / norm;
            e_minus[i] = -e[i];
        }
        System.out.println("方向向量为：" + Arrays.toString(e));
        System.out.println("或：" + Arrays.toString(e_minus));
    }
}
