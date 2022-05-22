package arcade.intro;

import java.util.Arrays;

public class Intro25 {

    /*
     * Given an array of integers, replace all the occurrences of elemToReplace with substitutionElem.
     *
     * Example
     *
     * For inputArray = [1, 2, 1], © = 1, and substitutionElem = 3, the output should be
     * solution(inputArray, elemToReplace, substitutionElem) = [3, 2, 3].
     *
     * Input/Output
     *
     * [execution time limit] 3 seconds (java)
     *
     * [input] array.integer inputArray
     *
     * Guaranteed constraints:
     * 0 ≤ inputArray.length ≤ 104,
     * 0 ≤ inputArray[i] ≤ 109.
     *
     * [input] integer elemToReplace
     *
     * Guaranteed constraints:
     * 0 ≤ elemToReplace ≤ 109.
     *
     * [input] integer substitutionElem
     *
     * Guaranteed constraints:
     * 0 ≤ substitutionElem ≤ 109.
     *
     * [output] array.integer
     */

    public static void main(String[] args) {

        int[] inputArray = new int[]{1, 2, 1};
        int elemToReplace = 1;
        int substitutionElem = 3;

        int[] outputArray = solution(inputArray, elemToReplace, substitutionElem);
        for (int element : outputArray) {
            System.out.println(element);
        }
    }

    private static int[] solution(int[] inputArray, int elemToReplace, int substitutionElem) {

        return Arrays.stream(inputArray)
                .map(e -> e == elemToReplace ? substitutionElem : e)
                .toArray();
    }
}
