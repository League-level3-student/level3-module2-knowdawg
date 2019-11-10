package _02_More_Algorithms;

import java.util.List;

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

	public static Object containsSOS(List<String> message) {
		String SOS = "...---...";
		int counter = 0;
		for (int i = 0; i < message.size(); i++) {
			if(SOS.charAt(counter) == message.get(1).charAt(i)) {
				counter += 1;
				if(counter == 9) {
					System.out.println("YEET");
					return true;
				}
			} else {
				counter = 0;
			}
		}
		return false;
	}
}













