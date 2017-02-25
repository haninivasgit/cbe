package com.test.pattern.bridge;

public class Square extends Shape{

	public Square(Color c) {
		super(c);
	}

	@Override
	public void applyColor() {
		System.out.print("Square filled with color ");
		color.applyColor();
	} 
	
	@Override
	public void build() {
		System.out.print("Square filled with Build ");
		color.build();	
	} 

}