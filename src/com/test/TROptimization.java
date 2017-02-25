package com.test;

public class TROptimization  extends Optimization {
	
	public TROptimization() {
		super(OptimizationType.TERRITORY, "ddd") ;
		run() ;
	}

	@Override
    protected String run() {
        return " Calling Territory Optimization";
    }

	@Override
	protected String run1() {
		// TODO Auto-generated method stub
		return null;
	}
}
