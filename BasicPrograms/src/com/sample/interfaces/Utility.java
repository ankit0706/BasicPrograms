package com.sample.interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/**
 * Program to interface
 * Here I have kept the return type and the argument as interface
 * and not their concrete implementations. I only use the basic 
 * common functionality of Map and List. If the user class passes
 * a HashMap or TreeMap it makes no difference to this code.
 * Similarly the user class needs to use basic list functionality.
 * So I can return ArrayList or LinkedList from here. It will make
 * no difference to the user class.
 * So loose coupling.
 * @author AANU
 *
 */
public class Utility {
	public static List<String> getListFromMap(Map<Integer, String> australia){
		List<String> mList = new ArrayList<>();
		for(Map.Entry<Integer, String> entry: australia.entrySet()) {
			mList.add(entry.getValue());
		}
		return mList;
	}
}
