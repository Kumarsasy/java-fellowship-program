package day6;

import java.util.Scanner;

public class ReverseNumber {

	public static void reverse(int num) {
		int reverse = 0;
		while (num != 0) {
			int remainder = num % 10;
			reverse = reverse * 10 + remainder;
			num = num / 10;
		}
		System.out.println("The reverse of the given number is: " + reverse);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number ");
		int num = input.nextInt();
		input.close();
		reverse(num);
	}

}
