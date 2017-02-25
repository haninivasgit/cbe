package com.test.pattern.factory;

public class CROpitmization extends Optimization {

	public CROpitmization() {
		super( OptimizationType.CR, "CROpitmizationRun") ;
	}
	

	@Override
    protected String run() {
        return getParam() ;
    }
	
}
