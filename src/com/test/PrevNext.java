package com.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class PrevNext {
	
	static List<Person> myList = new ArrayList<Person>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		myList.add(new Person(12, "23", 23));
		myList.add(new Person(24, "21", 21));
		myList.add(new Person(12, "21", 21));
		myList.add(new Person(10, "21", 21));
		myList.add(new Person(34, "23", 23));
		myList.add(new Person(12, "23", 23));
		
		myList.add(new Person(3, "31", 31));
		
		
//		Stream<Integer> infiniteStream = Stream.iterate(0, x -> x + 1);
//
//	    PeelingStream<Integer> peelingInfiniteStream = new PeelingStream<>(infiniteStream);
//
//	    Integer one = peelingInfiniteStream.getNext();
//
//	    Integer two = peelingInfiniteStream.getNext();
//
//	    Stream<Integer> limitedStream = peelingInfiniteStream.limit(3); // 2 3 4
//	    int sumOf234 = limitedStream.mapToInt(x -> x.intValue()).sum();
	    
	    System.out.println( "Prev Element " + getPrevious(myList.get(2)));
	    System.out.println( "Curr Element " + myList.get(2) );		
		System.out.println( "Next Element " + getNext(myList.get(2)));
		
		for (Object obj: myList ) {
				System.out.println("****************");
			 	System.out.println( "Prev Element " + getPrevious(obj));
			    System.out.println( "Curr Element " + obj );	
			    
			    Person nxtPerson = getNext(obj) ;
				
				if (nxtPerson != null ) {
					System.out.println( "Next Element " + nxtPerson);
					nxtPerson.setAge(100);
				}
		}
		

	}

	public static Person getNext(Object uid) {
		int idx = myList.indexOf(uid);
		if (idx < 0 || idx + 1 == myList.size())
			return null;
		return myList.get(idx + 1);
	}

	public static Person getPrevious(Object uid) {
		int idx = myList.indexOf(uid);
		if (idx <= 0)
			return null;
		return myList.get(idx - 1);
	}

}
