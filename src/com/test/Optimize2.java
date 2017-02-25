package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.commons.collections.CollectionUtils;

import com.test.Temp.Person;

public class Optimize2 {

	public static void main(String[] args) {
		List<Adjuster> dest = new ArrayList<Adjuster>();

		/*
		 * Adjuster srcAdjuster = new Adjuster("s1", "10", 21, 55); dest.add(new
		 * Adjuster("d1", "0", 4, 55)); dest.add(new Adjuster("d2", "0", 21,
		 * 55)); dest.add(new Adjuster("d3", "7", 21, 20)); dest.add(new
		 * Adjuster("d4", "0", 15, 56)); dest.add(new Adjuster("d5", "0", 4,
		 * 51));
		 */

		/*Adjuster srcAdjuster = new Adjuster("s1", "10", 21, 55);
		dest.add(new Adjuster("d1", "0", 21, 55));
		dest.add(new Adjuster("d2", "7", 21, 20));*/

		/*
		 * Adjuster srcAdjuster = new Adjuster("s1", "3", 21, 55); dest.add(new
		 * Adjuster("d1", "10", 4, 55)); dest.add(new Adjuster("d2", "0", 21,
		 * 55)); dest.add(new Adjuster("d3", "7", 21, 20)); dest.add(new
		 * Adjuster("d4", "0", 15, 55));
		 */
		
		/*Adjuster srcAdjuster = new Adjuster("s1", "3", 21, 55);
		dest.add(new Adjuster("d1", "10", 21, 55));
		dest.add(new Adjuster("d2", "10", 21, 20));*/
		
		
		/*Adjuster srcAdjuster = new Adjuster("s1", "10", 23, 60);
		dest.add(new Adjuster("d1", "0", 23, 60));
		dest.add(new Adjuster("d2", "0", 23, 40));
		dest.add(new Adjuster("d3", "7", 3, 40));*/
		
		/*Adjuster srcAdjuster = new Adjuster("s1", "3", 23, 60);
		dest.add(new Adjuster("d1", "10", 23, 60));
		dest.add(new Adjuster("d2", "10", 23, 40));*/
		
		/*Adjuster srcAdjuster = new Adjuster("s1", "10", 21, 55);
		dest.add(new Adjuster("d1", "10", 21, 55));
		dest.add(new Adjuster("d2", "10", 21, 15));
		dest.add(new Adjuster("d3", "10", 21, 20));
		dest.add(new Adjuster("d4", "3", 21, 120));*/
		
		
		
	/*	Adjuster srcAdjuster = new Adjuster("s1", "3", 21, 55);
		dest.add(new Adjuster("d1", "10", 21, 55));
		dest.add(new Adjuster("d2", "10", 21, 20));*/
		
		
		Adjuster srcAdjuster = new Adjuster("s1", "0", 18, 45);
		dest.add(new Adjuster("d1", "0", 18, 45));
		dest.add(new Adjuster("d2", "0", 18, 45));
		dest.add(new Adjuster("d3", "0", 18, 45));
		
		
	/*	Adjuster srcAdjuster = new Adjuster("s1", "0", 21, 55);
		dest.add(new Adjuster("d1", "0", 9, 55));
		dest.add(new Adjuster("d2", "3", 2, 15));
		dest.add(new Adjuster("d3", "3", 1, 20));
		dest.add(new Adjuster("d4", "3", 2, 51));*/
		
	/*	Adjuster srcAdjuster = new Adjuster("s1", "10", 21, 55);
		dest.add(new Adjuster("d1", "3", 9, 150));
		dest.add(new Adjuster("d2", "3", 21, 15));
		dest.add(new Adjuster("d3", "3", 21, 20));
		dest.add(new Adjuster("d4", "3", 21, 51));*/
		
		
	/*	Adjuster srcAdjuster = new Adjuster("s1", "3", 21, 55);
		dest.add(new Adjuster("d1", "3", 21, 150));
		dest.add(new Adjuster("d2", "3", 21, 55));
		dest.add(new Adjuster("d3", "3", 21, 55));
		dest.add(new Adjuster("d4", "3", 21, 55));
		dest.add(new Adjuster("d5", "3", 21, 55));
		dest.add(new Adjuster("d6", "3", 21, 55));
		dest.add(new Adjuster("d7", "3", 21, 54));
		dest.add(new Adjuster("d8", "3", 21, 55));*/
		

		//Adjuster responseAdjuster = getBestAdjuster(srcAdjuster, dest).get(0);
		
		 getBestAdjuster(srcAdjuster, dest) ;

		// System.out.println(responseAdjuster);

	}

	private static List<Adjuster> getBestAdjuster(Adjuster srcAdjuster, List<Adjuster> tgtAdjusters) {

		/*
		 * Stream<Adjuster> tgtAdjustersStream = Stream.of(
		 * 
		 * new Adjuster("d1", "3", 4, 55), new Adjuster("d2", "0", 21, 55), new
		 * Adjuster("d3", "7", 21, 20), new Adjuster("d4", "0", 15, 56), new
		 * Adjuster("d5", "0", 4, 55), new Adjuster("d6", "0", 4, 55));
		 */

		// Stream<Adjuster> tgtAdjustersStream = Stream.of(tgtAdjusters);

		Map<Integer, List<Adjuster>> grpByTravelTime = new TreeMap<Integer, List<Adjuster>>(tgtAdjusters.stream().collect(Collectors.groupingBy(Adjuster::getTravelTime)));

		// Map<Integer, List<Adjuster>> grpByTravelTimeSorted = new
		// TreeMap<Integer, List<Adjuster>>(grpByTravelTime);

		System.out.println(grpByTravelTime);
		// System.out.println( grpByTravelTime.size() );

		List<Adjuster> adjusters = grpByTravelTime.entrySet().iterator().next().getValue();
		if (!adjusters.isEmpty() && adjusters.size() > 1) {

			/*System.out.println( Points.VGood.getEnumValue() );
			System.out.println( Points.Good.getEnumValue() );
			System.out.println( Points.Average.getEnumValue() );
			System.out.println( Points.Poor.getEnumValue() );*/
			
			List<Adjuster> VGood = adjusters.stream().filter(u -> u.getPoints().equals(Points.VGood.getEnumValue())).collect(Collectors.toList());
			List<Adjuster> Good = adjusters.stream().filter(u -> u.getPoints().equals("3")).collect(Collectors.toList());
			List<Adjuster> Average = adjusters.stream().filter(u -> u.getPoints().equals("7")).collect(Collectors.toList());
			List<Adjuster> Poor = adjusters.stream().filter(u -> u.getPoints().equals("10")).collect(Collectors.toList());
			System.out.println("Multiple adjuster");

			if (!CollectionUtils.isEmpty(VGood)) {
				System.out.println(VGood);
				Collections.sort(VGood, (o1, o2) -> o1.getJobduration() - o2.getJobduration());
				System.out.println("Best Person is " + VGood.get(0));
				System.out.println( tieBreakerCheck(srcAdjuster, VGood.get(0)) ? "Valid Move" : "Don't move");
			} else if (!CollectionUtils.isEmpty(Good)) {
				System.out.println(Good);
				Collections.sort(Good, (o1, o2) -> o1.getJobduration() - o2.getJobduration());
				System.out.println("Best Person is " + Good.get(0));
				System.out.println( tieBreakerCheck(srcAdjuster, Good.get(0)) ? "Valid Move" : "Don't move");
			} else if (!CollectionUtils.isEmpty(Average)) {
				System.out.println(Average);
				Collections.sort(Average, (o1, o2) -> o1.getJobduration() - o2.getJobduration());
				System.out.println("Best Person is " + Average.get(0));
				System.out.println( tieBreakerCheck(srcAdjuster, Average.get(0)) ? "Valid Move" : "Don't move");
			} else if (!CollectionUtils.isEmpty(Poor)) {
				System.out.println(Poor);
				Collections.sort(Poor, (o1, o2) -> o1.getJobduration() - o2.getJobduration());
				System.out.println("Best Person is " + Poor.get(0));
				System.out.println( tieBreakerCheck(srcAdjuster, Poor.get(0)) ? "Valid Move" : "Don't move");
			}

		} else {
			System.out.println("Single adjuster");
			System.out.println(adjusters.get(0));
		}

		/*List<Adjuster> betterCandidates = tgtAdjusters.stream().filter(u -> (Integer.parseInt(u.getPoints()) <= Integer.parseInt(srcAdjuster.getPoints()))).collect(Collectors.toList());

		List<Adjuster> VGood = betterCandidates.stream().filter(u -> u.getPoints().equals("0")).collect(Collectors.toList());
		List<Adjuster> Good = betterCandidates.stream().filter(u -> u.getPoints().equals("3")).collect(Collectors.toList());
		List<Adjuster> Average = betterCandidates.stream().filter(u -> u.getPoints().equals("7")).collect(Collectors.toList());
		List<Adjuster> Poor = betterCandidates.stream().filter(u -> u.getPoints().equals("10")).collect(Collectors.toList());

		if (!CollectionUtils.isEmpty(VGood)) {
			return filterByPoints(VGood);
		} else if (!CollectionUtils.isEmpty(Good)) {
			return filterByPoints(Good);
		} else if (!CollectionUtils.isEmpty(Average)) {
			return filterByPoints(Average);
		} else if (!CollectionUtils.isEmpty(Poor)) {
			return filterByPoints(Poor);
		}*/

		return null;
	}

	private static List<Adjuster> filterByPoints(List<Adjuster> points) {
		Map<Integer, List<Adjuster>> pointsMap1 = points.stream().collect(Collectors.groupingBy(Adjuster::getTravelTime));
		Map<Integer, List<Adjuster>> pointsMap = new TreeMap<Integer, List<Adjuster>>(pointsMap1);
		if (!pointsMap.isEmpty()) {
			List<Adjuster> fnlSrcAdjusters = pointsMap.entrySet().iterator().next().getValue();
			if (!CollectionUtils.isEmpty(fnlSrcAdjusters)) {
				Collections.sort(fnlSrcAdjusters, (o1, o2) -> o1.getJobduration() - o2.getJobduration());
				return fnlSrcAdjusters;
			}
		}
		return null;
	}

	/**
	 * @param srcAdjuster
	 * @param responseAdjuster
	 * @return
	 * @throws NumberFormatException
	 */
	private static boolean tieBreakerCheck(Adjuster srcAdjuster, Adjuster responseAdjuster) throws NumberFormatException {
		if (srcAdjuster.getTravelTime().intValue() > responseAdjuster.getTravelTime() ) {
			return true ;
		}
		if ( Integer.parseInt(srcAdjuster.getPoints()) == Integer.parseInt(responseAdjuster.getPoints())) {
			return (srcAdjuster.getJobduration() > responseAdjuster.getJobduration());
		}
		return true ;
	}
}
