package com.test.pattern.bridge;

public class Builder extends AbstractBuilder {

	public Builder(IBuild build) {
		super(build);
	}

	@Override
	public String build() {
		return build.build(); 
	}

}
