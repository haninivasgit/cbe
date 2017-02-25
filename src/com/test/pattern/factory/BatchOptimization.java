package com.test.pattern.factory;

public class BatchOptimization extends Optimization {

	public BatchOptimization() {
		super(OptimizationType.BATCH, "BATCH");
	}

	@Override
	protected String run() {
		return getParam() ;
	}

}
