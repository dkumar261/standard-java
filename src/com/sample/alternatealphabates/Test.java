package com.sample.alternatealphabates;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Enter a number");
		int input = scanner.nextInt();
		for (int i = 97; i < input + 97; i += 2) {
			System.out.println((char) i);
		}
	}
}
