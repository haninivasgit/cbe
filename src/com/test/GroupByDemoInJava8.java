package com.test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;


public class GroupByDemoInJava8 {

	public static void main(String[] args) {
		List<Person> people = new ArrayList<>();
		people.add(new Person(12, "23", 23));
		people.add(new Person(24, "21", 21));
		people.add(new Person(12, "21", 21));
		people.add(new Person(10, "21", 21));
		people.add(new Person(34, "23", 23));
		people.add(new Person(12, "23", 23));
		
		people.add(new Person(3, "31", 31));

		
		Map<Integer, List<Person>> personByAge = people.stream().collect(Collectors.groupingBy(Person::getAge));
		System.out.println("Person grouped by age in Java 8: " + personByAge);
		
		List <Person> list = personByAge.entrySet().iterator().next().getValue();
		Collections.sort(list, (o1, o2) -> o1.getJobtime() - o2.getJobtime());
		System.out.println( list.get(0));
		
		
		List<Person> betterCandidates = people.stream().filter(u -> Integer.getInteger(u.getCity()) >= 31).collect(Collectors.toList());
		System.out.println("Person grouped by age in Java 8: " + betterCandidates);
	}
}
