package com.sample.ihsmarkit.stringcommaseparator;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

class StringCommaSeparator {

	private String COMMA = ",";

	public String spaceRemover(String str) {
		if (str == null) {
			System.out.println("Input is null, please send valid input");
			return null;

		}
		List<String> listOfString = (Arrays.asList(str.split(COMMA)));

		List<String> trimedList = listOfString.stream().map(String::trim).collect(Collectors.toList());

		StringJoiner stringJoiner = new StringJoiner(COMMA);
		trimedList.forEach(str4 -> stringJoiner.add(str4));
		String string = stringJoiner.toString();
		return string;
	}
}

public class Test {

	public static void main(String[] args) {

		StringCommaSeparator commaSeparator = new StringCommaSeparator();
		String outPut = commaSeparator.spaceRemover("abc  , def   ,    jkl   ,  apa");
		System.out.println(outPut);
	}
}
