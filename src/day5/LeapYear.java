package day5;

import java.util.Scanner;

public class LeapYear {

	static void leapYear(int year) {
		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
			System.out.println("The Entered year is a Leap year");
		} else {
			System.out.println("The Entered year is not a Leap year");
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the year you want check wheather leap year or not ");
		int year = input.nextInt();
		input.close();
		leapYear(year);
	}
}
