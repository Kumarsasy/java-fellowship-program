package day3;

import java.util.Scanner;

public class LineComparision {

	static void message() {
		System.out.println("Welcome to Line Comparison Computation Program");
	}

	static double lengthOfLine(int x1, int y1, int x2, int y2) {
		double length;
		length = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		System.out.println("Length of the Line is " + length);
		return length;
	}
		
	static void equalityOf2Lines(Double length1 , Double length2) {
		
		if(length1.equals(length2)) {
			System.out.println("The length of two lines are equal");
		}else {
			System.out.println("The length of two lines are not equal");
		}
	}
	
	static void compareTwoLines(Double length1 , Double length2) {
		
			System.out.println(length1.compareTo(length2));

	}
	
	public static void main(String[] args) {
		message();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the coordinates of (x1,y1) and (x2,y2) ");
		int x1 = input.nextInt();
		int y1 = input.nextInt();
		int x2 = input.nextInt();
		int y2 = input.nextInt();
		
		System.out.println("Enter the coordinates of (x3,y3) and (x4,y4) ");
		int x3 = input.nextInt();
		int y3 = input.nextInt();
		int x4 = input.nextInt();
		int y4 = input.nextInt();
		input.close();
		
		Double l1=lengthOfLine(x1,y1,x2,y2);
		Double l2=lengthOfLine(x3,y3,x4,y4);
		System.out.println(l1);
		System.out.println(l2);
		
		equalityOf2Lines(l1,l2);
		compareTwoLines(l1,l2);


	}

}
