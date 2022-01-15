package day5;

import java.util.Scanner;

public class Distance {

	public static void distance(int x, int y) {
		double dist = Math.sqrt(Math.pow(x, x) + Math.pow(y, y));
		System.out.println("The Distance is " + dist);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter two numbers ");
		int x = input.nextInt();
		int y = input.nextInt();
		input.close();
		distance(x, y);
	}

}
