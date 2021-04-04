package arcade.intro;

import java.util.Arrays;

public class Intro09 {

    /*
     * Given an array of strings, return another array containing all of its longest
     * strings.
     *
     * Example
     *
     * For inputArray = ["aba", "aa", "ad", "vcd", "aba"], the output should be
     * allLongestStrings(inputArray) = ["aba", "vcd", "aba"].
     *
     * Input/Output
     *
     * [execution time limit] 3 seconds (java)
     *
     * [input] array.string inputArray
     *
     * A non-empty array.
     *
     * Guaranteed constraints: 1 ≤ inputArray.length ≤ 10, 1 ≤ inputArray[i].length
     * ≤ 10.
     *
     * [output] array.string
     *
     * Array of the longest strings, stored in the same order as in the inputArray.
     */

    public static void main(String[] args) {

        String[] inputArray = {"aba", "aa", "ad", "vcd", "aba"};
        System.out.println("The longest strings are: " + Arrays.toString(allLongestStrings(inputArray)));

    }

    public static String[] allLongestStrings(String[] inputArray) {

        StringBuilder l = new StringBuilder();

        for (String s : inputArray) {
            if (l.indexOf("-") == s.length()) {
                l.append(s).append("-");
            } else if (l.indexOf("-") < s.length()) {
                l = new StringBuilder(s + "-");
            }
        }

        return l.toString().split("-");
    }
}
