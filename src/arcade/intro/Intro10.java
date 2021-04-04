package arcade.intro;

public class Intro10 {

	/*
	 * Given two strings, find the number of common characters between them.
	 * 
	 * Example
	 * 
	 * For s1 = "aabcc" and s2 = "adcaa", the output should be
	 * commonCharacterCount(s1, s2) = 3.
	 * 
	 * Strings have 3 common characters - 2 "a"s and 1 "c".
	 * 
	 * Input/Output
	 * 
	 * [execution time limit] 3 seconds (java)
	 * 
	 * [input] string s1
	 * 
	 * A string consisting of lowercase English letters.
	 * 
	 * Guaranteed constraints: 1 ≤ s1.length < 15.
	 * 
	 * [input] string s2
	 * 
	 * A string consisting of lowercase English letters.
	 * 
	 * Guaranteed constraints: 1 ≤ s2.length < 15.
	 * 
	 * [output] integer
	 */

	public static void main(String[] args) {

		String a = "aabcc";
		String b = "adcaa";
		System.out.println("The number of common characters between them are : " + commonCharacterCount(a, b));
	}

	public static int commonCharacterCount(String s1, String s2) {

		int count = 0;

		for (int i = 0; i < s1.length(); i++) {
			if (s2.contains(String.valueOf(s1.charAt(i)))) {
				count++;
				s2 = s2.replaceFirst(String.valueOf(s1.charAt(i)), "");
			}
		}
		return count;
	}
}
