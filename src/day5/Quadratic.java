package day5;

import java.util.Scanner;

public class Quadratic {

	public static void quadratic(double a, double b, double c) {

		double delta = (b * b) - 4 * a * c;

		if (delta > 0) {
			System.out.println("The roots of the equation are real and different ");
			double root1 = (-b + Math.sqrt(delta)) / (2 * a);
			double root2 = (-b - Math.sqrt(delta)) / (2 * a);
			System.out.println("root1= " + root1);
			System.out.println("root2= " + root2);
		} else if (delta == 0) {
			System.out.println("The roots of the equation are real and same ");
			double root1 = -b / (2 * a);
			System.out.println("root1= " + root1 + "root2= " + root1);
		} else {
			System.out.println("The roots of the equation are complex and different");
			String root1, root2;
			root1 = -(double) b / (2 * a) + "+i" + Math.sqrt(-(b * b) - 4 * a * c / (2 * a));
			root2 = -(double) b / (2 * a) + "-i" + Math.sqrt(-(b * b) - 4 * a * c / (2 * a));
			System.out.println("root1= " + root1 + "root2= " + root2);
		}

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter two numbers ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		input.close();
		quadratic(a, b, c);
	}

}
