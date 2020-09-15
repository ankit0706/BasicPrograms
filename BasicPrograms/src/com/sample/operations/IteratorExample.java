package com.sample.operations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
/**
 * remove operation on iterator removes the element from collection too
 * Also, we can not use iterator's remove method on a list returned by
 * Arrays.asList. So here we created another List using addAll method.
 * @author AANU
 *
 */
public class IteratorExample {
	public static void main(String[] args) {
		List<String> items = Arrays.asList("Tea", "Coffee", "Rice", "Lentils", "Milk Powder", "Flour", "Salt", "Sugar",
				"Onion", "Potato", "Corn", "Eggs");
		System.out.println(items);
		ArrayList<String> itemList = new ArrayList<>();
		itemList.addAll(items);
		//remove item from list
		Iterator<String> iterator = itemList.iterator();
		while(iterator.hasNext()) {
			String item = iterator.next();
			if("Eggs".equalsIgnoreCase(item)) {
				iterator.remove();
			}
		}//while
		
		System.out.println(itemList);
		//new method added in java 8
		ArrayList<String> itemList2 = new ArrayList<>();
		Iterator<String> iterator2 = itemList.iterator();
		itemList2.addAll(items);
		iterator2.forEachRemaining(item -> {
			System.out.println(item.toUpperCase());
		});
		
	}
}
