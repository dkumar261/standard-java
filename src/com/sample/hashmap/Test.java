package com.sample.hashmap;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Test {
	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("Math", 98);
		hm.put("Data Structure", 85);
		hm.put("Database", 91);
		hm.put("Java", 95);
		hm.put("Operating System", 79);
		hm.put("Networking", 80);
		System.out.println("Original Map : " + hm);
		Map<String, Integer> hm1 = sortByValueByStream(hm);
		System.out.println(hm1);
	}

	private static Map<String, Integer> sortByValueByOldWay(HashMap<String, Integer> hm) {
		List<Map.Entry<String, Integer>> list = new LinkedList<>(hm.entrySet());
		System.out.println(list);
		Collections.sort(list, new Comparator<Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				return o1.getValue().compareTo(o2.getValue());
			}
		});
		Map<String, Integer> tempMain = new LinkedHashMap<>();
		for (Entry<String, Integer> entry : list) {
			tempMain.put(entry.getKey(), entry.getValue());
		}
		return tempMain;
	}

	private static Map<String, Integer> sortByValueByLambda(HashMap<String, Integer> hm) {
		System.out.println("Sorting Map by value : ");
		List<Map.Entry<String, Integer>> list = new LinkedList<>(hm.entrySet());
		Collections.sort(list, (Entry<String, Integer> o1, Entry<String, Integer> o2) -> {
			return o1.getValue().compareTo(o2.getValue());
		});
		Map<String, Integer> tempMain = new LinkedHashMap<>();
		for (Entry<String, Integer> entry : list) {
			tempMain.put(entry.getKey(), entry.getValue());
		}
		return tempMain;
	}

	private static Map<String, Integer> sortByValueByStream(HashMap<String, Integer> hm) {
		System.out.println("Sorting Map by value : ");

		Map<String, Integer> tempMain = hm.entrySet().stream().sorted((v1, v2) -> v1.getValue().compareTo(v2.getValue()))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(k , v) -> k,LinkedHashMap::new));

		return tempMain;
	}
}
