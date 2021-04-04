package arcade.intro;

public class Intro03 {

	/*
	 * Given the string, check if it is a palindrome.
	 *
	 * Example
	 *
	 * For inputString = "aabaa", the output should be checkPalindrome(inputString)
	 * = true; For inputString = "abac", the output should be
	 * checkPalindrome(inputString) = false; For inputString = "a", the output
	 * should be checkPalindrome(inputString) = true. Input/Output
	 *
	 * [execution time limit] 3 seconds (java)
	 *
	 * [input] string inputString
	 *
	 * A non-empty string consisting of lowercase characters.
	 *
	 * Guaranteed constraints: 1 ≤ inputString.length ≤ 105.
	 *
	 * [output] boolean
	 *
	 * true if inputString is a palindrome, false otherwise.
	 */

	public static void main(String[] args) {

		System.out.println("Is palindrome? " + checkPalindrome("aabaa"));

	}

	public static boolean checkPalindrome(String inputString) {

		String reverse = new StringBuffer(inputString).reverse().toString();
		return inputString.equals(reverse);

	}
}
