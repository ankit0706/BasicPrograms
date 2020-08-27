package com.sample.basics;

public class Recursion2 {
	public static void main(String[] args) {
		System.out.println(calculate(10));
	}
	
	private static int calculate(int k) {
		if(k > 0) {
			return k + calculate(k - 1);
		}else {
			return 0;
		}
	}
}
