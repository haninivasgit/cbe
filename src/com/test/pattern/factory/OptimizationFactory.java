package com.test.pattern.factory;

public class OptimizationFactory {

	public static Optimization build(OptimizationType type) {
		Optimization Optimization = null;
		switch (type) {
		case CR:
			Optimization = new CROpitmization();
			break;

		case TERRITORY:
			Optimization = new TROptimization();
			break;

		case BATCH:
			Optimization = new BatchOptimization();
			break;

		default:
			// throw some exception
			break;
		}
		return Optimization;
	}
}
