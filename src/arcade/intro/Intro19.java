package arcade.intro;

public class Intro19 {

	/*
	 * Call two arms equally strong if the heaviest weights they each are able to
	 * lift are equal.
	 * 
	 * Call two people equally strong if their strongest arms are equally strong
	 * (the strongest arm can be both the right and the left), and so are their
	 * weakest arms.
	 * 
	 * Given your and your friend's arms' lifting capabilities find out if you two
	 * are equally strong.
	 * 
	 * Example
	 * 
	 * For yourLeft = 10, yourRight = 15, friendsLeft = 15, and friendsRight = 10,
	 * the output should be areEquallyStrong(yourLeft, yourRight, friendsLeft,
	 * friendsRight) = true; For yourLeft = 15, yourRight = 10, friendsLeft = 15,
	 * and friendsRight = 10, the output should be areEquallyStrong(yourLeft,
	 * yourRight, friendsLeft, friendsRight) = true; For yourLeft = 15, yourRight =
	 * 10, friendsLeft = 15, and friendsRight = 9, the output should be
	 * areEquallyStrong(yourLeft, yourRight, friendsLeft, friendsRight) = false.
	 * Input/Output
	 * 
	 * [execution time limit] 3 seconds (java)
	 * 
	 * [input] integer yourLeft
	 * 
	 * A non-negative integer representing the heaviest weight you can lift with
	 * your left arm.
	 * 
	 * Guaranteed constraints: 0 ≤ yourLeft ≤ 20.
	 * 
	 * [input] integer yourRight
	 * 
	 * A non-negative integer representing the heaviest weight you can lift with
	 * your right arm.
	 * 
	 * Guaranteed constraints: 0 ≤ yourRight ≤ 20.
	 * 
	 * [input] integer friendsLeft
	 * 
	 * A non-negative integer representing the heaviest weight your friend can lift
	 * with his or her left arm.
	 * 
	 * Guaranteed constraints: 0 ≤ friendsLeft ≤ 20.
	 * 
	 * [input] integer friendsRight
	 * 
	 * A non-negative integer representing the heaviest weight your friend can lift
	 * with his or her right arm.
	 * 
	 * Guaranteed constraints: 0 ≤ friendsRight ≤ 20.
	 * 
	 * [output] boolean
	 * 
	 * true if you and your friend are equally strong, false otherwise.
	 */

	public static void main(String[] args) {
		int yourLeft = 10;
		int yourRight = 15;
		int friendsLeft = 5;
		int friendsRight = 20;
		System.out.println("Are equally strong? " +
				(areEquallyStrong(yourLeft, yourRight, friendsLeft, friendsRight)? "Yes" : "No"));
	}

	public static boolean areEquallyStrong(int yourLeft, int yourRight, int friendsLeft, int friendsRight) {
		int you = yourLeft - yourRight;
		int friend = friendsLeft - friendsRight;

		if (Math.abs(you) == Math.abs(friend)) {
			if (you >= 0 && friend >= 0 && yourLeft == friendsLeft) {
				return true;
			} else if (you <= 0 && friend <= 0 && yourRight == friendsRight) {
				return true;
			} else if (you >= 0 && friend <= 0 && yourLeft == friendsRight) {
				return true;
			} else return you <= 0 && friend >= 0 && yourRight == friendsLeft;
		}
		return false;
	}
}
