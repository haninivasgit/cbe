package com.test.pattern.strategy;

import java.util.List;


public interface IStrategySlot {

	public List<TimeSlot> load(boolean dlyStartDate) ;
}
