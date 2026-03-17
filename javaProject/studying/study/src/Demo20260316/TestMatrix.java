package Demo20260316;

import java.util.Scanner;

public class TestMatrix {
	public static void main(String[] args) {
		double[][] arr = new double[3][3];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextDouble();
			}
		}
		int row = sc.nextInt();
		System.out.println("对角线的元素和是" + Matrix.sumMajorDiagonal(arr));
		System.out.println("第" + row + "行的元素和是" + Matrix.sumRow(arr, row));
	}
}

class Matrix{
	public static double sumMajorDiagonal(double[][] arr){
		double sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i][i];
		}
		return sum;
	}

	public static double sumRow(double[][] arr, int row){
		double sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[row][i];
		}
		return sum;
	}
}
