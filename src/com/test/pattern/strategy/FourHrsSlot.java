package com.test.pattern.strategy;

import java.util.ArrayList;
import java.util.List;

public class FourHrsSlot implements IStrategySlot {

	@Override
	public List<TimeSlot> load(boolean dlyStartDate) {
		List<TimeSlot> availableTimeSlots = new ArrayList<TimeSlot>();

		if (!dlyStartDate) {
			availableTimeSlots.add(new TimeSlot("08:00:00", "12:00:00"));
			availableTimeSlots.add(new TimeSlot("09:00:00", "13:00:00"));
		}
		availableTimeSlots.add(new TimeSlot("10:00:00", "14:00:00"));
		availableTimeSlots.add(new TimeSlot("11:00:00", "15:00:00"));
		availableTimeSlots.add(new TimeSlot("12:00:00", "16:00:00"));
		availableTimeSlots.add(new TimeSlot("13:00:00", "17:00:00"));
		availableTimeSlots.add(new TimeSlot("14:00:00", "18:00:00"));
		availableTimeSlots.add(new TimeSlot("15:00:00", "19:00:00"));
		availableTimeSlots.add(new TimeSlot("16:00:00", "20:00:00"));

		return availableTimeSlots;
	}

}
