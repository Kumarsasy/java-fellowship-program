package day5;

import java.util.Scanner;

public class PowerOfTwo {

	static void powerOfTwo(int n) {
		int i = 0;
		int result = 0;
		while (i <= n) {
			result = (int) Math.pow(2, i);
			System.out.println(Math.round(result));
			i++;
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n = input.nextInt();
		input.close();
		powerOfTwo(n);
	}

}
