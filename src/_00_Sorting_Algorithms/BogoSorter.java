package _00_Sorting_Algorithms;

import java.util.Random;

public class BogoSorter extends Sorter {
	public BogoSorter() {
		type = "Bogo";
	}
	
	// Bogo sort is a joke sorting algorithm. It is considered the most 
	// inefficient sorting algorithm while still maintaining the possibility
	// of eventually sorting data.
	
	// It works by following these steps:
	// STEP 1. Is the array in order?
	//	if yes, finished; if no, go to step 2.
	// STEP 2. Take two random elements in the array and swap them.
	// STEP 3. Go back to step 1.
	
	//1. Complete the sort method using the Bogo sort algorithm. 
	@Override
	void sort(int[] array, SortingVisualizer display) {
		boolean sorted = false;
		if(sorted == false) {
			for (int i = 0; i < array.length - 1; i++) {
				sorted = true;
				if(array[i] != array[i+1]) {
					Random lineRand = new Random();
					//System.out.println(array.length + ": array length");
					int randomLine = lineRand.nextInt(array.length);
					//System.out.println(randomLine + ": array index");
					//System.out.println(array[i] + ": array i");
					int lineValue = array[randomLine];
					//System.out.println(lineValue + ": this is lineValue. it is the value of line index");
					array[randomLine] = array[i];
					//System.out.println(array[randomLine] + ": this should be equal to array i");
					array[i] = lineValue;
					//System.out.println(array[i] + ": this should be equal to lineValue");
					
					display.updateDisplay();
					
					sorted = false;
				}
			}
			sort(array, display);
			
		} else {
			System.out.println("YAY, ITS SORTED");
		}
	}
}
