package com.sample.basics;

public class Recursion1 {
	public static void main(String[] args) {
		System.out.println(calculate(6));
	}
	
	private static int calculate(int k) {
		if(k == 0 || k == 1) {
			return 1;
		} else {
			return k * calculate(k-1);
		}
	}
}
