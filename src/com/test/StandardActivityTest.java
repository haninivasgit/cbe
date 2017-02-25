package com.test;

import java.util.Arrays;
import java.util.List;

public class StandardActivityTest {

	public static void main(String[] args) {

		List<StandardActivity> activities =  Arrays.asList(
				new StandardActivity("S", "10:10:10", "12:00:00"), 
				new StandardActivity("S", "08:00:00", "09:14:00") );
		
		String testStartTime = "10:30:00" ;
		String testEndTime = "11:45:00" ;
		
		/*String testStartTime = "10:30:00" ;
		String testEndTime = "11:45:00" ;*/
	}

}
