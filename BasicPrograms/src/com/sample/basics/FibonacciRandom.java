package com.sample.basics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * INstead of starting from 0 and 1, It will take a random number from user and
 * print fibonacci series from there using the function F_n = F_(n-1) + F_(n-2)
 * 
 * @author AANU
 *
 */
public class FibonacciRandom {
	public static void main(String[] args) {
		// step 1
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int userInput = sc.nextInt();
		sc.close();
		// step 2
		List<Integer> fibonacciList = new ArrayList<>();
		fibonacciList.add(userInput);// F_0 fixed
		fibonacciList.add(userInput);// F_1 fixed
		// step 3
		for (int i = 0; i < 10; i++) {
			int lastDigit = fibonacciList.get(fibonacciList.size() - 1);
			int secondLastDigit = fibonacciList.get(fibonacciList.size() - 2);
			fibonacciList.add(lastDigit + secondLastDigit);
		}
		System.out.println(fibonacciList);
	}
}
