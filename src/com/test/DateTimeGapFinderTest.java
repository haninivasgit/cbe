package com.test;


import java.util.ArrayList;
import java.util.List;

import org.joda.time.DateTime;
import org.joda.time.Interval;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class DateTimeGapFinderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateTimeFormatter dateTimeFormatter = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss");
		List<Interval> existingIntervals;
		existingIntervals = new ArrayList<Interval>();
		
		existingIntervals.add(new Interval(DateTime.parse("2016-06-13 08:00:00", dateTimeFormatter), DateTime.parse("2016-06-13 10:00:00", dateTimeFormatter)));
		existingIntervals.add(new Interval(DateTime.parse("2016-06-13 10:35:00", dateTimeFormatter), DateTime.parse("2016-06-13 11:35:00", dateTimeFormatter)));
		existingIntervals.add(new Interval(DateTime.parse("2016-06-13 12:00:00", dateTimeFormatter), DateTime.parse("2016-06-13 14:00:00", dateTimeFormatter)));
		existingIntervals.add(new Interval(DateTime.parse("2016-06-13 15:00:00", dateTimeFormatter), DateTime.parse("2016-06-13 19:05:00", dateTimeFormatter)));
		
		DateTimeGapFinder dateTimeGapFinder = new DateTimeGapFinder();
		// the search interval overshadows the extremities of existing intervals
		Interval bigSearch = new Interval(DateTime.parse("2016-06-13 10:00:00", dateTimeFormatter), DateTime.parse("2016-06-13 12:00:00", dateTimeFormatter));
		
		List<Interval> bigSearchResults = dateTimeGapFinder.findGaps(existingIntervals, bigSearch);
		
		System.out.println(bigSearchResults);
		
	}

}
