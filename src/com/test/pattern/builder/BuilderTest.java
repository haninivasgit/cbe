package com.test.pattern.builder;

public class BuilderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println( new UserBuilder("TEST").age(12).phone("12121").address("address set").build());
	}

}
