package com.test.pattern.factory;

public abstract class Optimization {

	public Optimization(OptimizationType type, String param) {
		this.type = type;
		this.param = param;
	}

	protected abstract String run();

	private OptimizationType type = null;
	private String param;

	public OptimizationType getType() {
		return type;
	}

	public void setType(OptimizationType type) {
		this.type = type;
	}

	/**
	 * @return the param
	 */
	public String getParam() {
		return param;
	}

	/**
	 * @param param
	 *            the param to set
	 */
	public void setParam(String param) {
		this.param = param;
	}
}
