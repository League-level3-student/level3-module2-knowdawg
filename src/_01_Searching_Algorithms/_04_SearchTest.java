package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Array;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD
	
	@Test
	public void testLinearSearch() {
		//1. use the assertEquals method to test your linear search method.
		_00_LinearSearch test = new _00_LinearSearch();
		String lTest[] = {"hi","my", "name", "is", "bob"};
		assertEquals(0, test.linearSearch(lTest, "hi"));
	}

	@Test
	public void testBinarySearch() {
		//2. use the assertEquals method to test your binary search method.
		//   remember that the array must be sorted
		_01_BinarySearch test = new _01_BinarySearch();
		int aTest[] = {1,2,3,4,5};
		assertEquals(3, test.binarySearch(aTest, 1, 5, 4));
	}
	
	@Test
	public void testInterpolationSearch() {
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
		_02_InterpolationSearch test = new _02_InterpolationSearch();
		int aTest[] = {1,2,3,4,5};
		assertEquals(4, test.interpolationSearch(aTest, 5));
	}
	
	@Test
	public void testExponentialSearch() {
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
		_03_ExponentialSearch test = new _03_ExponentialSearch();
		int aTest[] = {1,2,3,4,5};
		assertEquals(1, test.exponentialSearch(aTest, 2));
	}
}
