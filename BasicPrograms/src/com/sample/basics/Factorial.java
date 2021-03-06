package com.sample.basics;

import java.util.Scanner;
/**
Takes a number from command prompt using the Scanner class
and calculates the factorial of that number, using a for loop
which runs in reverse order
**/
public class Factorial {
	public static void main(String[] args) {
		Factorial factorial = new Factorial();
		factorial.promptInput();
		int number = factorial.getNumber();
		System.out.println("You Entered : " + number);

		int result = 1;
		for(int i=number; i>=1; i--) {
			result = result * i;
		}
		System.out.println("The factorial of " + number + " = "  + result);
	}
	
	private void promptInput() {
		System.out.println("Enter a number");
	}
	
	private int getNumber() {
		Scanner sc = new Scanner(System.in);
	    int i = sc.nextInt();
	    sc.close();
	    return i;
	}
}
