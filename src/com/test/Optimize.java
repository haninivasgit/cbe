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

public class Optimize {

	public static void main(String[] args) {
		List<Adjuster> dest = new ArrayList<Adjuster>();

		// Adjuster srcAdjuster = new Adjuster("s1", "10", 21,55);
		//
		// dest.add(new Adjuster("d1", "3", 4,55));
		// dest.add(new Adjuster("d2", "0", 21,55));
		// dest.add(new Adjuster("d3", "7", 21,20));
		// dest.add(new Adjuster("d4", "0", 15,55));

		Adjuster srcAdjuster = new Adjuster("s1", "10", 21, 55);
		dest.add(new Adjuster("d1", "3", 4, 55));
		dest.add(new Adjuster("d5", "0", 4, 55));
		dest.add(new Adjuster("d2", "0", 21, 55));
		dest.add(new Adjuster("d3", "7", 21, 20));
		dest.add(new Adjuster("d4", "0", 15, 56));

		// Adjuster srcAdjuster = new Adjuster("s1", "0", 21,50);
		//
		// dest.add(new Adjuster("d1", "0", 21,45));
		// dest.add(new Adjuster("d2", "3", 21,20));
		// dest.add(new Adjuster("d3", "7", 21,20));
		// dest.add(new Adjuster("d4", "0", 15,49));

		// Adjuster srcAdjuster = new Adjuster("s1", "3", 21, 55);
		//
		// dest.add(new Adjuster("d1", "0", 4, 51));
		// dest.add(new Adjuster("d2", "3", 21, 15));
		// dest.add(new Adjuster("d3", "3", 21, 20));
		// dest.add(new Adjuster("d4", "0", 15, 51));

		Adjuster responseAdjuster = getBestAdjuster(srcAdjuster, dest).get(0);

		System.out.println(responseAdjuster);

		// validMove = ((sourceAdjuster.getTravelTime().intValue() >
		// responseAdjuster.getTravelTime().intValue() &&
		// Integer.parseInt(sourceAdjuster.getPoints()) >=
		// Integer.parseInt(responseAdjuster.getPoints()))
		// || ((sourceAdjuster.getTravelTime().intValue() ==
		// responseAdjuster.getTravelTime().intValue()) &&
		// Integer.parseInt(sourceAdjuster.getPoints()) >=
		// Integer.parseInt(responseAdjuster.getPoints()))
		// || ((sourceAdjuster.getTravelTime().intValue() ==
		// responseAdjuster.getTravelTime().intValue()) &&
		// (sourceAdjuster.getJobDuration() > responseAdjuster.getJobDuration())
		// && (Integer.parseInt(sourceAdjuster.getPoints()) ==
		// Integer.parseInt(responseAdjuster.getPoints())))) ? true : false;

		boolean validMove = tieBreakerCheck(srcAdjuster, responseAdjuster) ? true : false;
		System.out.println(validMove);
	}

	/**
	 * @param srcAdjuster
	 * @param responseAdjuster
	 * @return
	 * @throws NumberFormatException
	 */
	private static boolean tieBreakerCheck(Adjuster srcAdjuster, Adjuster responseAdjuster) throws NumberFormatException {
		return (srcAdjuster.getTravelTime().intValue() > responseAdjuster.getTravelTime().intValue() && Integer.parseInt(srcAdjuster.getPoints()) >= Integer.parseInt(responseAdjuster.getPoints()))
				|| ((srcAdjuster.getTravelTime().intValue() == responseAdjuster.getTravelTime().intValue())
						&& Integer.parseInt(srcAdjuster.getPoints()) > Integer.parseInt(responseAdjuster.getPoints()))
				|| ((srcAdjuster.getTravelTime().intValue() == responseAdjuster.getTravelTime().intValue())
						&& (Integer.parseInt(srcAdjuster.getPoints()) == Integer.parseInt(responseAdjuster.getPoints()) && (srcAdjuster.getJobduration() > responseAdjuster.getJobduration())));
	}

	private static List<Adjuster> getBestAdjuster(Adjuster srcAdjuster, List<Adjuster> tgtAdjusters) {

		// Adjuster adjuster = tgtAdjusters.stream().min((p1, p2) ->
		// Integer.compare(p1.getTravelTime(), p2.getTravelTime())).get();

		Stream<Adjuster> tgtAdjustersStream = Stream.of(new Adjuster("d6", "0", 4, 55), new Adjuster("d1", "3", 4, 55), new Adjuster("d5", "0", 4, 55), new Adjuster("d2", "0", 21, 55),
				new Adjuster("d3", "7", 21, 20), new Adjuster("d4", "0", 15, 56));

		// Map<Integer, List<Adjuster>> peopleByAge =
		// tgtAdjustersStream.collect(Collectors.groupingBy(p -> p.age,
		// Collectors.mapping((List<Adjuster> p) -> p, toList())));
		// System.out.println(peopleByAge);

		Map<Integer, List<Adjuster>> map1 = tgtAdjustersStream.collect(Collectors.groupingBy(Adjuster::getTravelTime));

		System.out.println(map1);

		List<Adjuster> betterCandidates = tgtAdjusters.stream().filter(u -> (Integer.parseInt(u.getPoints()) <= Integer.parseInt(srcAdjuster.getPoints()))).collect(Collectors.toList());

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
		}

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
}
