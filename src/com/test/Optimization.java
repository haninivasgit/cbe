package com.test;

public abstract class Optimization {

	public Optimization(OptimizationType type, String d) {
		this.type = type;
	}

	protected abstract String run();
	protected abstract String run1();

	private OptimizationType type = null;

	public OptimizationType getType() {
		return type;
	}

	public void setType(OptimizationType type) {
		this.type = type;
	}
}
