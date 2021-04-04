package arcade.theCore;

public class TheCore01 {

	public static void main(String[] args) {

		System.out.println(addTwoDigits(29));
	}

	public static int addTwoDigits(int n) {

//		int first = n % 10;
//		n /= 10;
//		int second = n % 10;
//		int sum = first + second;
//		return sum;

		return n / 10 + n % 10;

	}
}
