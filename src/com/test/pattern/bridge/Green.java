package com.test.pattern.bridge;

public class Green implements Color {

	String name;

	public Green(String name) {
		this.name = name;
	}

	public void applyColor() {
		System.out.println("green.");
	}

	public void build() {
		System.out.println(name + " build.");
	}
}
