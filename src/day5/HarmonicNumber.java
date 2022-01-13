package day5;

import java.util.Scanner;

public class HarmonicNumber {

	public static void harmonicNumber(int n) {
		float harmonicNo = 1;

		for (int i = 2; i <= n; i++) {
			harmonicNo += (float) 1 / i;
		}
		System.out.println(harmonicNo);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n = input.nextInt();
		input.close();
		harmonicNumber(n);
	}

}
