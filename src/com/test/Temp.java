package com.test;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Temp {

	static class Person {

		private String name;

		/**
		 * @return the name
		 */
		public String getName() {
			return name;
		}

		/**
		 * @param name
		 *            the name to set
		 */
		public void setName(String name) {
			this.name = name;
		}

		/**
		 * @return the age
		 */
		public int getAge() {
			return age;
		}

		/**
		 * @param age
		 *            the age to set
		 */
		public void setAge(int age) {
			this.age = age;
		}

		/**
		 * @return the salary
		 */
		public long getSalary() {
			return salary;
		}

		/**
		 * @param salary
		 *            the salary to set
		 */
		public void setSalary(long salary) {
			this.salary = salary;
		}

		private int age;
		private long salary;

		Person(String name, int age, long salary) {

			this.name = name;
			this.age = age;
			this.salary = salary;
		}

		@Override
		public String toString() {
			return String.format("Person{name='%s', age=%d, salary=%d}", name, age, salary);
		}
	}

	public static void main(String[] args) {
		Stream<Person> people = Stream.of(new Person("Paul", 24, 20000), new Person("Mark", 30, 30000), new Person("Will", 28, 28000), new Person("William", 28, 28000));
		Map<Integer, List<Person>> peopleByAge;
		// peopleByAge = people.collect(Collectors.groupingBy(p -> p.age,
		// Collectors.groupingBy(Person::age)));
		// System.out.println(peopleByAge);

		//Map<String, Map<Integer, List<Person>>> map = people.collect(Collectors.groupingBy(Person::getName, Collectors.groupingBy(Person::getAge)));

		Map<Integer, List<Person>> map1 = people.collect(Collectors.groupingBy(Person::getAge));
		
		System.out.println( map1.get(28));
	}
}
