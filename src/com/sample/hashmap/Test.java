package com.sample.hashmap;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Test {

	public static void main(String[] args) {

		HashMap<String, Integer> hm = new HashMap<String, Integer>();

		// enter data into hashmap
		hm.put("Math", 98);
		hm.put("Data Structure", 85);
		hm.put("Database", 91);
		hm.put("Java", 95);
		hm.put("Operating System", 79);
		hm.put("Networking", 80);
		Map<String, Integer> hm1 = sortByValue(hm);
	}

	private static Map<String, Integer> sortByValue(HashMap<String, Integer> hm) {
		// TODO Auto-generated method stub

		List<Map.Entry<String, Integer>> list = new LinkedList<>(hm.entrySet());
		
		System.out.println(list);
		Collections.sort(list, new Comparator<Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				// TODO Auto-generated method stub
				return o1.getValue().compareTo(o2.getValue());
			}

			
		});
		
		
		System.out.println(list);
		System.out.println(hm);
		return null;
	}
}
