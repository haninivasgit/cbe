package com.test;

public class UserTest {

	public static void main(String[] args) {
		User user1 = new User.UserBuilder("Lokesh", "Gupta")
			    .age(30)
			    .phone("1234567")
			    .address("Fake address 1234")
			    .build();
		
		
		
		
			 
			   System.out.println( user1.getAddress());
	}
}
