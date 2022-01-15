package day5;

import java.util.Scanner;

public class QuotientRemainder {

	static Scanner input = new Scanner(System.in);

	public static void divide(int divident, int divisor) {
		int quotient = divident / divisor;
		int remainder = divident % divisor;
		System.out.println("The Quotient of the entered number is " + quotient);
		System.out.println("The Remainder of the entered number is " + remainder);
	}

	public static void main(String[] args) {

		System.out.println("Enter two numbers ");
		int divident = input.nextInt();
		int divisor = input.nextInt();

		divide(divident, divisor);
		input.close();
	}

}
