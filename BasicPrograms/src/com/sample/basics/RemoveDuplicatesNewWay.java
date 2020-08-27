package com.sample.basics;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesNewWay {
	public static void main(String[] args) {
		String[] strArr = {"lg", "samsung", "motorola", "apple", "lg"};
		List<String> mList = Arrays.asList(strArr);
		System.out.println(mList);
		
		List<String> distinctList = mList.stream().distinct().collect(Collectors.toList());
		System.out.println(distinctList);
	}
}
