package com.sample.lab49;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Athlete {

	public int height;
	public String profession;
	public String name;

	public Athlete(String name, int height, String profession) {
		this.name = name;
		this.height = height;
		this.profession = profession;
	}

	public String getName() {
		return this.name;
	}
}

public class Test {

	public static void main(String args[]) throws Exception {

		System.out.println(printAll(ATHLETES));
	}

	// it is the norm for tall athletes to be basketball players
	public static boolean rare(Athlete a) {
		if (a.height > 180) {
			if (!a.profession.equals("basketball")) {
				return true;
			}
		}
		if (a.height < 180) {
			if (a.profession.equals("basketball")) {
				return true;
			}
		}
		return false;

	}

	public static List<String> printAll(List<Athlete> all) {
		if (all == null)
			throw new NullPointerException();
		else if (all.size() < 1)
			return new ArrayList<>();
		else {
			all.stream().filter(name -> rare(name)).collect(Collectors.toList());

			List<String> collect = all.stream().filter(athlete -> rare(athlete)).map(Athlete::getName)
					.collect(Collectors.toList());
			return collect;
		}
	}

	// To load the data
	private final static List<Athlete> ATHLETES = new ArrayList<>();
	static {
		ATHLETES.add(new Athlete("Bob", 190, "basketball"));
		ATHLETES.add(new Athlete("Alex", 170, "soccer"));
		ATHLETES.add(new Athlete("Frank", 130, "basketball"));
		ATHLETES.add(new Athlete("Scotty", 175, "basketball"));
		ATHLETES.add(new Athlete("A", 190, "chess"));
		ATHLETES.add(new Athlete("B", 190, "chess"));
		ATHLETES.add(new Athlete("C", 190, "chess"));
		ATHLETES.add(new Athlete("D", 190, "chess"));
		ATHLETES.add(new Athlete("E", 190, "chess"));
		ATHLETES.add(new Athlete("F", 190, "chess"));
	}
}