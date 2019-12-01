package _02_More_Algorithms;

import java.util.ArrayList;
import java.util.List;

import _00_Sorting_Algorithms.SortingVisualizer;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		int crackedEggs = 0;
		for (int i = 0; i < eggs.size(); i++) {
			if (eggs.get(i).equalsIgnoreCase("cracked")) {
				crackedEggs += 1;
			}
		}
		return (crackedEggs);
	}

	public static int countPearls(List<Boolean> oysters) {
		int perls = 0;
		for (int i = 0; i < oysters.size(); i++) {
			if (oysters.get(i).equals(true)) {
				perls += 1;
			}
		}
		return perls;
	}

	public static double findTallest(List<Double> peeps) {
		double largest = 0;
		for (int i = 0; i < peeps.size(); i++) {
			if (peeps.get(i) > largest) {
				largest = peeps.get(i);
			}
		}
		return largest;
	}

	public static String findLongestWord(List<String> words) {
		String longest = "x";
		for (int i = 0; i < words.size(); i++) {
			if (words.get(i).length() > longest.length()) {
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
		List<Double> sorted = new ArrayList();
		for (int i = 0; i < results.size(); i++) {
			if (sorted.size() == 0) {
				sorted.add(results.get(i));
			} else {
				int RP = sorted.size();

				for (int j = 0; j < RP; j++) {
					if (results.get(i) < sorted.get(j)) {
						sorted.add(j, results.get(i));
						j = RP;
					} else if (j == RP - 1) {
						sorted.add(j + 1, results.get(i));
					}
				}

			}
		}
		results = sorted;
		return results;

	}

	public static List<String> sortDNA(List<String> unsortedSequences) {
		List<String> sorted = new ArrayList();

		for (int i = 0; i < unsortedSequences.size(); i++) {
			if (sorted.size() == 0) {
				sorted.add(unsortedSequences.get(i));
			} else {
				int RP = sorted.size();

				for (int j = 0; j < RP; j++) {
					if (unsortedSequences.get(i).length() < sorted.get(j).length()) {
						sorted.add(j, unsortedSequences.get(i));
						j = RP;
					} else if (j == RP - 1) {
						sorted.add(j + 1, unsortedSequences.get(i));
					}
				}
			}
		}
		unsortedSequences = sorted;
		return unsortedSequences;
	}

	public static List<String> sortWords(List<String> words) {
		List<String> sorted = new ArrayList();

		for (int i = 0; i < words.size(); i++) {
			if (sorted.size() == 0) {
				sorted.add(words.get(i));
			} else {
				int RP = sorted.size();

				for (int j = 0; j < RP; j++) {
					if (words.get(i).compareTo(sorted.get(j)) < 0) {
						sorted.add(j, words.get(i));
						j = RP;
					} else if (j == RP - 1) {
						sorted.add(j + 1, words.get(i));
					}
				}
			}
		}
		words = sorted;
		System.out.println(words);
		return words;
	}
}
