package day5;

import java.util.Scanner;

public class VowelOrConsonant {

	public static void vowelOrConsonant(char ch) {
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			System.out.println("The Entered Character is Vowel");
		} else {
			System.out.println("The Entered Character is Consonant");
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a character ");
		char ch = input.next().charAt(0);
		input.close();
		vowelOrConsonant(ch);
	}

}
