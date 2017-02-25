package com.test.pattern.bridge;

public class Red implements Color{
	
	
	String name ;
	public Red(String name) {
		// TODO Auto-generated constructor stub
		this.name = name ;
	}

	public void applyColor(){
		System.out.println("red.");
	}
	
	public void build() {
		System.out.println( name + " build." );
	}
}