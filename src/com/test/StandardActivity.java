package com.test;

import java.io.Serializable;	

/**
 * @author 208416 Custom availability object to keep meeting/holiday/training
 *         details.
 */
public class StandardActivity implements Serializable {

	private static final long serialVersionUID = 1L;

	private String unavailableType;
	private String starttime;
	private String endtime;
	
	public StandardActivity(String type, String startTime, String endTime) {
		
		this.unavailableType = type ;
		this.starttime = startTime ;
		this.endtime = endTime ;
	}

	public String getUnavailableType() {
		return unavailableType;
	}

	public void setUnavailableType(String unavailableType) {
		this.unavailableType = unavailableType;
	}

	public String getStartTime() {
		return starttime;
	}

	public void setStartTime(String startTime) {
		this.starttime = startTime;
	}

	public String getEndTime() {
		return endtime;
	}

	public void setEndTime(String endTime) {
		this.endtime = endTime;
	}

	@Override
	public String toString() {
		return "StandardActivity [unavailableType=" + unavailableType + ", starttime=" + starttime + ", endtime=" + endtime + "]";
	}


	
	
}
