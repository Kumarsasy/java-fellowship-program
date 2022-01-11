package day3;

public class LineComparision {

	static void message() {
		System.out.println("Welcome to Line Comparison Computation Program");
	}

	static void lengthOfLine(int x1, int y1, int x2, int y2) {
		double length;
		length = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		System.out.println("Length of the Line is " + length);
	}

	public static void main(String[] args) {
		message();
		lengthOfLine(3, 4, 5, 4);

	}

}
