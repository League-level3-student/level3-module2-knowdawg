package _00_Sorting_Algorithms;

public class BubbleSorter extends Sorter{
	public BubbleSorter() {
		type = "Bubble";
	}
	
	//1. Use the bubble sorting algorithm to sort the array.
	//   You can use display.updateDisplay() to show the current
	//   progress on the graph.
	@Override
	void sort(int[] array, SortingVisualizer display) {
		
		boolean sorted = false;
		while (sorted == false) {
			sorted = true;
			for (int i = 0; i < array.length; i++) {
				if (i + 1 <array.length) {
					if (array[i] > array[i+1]){
						int firstSwapInt = array[i];
						int secoundSwapInt = array[i + 1];
						array[i] = secoundSwapInt;
						array[i + 1] = firstSwapInt;
						sorted = false;
				}
				}
			}
			display.updateDisplay();
		}
		
	}
	
}
