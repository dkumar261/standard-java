package com.sample.functional.interaces;

import java.util.function.BiPredicate;

public class BiPredicateSample {

	public static void main(String[] args) {
		
		BiPredicate<String, Integer> predicate = (name, age) -> name.equals("Dinesh") && age == 10;
		boolean isNameCorrect = predicate.test("Dinesh", 10);
		boolean isNameCorrect2 = predicate.test("DineshKr", 20);
		System.out.println(isNameCorrect);
		System.out.println(isNameCorrect2);
	}
}
