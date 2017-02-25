package com.test;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.joda.time.Days;
import org.joda.time.DurationFieldType;
import org.joda.time.LocalDate;

public class DateInBtw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> dates = new ArrayList<String>();
		String startDate = "2016-08-10";
		String endDate = "2016-09-08";

		Integer days = Days.daysBetween(LocalDate.parse(startDate), LocalDate.parse(endDate)).getDays();
		for (int idx = 0; idx <= days; idx++) {
			dates.add( LocalDate.parse(startDate).withFieldAdded(DurationFieldType.days(), idx).toString() );
		}
		
		if ( dates.isEmpty())
			dates.add(LocalDate.parse(endDate).toString());
		
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(dates.contains(formatter.format(Calendar.getInstance().getTime()))) ;
		System.out.println(dates);
	}

}
