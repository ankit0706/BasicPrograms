package com.sample.basics;

import java.util.Scanner;

public class StringPalindrome {
	public static void main(String[] args) {
		// step 1
		System.out.println("Enter a String");
		Scanner sc = new Scanner(System.in);
		String userInput = sc.next();
		sc.close();
		// step 2
		boolean check = isPalindrome(userInput.toLowerCase());
		if(check) {
		System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
	
	}
	
	private static boolean isPalindrome(String str) {
		for(int i=0; i<str.length(); i++) {
			char c1 = str.charAt(i);
			char c2 = str.charAt(str.length()-i-1);
			if(c1 != c2) {
				return false;
			}
		}
		return true;
	}
}
