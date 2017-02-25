package com.test;

public class Break {
	private String start;
	private String end;
	private String brkStart;
	private String brkEnd;

	private boolean conflict;
	
	public Break(String start, String end, String brkStart, String brkend, boolean valid){
		
		// TODO Auto-generated constructor stub
		this.start = start ;
		this.end = end ;
		this.brkStart = brkStart ;
		this.brkEnd = brkend;
		this.conflict = valid ;
	}

	public boolean isConflict() {
		return conflict;
	}

	public void setConflict(boolean conflict) {
		this.conflict = conflict;
	}

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public String getEnd() {
		return end;
	}

	public void setEnd(String end) {
		this.end = end;
	}

	public String getBrkStart() {
		return brkStart;
	}

	public void setBrkStart(String brkStart) {
		this.brkStart = brkStart;
	}

	public String getBrkEnd() {
		return brkEnd;
	}

	public void setBrkEnd(String brkEnd) {
		this.brkEnd = brkEnd;
	}

	@Override
	public String toString() {
		return "Break [start=" + start + ", end=" + end + ", brkStart=" + brkStart + ", brkEnd=" + brkEnd + ", Conflict=" + conflict + "]";
	}

}
