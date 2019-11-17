package _02_More_Algorithms;

import java.util.ArrayList;
import java.util.List;

import _00_Sorting_Algorithms.SortingVisualizer;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		int crackedEggs = 0;
		for (int i = 0; i < eggs.size(); i++) {
			if(eggs.get(i).equalsIgnoreCase("cracked")) {
				crackedEggs += 1;
			}
		}
		return(crackedEggs);
	}

	public static int countPearls(List<Boolean> oysters) {
		int perls = 0;
		for (int i = 0; i < oysters.size(); i++) {
			if(oysters.get(i).equals(true)) {
				perls += 1;
			}
		}
		return perls;
	}

	public static double findTallest(List<Double> peeps) {
		double largest = 0;
		for (int i = 0; i < peeps.size(); i++) {
			if(peeps.get(i) > largest) {
				largest = peeps.get(i);
			}
		}
		return largest;
	}

	public static String findLongestWord(List<String> words) {
		String longest = "x";
		for (int i = 0; i < words.size(); i++) {
			if(words.get(i).length() > longest.length()) {
				longest = words.get(i);
			}
		}
		return longest;
	}

	public static boolean containsSOS(List<String> message) {
			String SOS = "... --- ...";
			for (int i = 0; i < message.size(); i++) {
				if (SOS.equals(message.get(i))) {
					return true;
				}
			}
			return false;
		}

	
	public static List<Double> sortScores(List<Double> results) {
			boolean sorted = false;
			while (sorted == false) {
				sorted = true;
				for (int i = 0; i < results.size(); i++) {
					if (i + 1 < results.size()) {
						if (results.get(i) > results.get(i + 1)){
							double firstSwapInt = results.get(i);
							double secoundSwapInt = results.get(i + 1);
							System.out.println(results);
							results.remove(i+1);
							System.out.println(results);
							results.add(i + 1, firstSwapInt);
							System.out.println(results);
							results.remove(i);
							System.out.println(results);
							results.add(i, secoundSwapInt);
							System.out.println(results);
							sorted = false;
						}
					}
				}
			}
			return results;
			
		
	}
	
}













