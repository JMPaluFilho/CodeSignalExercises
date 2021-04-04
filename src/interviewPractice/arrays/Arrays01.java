package interviewPractice.arrays;

import java.util.HashSet;
import java.util.Set;

public class Arrays01 {

	/*
	 * Given an array a that contains only numbers in the range from 1 to a.length,
	 * find the first duplicate number for which the second occurrence has the
	 * minimal index. In other words, if there are more than 1 duplicated numbers,
	 * return the number for which the second occurrence has a smaller index than
	 * the second occurrence of the other number does. If there are no such
	 * elements, return -1.
	 * 
	 * Example
	 * 
	 * For a = [2, 1, 3, 5, 3, 2], the output should be firstDuplicate(a) = 3.
	 * 
	 * There are 2 duplicates: numbers 2 and 3. The second occurrence of 3 has a
	 * smaller index than the second occurrence of 2 does, so the answer is 3.
	 * 
	 * For a = [2, 2], the output should be firstDuplicate(a) = 2;
	 * 
	 * For a = [2, 4, 3, 5, 1], the output should be firstDuplicate(a) = -1.
	 * 
	 * Input/Output
	 * 
	 * [execution time limit] 3 seconds (java)
	 * 
	 * [input] array.integer a
	 * 
	 * Guaranteed constraints: 1 ≤ a.length ≤ 105, 1 ≤ a[i] ≤ a.length.
	 * 
	 * [output] integer
	 * 
	 * The element in a that occurs in the array more than once and has the minimal
	 * index for its second occurrence. If there are no such elements, return -1.
	 */

	public static void main(String[] args) {

		int[] a = { 2, 1, 3, 5, 3, 2 };
		System.out.println(firstDuplicate(a));
	}

	public static int firstDuplicate(int[] a) {

		Set<Integer> result = new HashSet<>();
		for (int i : a)
			if (!result.add(i))
				return i;
		return -1;

//		int minimalIndex = -1;
//
//		for (int i = 0; i < a.length; i++) {
//
//			for (int j = i + 1; j < a.length; j++) {
//
//				if (a[i] == a[j] && minimalIndex == -1) {
//					minimalIndex = j;
//				} else if (a[i] == a[j] && j < minimalIndex) {
//					minimalIndex = j;
//				}
//			}
//		}
//		
//		if (minimalIndex == -1) {
//			return -1;
//		} else {
//			return a[minimalIndex];	
//		}
	}
}
