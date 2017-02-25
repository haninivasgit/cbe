package com.test.pattern.factory;

public class TROptimization extends Optimization {

	public TROptimization() {
		super(OptimizationType.TERRITORY, "TerritoryOptimization");
	}

	@Override
	protected String run() {
		return getParam() ;
	}

}
