package com.test;

import java.util.StringJoiner;

public class Joiner {

	public static void main(String[] args) {
		for (int idx = 0; idx < 10; idx++) {

			StringJoiner joiner = new StringJoiner(",");
			joiner.add(Integer.toString(idx));
			int next = ++idx;
			if (next < 10) {
				joiner.add(Integer.toString(idx));
			}
			
			System.out.println( joiner.toString());
		}
	}
}
