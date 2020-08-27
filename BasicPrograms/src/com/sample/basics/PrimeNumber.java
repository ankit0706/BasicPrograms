package com.sample.basics;

import java.util.Scanner;

public class PrimeNumber {
	private static Scanner sc;
	public static void main(String[] args) {
		sc  = new Scanner(System.in);
		
		for(int i=0; i<100; i++) {
			promptInput();
			int number = sc.nextInt();
			String result = testPrime(number);
			System.out.println(result);
		}
		
		sc.close();
		
	}
	
	private static void promptInput() {
		System.out.println("Enter a number");
	}
	
	private static String testPrime(int number) {
		
		if(number <= 1) {
			return number + " is a not a valid input";
		} 
		
		for(int i = 2; i < number; i++) {
			if(number % i == 0) {
				return number + " is divisible by " + i;
			}
		}	
		
		return number + " is Prime number";
	}
}
