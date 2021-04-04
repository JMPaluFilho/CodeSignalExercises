package arcade.intro;

public class Intro11 {

	/*
	 * Ticket numbers usually consist of an even number of digits. A ticket number
	 * is considered lucky if the sum of the first half of the digits is equal to
	 * the sum of the second half.
	 * 
	 * Given a ticket number n, determine if it's lucky or not.
	 * 
	 * Example
	 * 
	 * For n = 1230, the output should be isLucky(n) = true; For n = 239017, the
	 * output should be isLucky(n) = false. Input/Output
	 * 
	 * [execution time limit] 3 seconds (java)
	 * 
	 * [input] integer n
	 * 
	 * A ticket number represented as a positive integer with an even number of
	 * digits.
	 * 
	 * Guaranteed constraints: 10 ≤ n < 106.
	 * 
	 * [output] boolean
	 * 
	 * true if n is a lucky ticket number, false otherwise.
	 */

	public static void main(String[] args) {

		int ticket = 1230;
		System.out.println("Is the ticket lucky? " + (isLucky(ticket) ? "Yes": "No"));

	}

	public static boolean isLucky(int n) {

		String aux = n + "";
		int sum = 0;

		for (int i = 0; i < aux.length() / 2; i++) {
			sum += (aux.charAt(i) - aux.charAt(aux.length() - 1 - i));
		}

		return sum == 0;
	}
}
