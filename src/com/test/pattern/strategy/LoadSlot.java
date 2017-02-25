package com.test.pattern.strategy;

import java.util.List;

public class LoadSlot {

	private IStrategySlot iStrategySlot;

	public IStrategySlot setLoadStrategy(Integer timeInterval) {
		if ( timeInterval ==2 )
			this.iStrategySlot = new TwoHrsSlot()  ;
		if ( timeInterval ==4 )
			this.iStrategySlot = new FourHrsSlot()  ;
		
		return this.iStrategySlot ;
	}
	
	/*public List<TimeSlot> load(boolean dlyStartDate) {
		return iStrategySlot.load(dlyStartDate) ;
	}*/

}
