package com.test.pattern.factory;

public class TestFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(OptimizationFactory.build(OptimizationType.CR).run());
		System.out.println(OptimizationFactory.build(OptimizationType.TERRITORY).run());
		System.out.println(OptimizationFactory.build(OptimizationType.BATCH).run());

	
	}

}
