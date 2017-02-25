package com.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class Sort {

	public static class Person {
		public String name;
		public int id;
		public int points;
		public Date hireDate;

		public Person(String iname, int iid, Date ihireDate) {
			name = iname;
			id = iid;
			hireDate = ihireDate;
		}

		public Person(String iname, int iid, Date ihireDate, int pt) {
			name = iname;
			id = iid;
			hireDate = ihireDate;
			points = pt;
		}

		public String toString() {
			return name + " " + id + " " + hireDate.toString();
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public int getPoints() {
			return points;
		}

		public void setPoints(int points) {
			this.points = points;
		}

		/*
		 * // Comparator public static class CompId implements
		 * Comparator<Person> {
		 * 
		 * @Override public int compare(Person arg0, Person arg1) { return
		 * arg0.id - arg1.id; } }
		 * 
		 * public static class CompDate implements Comparator<Person> { private
		 * int mod = 1; public CompDate(boolean desc) { if (desc) mod =-1; }
		 * 
		 * @Override public int compare(Person arg0, Person arg1) { return
		 * mod*arg0.hireDate.compareTo(arg1.hireDate); } }
		 */
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleDateFormat df = new SimpleDateFormat("mm-dd-yyyy");
		ArrayList<Person> people;
		people = new ArrayList<Person>();
		try {
			people.add(new Person("Poor", 12, df.parse("12-12-2010"), 10));
			people.add(new Person("Poor", 11, df.parse("1-12-2010"), 10));
			people.add(new Person("VGood", 87, df.parse("12-12-2010"), 0));
			people.add(new Person("VGood", 65, df.parse("1-12-2010"), 0));
			people.add(new Person("Good", 43, df.parse("12-2-2010"), 3));
			people.add(new Person("VGood", 187, df.parse("12-12-2010"), 0));
			people.add(new Person("Average", 65, df.parse("1-12-2010"), 7));
			people.add(new Person("Good", 12, df.parse("12-2-2010"), 3));
			people.add(new Person("Nogo", 12, df.parse("12-12-2010"), 11));
			people.add(new Person("Nogo", 11, df.parse("1-12-2010"), 11));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Collections.sort(people, new Person.CompId());

		Collections.sort(people, (o1, o2) -> o1.getPoints() - o2.getPoints());

		System.out.println("BY POINTS");
		for (Person p : people) {
			System.out.println(p.toString());
		}

		Person result = people.stream().filter(u -> u.points == 0).findAny().orElse(null);

		List<Person> VGood = people.stream().filter(u -> u.points == 0).collect(Collectors.toList());
		Collections.sort(VGood, (o3, o4) -> o3.getId() - o4.getId());
		System.out.println("BY ID");
		for (Person p : VGood) {
			System.out.println(p.toString());
		}

		List<Person> Good = people.stream().filter(u -> u.points == 3).collect(Collectors.toList());
		//people.stream().filter(u -> u.points == 3).collect(Collectors.toList()).sort( (Person o1, Person o2)->o1.getId()-o2.getId());
		//System.out.println(people.get(0)) ;
		Collections.sort(Good, (o3, o4) -> o3.getId() - o4.getId());
		System.out.println("BY ID" + Good.stream().findFirst().get());
		//Good.stream().findFirst();

		/*
		 * Collections.sort(people, new Person.CompDate(false));
		 * System.out.println("BY Date asc"); for (Person p : people) {
		 * System.out.println(p.toString()); } Collections.sort(people, new
		 * Person.CompDate(true)); System.out.println("BY Date desc"); for
		 * (Person p : people) { System.out.println(p.toString()); }
		 */

	}

}