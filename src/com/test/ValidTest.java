package com.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ValidTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Break> breaks = new ArrayList<Break>();

		breaks.add(new Break("1", "2", "3", "4", true));
		breaks.add(new Break("1", "2", "3", "4", true));
		breaks.add(new Break("1", "2", "3", "4", true));
		breaks.add(new Break("1", "2", "3", "4", false));

		List<Break> filterBreak = breaks.stream().filter(p -> !p.isConflict()).collect(Collectors.toList());
		System.out.println(filterBreak.size()>0);
	}

}
