package arcade.intro;

public class Intro20 {

    /*
     * Given an array of integers, find the maximal absolute difference between any
     * two of its adjacent elements.
     *
     * Example
     *
     * For inputArray = [2, 4, 1, 0], the output should be
     * arrayMaximalAdjacentDifference(inputArray) = 3.
     *
     * Input/Output
     *
     * [execution time limit] 3 seconds (java)
     *
     * [input] array.integer inputArray
     *
     * Guaranteed constraints: 3 ≤ inputArray.length ≤ 10, -15 ≤ inputArray[i] ≤ 15.
     *
     * [output] integer
     *
     * The maximal absolute difference.
     */

    public static void main(String[] args) {
        int[] inputArray = {2, 4, 1, 0};
        System.out.println("The maximal absolute difference is: " + arrayMaximalAdjacentDifference(inputArray));
    }

    public static int arrayMaximalAdjacentDifference(int[] inputArray) {
        int maximumDifference = Math.abs(inputArray[0] - inputArray[1]);

        for (int i = 1; i < inputArray.length; i++) {
            if (maximumDifference < Math.abs(inputArray[i] - inputArray[i - 1])) {
                maximumDifference = Math.abs(inputArray[i] - inputArray[i - 1]);
            }
        }

        return maximumDifference;
    }
}
