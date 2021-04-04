package challenges;

public class Challenge01 {

	/*
	 * Given integers n and k, find the number of the ways to choose k objects out
	 * of n different ones modulo 109 + 7. Note that the order doesn't matter.
	 * 
	 * Example
	 * 
	 * For n = 5 and k = 2, the output should be countWays(n, k) = 10. Here are all
	 * possible ways to choose 2 objects out of 5 if we number them from 1 to 5:
	 * 
	 * [1, 2], [1, 3], [1, 4], [1, 5], [2, 3], [2, 4], [2, 5], [3, 4], [3, 5], [4,
	 * 5] Input/Output
	 * 
	 * [execution time limit] 3 seconds (java)
	 * 
	 * [input] integer n
	 * 
	 * A non-negative integer.
	 * 
	 * Guaranteed constraints: 5 ≤ n ≤ 105.
	 * 
	 * [input] integer k
	 * 
	 * A non-negative integer.
	 * 
	 * Guaranteed constraints: 2 ≤ k ≤ 105, n · k ≤ 106.
	 * 
	 * [output] integer
	 * 
	 * Number of the ways to choose k objects out of n different objects modulo 109
	 * + 7.
	 */

	public static void main(String[] args) {

		int n = 5;
		int k = 2;
		System.out.println(countWays(n, k));
	}

	public static int countWays(int n, int k) {

		var r = new int[k + 1];

		for (r[0] = 1; n-- > 0;) {
			for (int j = k; j > 0; r[j + 1] %= 1e9 + 7) {
				r[j] += r[--j];
			}
		}
		return r[k];
	}
}
