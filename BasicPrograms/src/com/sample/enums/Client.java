package com.sample.enums;

public class Client {
	public static void main(String[] args) {
		Directions direction = Directions.NORTH;
		System.out.println(direction);
		
		int number = direction.getDirectionNumberD();
		System.out.println(number);
		
	}
}
