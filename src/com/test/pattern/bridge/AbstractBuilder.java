package com.test.pattern.bridge;

public abstract class AbstractBuilder {

	protected IBuild build ;
	
	public AbstractBuilder(IBuild build) {
		this.build = build ;
	}
	
	abstract public String build();
	
}
