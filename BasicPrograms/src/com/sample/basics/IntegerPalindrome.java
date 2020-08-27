package com.sample.basics;

import java.util.Scanner;

public class IntegerPalindrome {
	public static void main(String[] args) {
		// step 1
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int userInput = sc.nextInt();
		sc.close();
		// step 2
		boolean check = isPalindrome(userInput);
		if(check) {
		System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
	}
	
	private static boolean isPalindrome(int number) {
		int reverseNumber = 0;
		int originalNumber = number;
		while(number != 0) {
			int remainder = number%10;
			reverseNumber = reverseNumber * 10 + remainder;
			number = number/10;
		}
		
		if(originalNumber == reverseNumber) {
			return true;
		}else {
			return false;
		}
	}
}
