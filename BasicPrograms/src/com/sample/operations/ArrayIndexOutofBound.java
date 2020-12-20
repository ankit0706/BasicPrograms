package com.sample.operations;

import java.util.ArrayList;
/**
Demonstration for array index out of bound
*/
public class ArrayIndexOutofBound {
	public static void main(String[] args) {
		ArrayList<String> mList = new ArrayList<>();
		mList.add("A");mList.add("B");mList.add("C");mList.add("D");mList.add("E");
		mList.add("F");mList.add("G");mList.add("H");mList.add("I");mList.add("J");
		
		for(int i=0; i<mList.size(); i++) {
			if(mList.get(i).equals("J")) {
				mList.remove(i);
			}
			System.out.println(mList.get(i));			
		}
	}
}
