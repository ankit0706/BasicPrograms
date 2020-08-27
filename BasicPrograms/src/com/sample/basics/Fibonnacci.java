package com.sample.basics;

import java.util.ArrayList;
import java.util.List;

/**
 * Print first 15 elements of Fibonacci series
 * @author AANU
 *
 */
public class Fibonnacci {
	public static void main(String[] args) {
		List<Integer> fibonacciList = new ArrayList<>();
		//F_0=0, F_1=1 {according to wikipedia}
		fibonacciList.add(0);
		fibonacciList.add(1);
		
		for(int i=0; i<15; i++) {
				int lastDigit = fibonacciList.get(fibonacciList.size() - 1);
				int secondLastDigit = fibonacciList.get(fibonacciList.size() - 2);
				fibonacciList.add(lastDigit + secondLastDigit);
		}
		System.out.println(fibonacciList);
		
	}
}
