package com.test.pattern.bridge;

public class TwoHours implements IBuild {

	String firstName;
	String lastName;

	public TwoHours(String firstName, String lastName) {
		setFirstName(firstName);
		setLastName(lastName);
	}

	@Override
	public String build() {
		return getFirstName() + "  " + getLastName() ;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
