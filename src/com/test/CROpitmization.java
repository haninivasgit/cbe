package com.test;

public class CROpitmization extends Optimization {

	public CROpitmization() {
		super( OptimizationType.CR, "s") ;
		//run() ;
	}
	
	

	@Override
    protected String run() {
        return "Calling CR Optimization";
    }
	@Override
	protected String run1() {
        return "Calling CR Optimizationrun1";
    }
}
