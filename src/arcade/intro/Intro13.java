package arcade.intro;

public class Intro13 {

	/*
	 * Write a function that reverses characters in (possibly nested) parentheses in
	 * the input string.
	 * 
	 * Input strings will always be well-formed with matching ()s.
	 * 
	 * Example
	 * 
	 * For inputString = "(bar)", the output should be
	 * reverseInParentheses(inputString) = "rab";
	 * For inputString = "foo(bar)baz",
	 * the output should be reverseInParentheses(inputString) = "foorabbaz";
	 * For inputString = "foo(bar)baz(blim)", the output should be
	 * reverseInParentheses(inputString) = "foorabbazmilb";
	 * For inputString = "foo(bar(baz))blim", the output should be reverseInParentheses(inputString) =
	 * "foobazrabblim". Because "foo(bar(baz))blim" becomes "foo(barzab)blim" and
	 * then "foobazrabblim". Input/Output
	 * 
	 * [execution time limit] 3 seconds (java)
	 * 
	 * [input] string inputString
	 * 
	 * A string consisting of lowercase English letters and the characters ( and ).
	 * It is guaranteed that all parentheses in inputString form a regular bracket
	 * sequence.
	 * 
	 * Guaranteed constraints: 0 ≤ inputString.length ≤ 50.
	 * 
	 * [output] string
	 * 
	 * Return inputString, with all the characters that were in parentheses
	 * reversed.
	 */

	public static void main(String[] args) {

		String inputString = "foo(bar(baz))blim";
		System.out.println("The reversed String is: " + reverseInParentheses(inputString));
	}

	public static String reverseInParentheses(String inputString) {

		StringBuilder reversed = new StringBuilder(inputString);
		int start, end;

		while (reversed.indexOf("(") != -1) {
			start = reversed.lastIndexOf("(");
			end = reversed.indexOf(")", start);
			reversed.replace(start, end + 1, new StringBuilder(reversed.substring(start + 1, end)).reverse().toString());
		}

		return reversed.toString();
	}
}
