package com.test;

public class Adjuster {

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((jobduration == null) ? 0 : jobduration.hashCode());
		result = prime * result + ((points == null) ? 0 : points.hashCode());
		result = prime * result + ((travelTime == null) ? 0 : travelTime.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Adjuster other = (Adjuster) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (jobduration == null) {
			if (other.jobduration != null)
				return false;
		} else if (!jobduration.equals(other.jobduration))
			return false;
		if (points == null) {
			if (other.points != null)
				return false;
		} else if (!points.equals(other.points))
			return false;
		if (travelTime == null) {
			if (other.travelTime != null)
				return false;
		} else if (!travelTime.equals(other.travelTime))
			return false;
		return true;
	}

	Integer travelTime ;
	public Integer getTravelTime() {
		return travelTime;
	}

	public void setTravelTime(Integer travelTime) {
		this.travelTime = travelTime;
	}

	public String getPoints() {
		return points;
	}

	public void setPoints(String points) {
		this.points = points;
	}

	public Integer getJobduration() {
		return jobduration;
	}

	public void setJobduration(Integer jobduration) {
		this.jobduration = jobduration;
	}

	String  points ;
	Integer jobduration ;
	String id;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Adjuster(String id, String points, Integer travelTime, Integer jobduration) {
		this.id = id ;
		this.travelTime = travelTime ;
		this.points = points ;
		this.jobduration = jobduration ;
	}

	@Override
	public String toString() {
		return "Adjuster "+ id + "[travelTime=" + travelTime + ", points=" + points + ", jobduration=" + jobduration + "]";
	}
}
