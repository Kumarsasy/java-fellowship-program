package day5;

import java.util.Scanner;

public class EvenOrOdd {
	
	public static void evenOrOdd( int num) {
		if(num % 2 == 0 ) {
			System.out.println("The Entered number is Even number");
		} else {
			System.out.println("The Entered number is Odd number");
		}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number ");
		int num = input.nextInt();
		input.close();
		evenOrOdd(num);
	}
}
