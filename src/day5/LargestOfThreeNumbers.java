package day5;

import java.util.Scanner;

public class LargestOfThreeNumbers {

	public static void largestNumber(int a, int b, int c) {
		if (a > b && a > c) {
			System.out.println("The largest amoung three numbers is " + a);
		} else if (b > a && b > c) {
			System.out.println("The largest amoung three numbers is " + b);
		} else {
			System.out.println("The largest amoung three numbers is " + c);
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter three numbers ");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		input.close();
		largestNumber(a, b, c);
	}

}
