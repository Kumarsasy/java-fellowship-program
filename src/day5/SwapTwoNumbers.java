package day5;

import java.util.Scanner;

public class SwapTwoNumbers {
	
	public void swap(int num1, int num2) {
		int temp; 
		temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.println(num1);
		System.out.println(num2);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter two numbers ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		input.close();
		SwapTwoNumbers obj = new SwapTwoNumbers();
		obj.swap(num1,num2);
	}

}
