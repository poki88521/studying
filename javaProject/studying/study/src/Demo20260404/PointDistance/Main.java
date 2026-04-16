package Demo20260404.PointDistance;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个点的x，y坐标：");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        System.out.println("请输入第二个点的x，y坐标：");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        System.out.println("两点的距离为：" + Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2)));
    }
}
