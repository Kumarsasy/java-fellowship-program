package day6;

import java.util.Scanner;

public class PrimeNumber {

	public static void primeNumber(int num) {
		int count = 0;
		for (int i = 2; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		if (count == 1) {
			System.out.println("The entered number is a Prime number ");
		} else {
			System.out.println("The entered number is not a prime number ");
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number ");
		int num = input.nextInt();
		input.close();
		primeNumber(num);

	}

}
