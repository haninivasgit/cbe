package com.test.pattern.builder;

public class UserBuilder implements Builder<User>{
	
	private User user ;
	
	public UserBuilder(String firstName) {
		this.user = new User(firstName) ;
	}	
	
	public UserBuilder lastName(String lastName) {
		this.user.setLastName(lastName);
		return this ;
	}
	
	public UserBuilder age(int age) {
		this.user.setAge(age);
		return this ;
	}
	
	public UserBuilder phone(String phone) {
		this.user.setPhone(phone);
		return this ;
	}
	
	public UserBuilder address(String address) {
		this.user.setAddress(address);
		return this ;
	}

	@Override
	public User build() {
		return this.user ;
	}

}
