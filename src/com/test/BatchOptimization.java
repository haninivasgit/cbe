package com.test;

public class BatchOptimization extends Optimization{
	
	public BatchOptimization() {
		super(OptimizationType.BATCH, "BATCJ") ;
		run() ;
	}
	
	@Override
    protected String run() {
        return "Calling Batch Optimization" ;
    }

	@Override
	protected String run1() {
		// TODO Auto-generated method stub
		return null;
	}

}
