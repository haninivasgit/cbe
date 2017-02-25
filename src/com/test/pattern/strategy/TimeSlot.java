package com.test.pattern.strategy;

import java.io.Serializable;

public class TimeSlot implements Serializable {

	private static final long serialVersionUID = 1L;

	private String slotStartTime;

	private String slotEndTime;

	public TimeSlot(String _start, String _end) {
		// TODO Auto-generated constructor stub
		this.slotStartTime = _start;
		this.slotEndTime = _end;
	}

	public String getSlotStartTime() {
		return slotStartTime;
	}

	public void setSlotStartTime(String slotStartTime) {
		this.slotStartTime = slotStartTime;
	}

	public String getSlotEndTime() {
		return slotEndTime;
	}

	public void setSlotEndTime(String slotEndTime) {
		this.slotEndTime = slotEndTime;
	}

	@Override
	public String toString() {
		return "TimeSlot [slotStartTime=" + slotStartTime + ", slotEndTime=" + slotEndTime + "]";
	}
	
	

}