package com.test.pattern.bridge;

public class Triangle extends Shape{
	
	public Triangle(Color c) {
		super(c);
	}

	@Override
	public void applyColor() {
		System.out.print("Triangle filled with color ");
		color.applyColor();
	}

	@Override
	public void build() {
		System.out.print("Triangle filled with Build ");
		color.build();	
	} 

}