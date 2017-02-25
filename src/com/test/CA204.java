package com.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.joda.time.DateTime;
import org.joda.time.Interval;

public class CA204 {

	public static void main(String[] args) {

		SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss"); 
		try {
			
			String arrWinStartTime = "09:00:00" ;
			String arrWinEndTime = "11:00:00" ;

			/*Calendar cal = Calendar.getInstance();
			cal.setTime(format.parse(arrWinStartTime)); 
			cal.add(Calendar.HOUR, 1);
			String oneHrWindow = new SimpleDateFormat("HH:mm:ss").format(cal.getTime()); */
			
			
			/*Calendar cal1 = Calendar.getInstance();
			cal1.setTime(format.parse(arrWinStartTime)); 
			cal1.add(Calendar.MINUTE, 12);
			String expectedArrivalTime = new SimpleDateFormat("HH:mm:ss").format(cal1.getTime());*/
			
			DateTime oneHrWindow = new DateTime(format.parse(arrWinStartTime)).plusHours(1); 			
			DateTime expectedArrivalTime = new DateTime(format.parse(arrWinStartTime)).plusMinutes(61) ;
			
			

			DateTime start = new DateTime(format.parse(arrWinStartTime)); 
			//DateTime end = new DateTime(format.parse(oneHrWindow)); 
			Interval arrivalWindow = new Interval(start, oneHrWindow);


		//	System.out.println( arrivalWindow.contains(new DateTime(format.parse(expectedArrivalTime))) || arrivalWindow.getEnd().equals(new DateTime(format.parse(expectedArrivalTime))));
			
			System.out.println( arrivalWindow.contains(expectedArrivalTime) || arrivalWindow.getEnd().equals(expectedArrivalTime));

		} catch (ParseException e) {
			// TODO: handle exception
		}
	}
}
