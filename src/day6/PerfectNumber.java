package day6;

import java.util.Scanner;

public class PerfectNumber {

	public static void perfectNumber(int num) {
		int sum = 0;
		for (int i = 1; i <= num / 2; i++) {
			if (num % i == 0) {
				sum += i;
			}
		}
		System.out.println(sum);

		if (num == sum) {
			System.out.println("The entered number is perfect number ");
		} else {
			System.out.println("The entered number is not a perfect number ");
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter two numbers ");
		int num = input.nextInt();
		input.close();
		perfectNumber(num);
	}
}
