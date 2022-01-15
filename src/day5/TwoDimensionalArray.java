package day5;

import java.util.Scanner;

public class TwoDimensionalArray {

	static Scanner input = new Scanner(System.in);

	public static void twoDimensionalArray(int row, int col) {
		int array[][] = new int[row][col];

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.println("Enter numbers in array");
				array[i][j] = input.nextInt();
				System.out.println(array[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		System.out.println("Enter number of rows and columns ");
		int row = input.nextInt();
		int col = input.nextInt();

		twoDimensionalArray(row, col);
		input.close();
	}
}
