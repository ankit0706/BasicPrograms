package com.sample.basics;

import java.util.Scanner;

public class StringReversal {
	public static void main(String[] args) {
		// step 1
		System.out.println("Enter a String");
		Scanner sc = new Scanner(System.in);
		String sample = sc.nextLine();
		sc.close();
		//step 2
		int stringLength = sample.length();
		StringBuilder sb = new StringBuilder();
		for(int i=stringLength-1; i>=0; i--) {
			char s = sample.charAt(i);
			sb.append(s);
		}
		System.out.println(sb.toString());
	}
}
