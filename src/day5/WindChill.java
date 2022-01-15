package day5;

import java.util.Scanner;

public class WindChill {

	public static void windChill(int t, int v) {
		double w = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);
		System.out.println("The wind Chill is " + w);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the temperature value ");
		int t = input.nextInt();
		System.out.println("Enter the wind speed value ");
		int v = input.nextInt();
		input.close();
		windChill(t, v);
	}
}
