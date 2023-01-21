package com.sample.concurrence;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {

		List<String> list = List.of("dog", "cat", "rat", "tiger");

		List<Integer> collect = list.stream().filter(Test::take).map(Test::map).collect(Collectors.toList());
		
		//.forEach(System.out::println);
		String str = "abc , def";
		String [] arr = str.split(",");
		List<String> val = Arrays.asList(arr);
//		val.forEach(s -> s.trim()).collect(Collectors.toList());
		
		
		String str1 = "I 	 am            ,           Dinesh   Kumar   ,  dwarka  ,           delhi,                 india";
					//"him   ani   ,                   sa rdana,           IHS  MARKIT , abc ,      ggg   gggg"
		
		List<String> list2 = Arrays.asList(str1.split(","));
		System.out.println(list2);
		
		List<String> list3 = list2.stream().map(String::trim).collect(Collectors.toList());
		System.out.println(list3);
		
		StringJoiner stringJoiner = new StringJoiner(",");
		
		list3.forEach( str4 -> stringJoiner.add(str4));
		String string = stringJoiner.toString();
		System.out.println(string);
		
		
		
	}

	public static boolean take(String str) {
		return true;
	}

	public static Integer map(String a) {
		return 10;
	}
}
