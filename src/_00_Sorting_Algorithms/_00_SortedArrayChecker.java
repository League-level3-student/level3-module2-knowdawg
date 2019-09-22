package _00_Sorting_Algorithms;

public class _00_SortedArrayChecker {
	//1. Write a static method called intArraySorted. 
	//   This method takes in an array of integers
	//   and it returns a boolean.
	//   The method returns true if the integer
	//   array is in ascending order and false otherwise

	public static boolean intArraySorted(int[] intArrayPassedIn) {
		for (int i = 0; i < intArrayPassedIn.length; i++) {
			System.out.println(i);
			if(intArrayPassedIn[i] < intArrayPassedIn[i + 1]) {
				//good job, sorted so far
				System.out.println("good " + i);
			} else {
				//Bad job, not sorted, returning false
				return false;
			}
		}
		//if the array survived the for loop it must be sorted
		return true;
	}
	
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	//2. Write a static method called doubleArraySorted. 
	//   This method takes in an array of doubles
	//   and it returns a boolean.
	//   The method returns true if the double
	//   array is in ascending order and false otherwise
	
	public static boolean doubleArraySorted(double[] doubleArrayPassedIn) {
		for (int i = 0; i < doubleArrayPassedIn.length; i++) {
			if(doubleArrayPassedIn[i] < doubleArrayPassedIn[i+1]) {
				//good job, sorted so far
			} else {
				//Bad job, not sorted, returning false
				System.out.println("int failed");
				return false;
			}
		}
		//if the array survived the for loop it must be sorted
		System.out.println("int passed");
		return true;
	}
	
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	//3. Write a static method called charArraySorted. 
	//   This method takes in an array of characters
	//   and it returns a boolean.
	//   The method returns true if the character
	//   array is in alphabetical order and false otherwise
	//   (You can compare characters just like integers)
	public static boolean charArraySorted(char[] charArrayPassedIn) {
		for (int i = 0; i < charArrayPassedIn.length; i++) {
			if(charArrayPassedIn[i] < charArrayPassedIn[i+1]) {
				//good job, sorted so far
			} else {
				//Bad job, not sorted, returning false
				return false;
			}
		}
		//if the array survived the for loop it must be sorted
		return true;
	}
	
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	//4. Write a static method called stringArraySorted. 
	//   This method takes in an array of Strings
	//   and it returns a boolean.
	//   The method returns true if the String
	//   array is in alphabetical order and false otherwise
	//   (Use the compareTo(String) method)
	
	public static boolean stringArraySorted(String[] stringArrayPassedIn) {
		for (int i = 0; i < stringArrayPassedIn.length; i++) {
			if(stringArrayPassedIn[i].compareTo(stringArrayPassedIn[i+1]) > 0) {
				//good job, sorted so far

			} else {
				//Bad job, not sorted, returning false
				return false;
			}
		}
		//if the array survived the for loop it must be sorted
		return true;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
