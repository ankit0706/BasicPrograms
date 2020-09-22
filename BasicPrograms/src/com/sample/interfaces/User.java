package com.sample.interfaces;

import java.util.HashMap;
import java.util.List;

public class User {

	public static void main(String[] args) {
		HashMap<Integer, String> australia = new HashMap<>();
		australia.put(1, "North");
		australia.put(2, "South");
		australia.put(3, "West");
		australia.put(4, "Queensland");
		australia.put(5, "New South Wales");
		australia.put(6, "Victoria");
		australia.put(7, "Tasmania");
		
		List<String> list = Utility.getListFromMap(australia);
		System.out.println(list.get(2));
	}

}
