package arcade.intro;

import java.util.ArrayList;

public class Intro18 {

    /*
     * Given a string, find out if its characters can be rearranged to form a
     * palindrome.
     *
     * Example
     *
     * For inputString = "aabb", the output should be
     * palindromeRearranging(inputString) = true.
     *
     * We can rearrange "aabb" to make "abba", which is a palindrome.
     *
     * Input/Output
     *
     * [execution time limit] 3 seconds (java)
     *
     * [input] string inputString
     *
     * A string consisting of lowercase English letters.
     *
     * Guaranteed constraints: 1 ≤ inputString.length ≤ 50.
     *
     * [output] boolean
     *
     * true if the characters of the inputString can be rearranged to form a
     * palindrome, false otherwise.
     */

    public static void main(String[] args) {

        String s = "aabbbc";
        System.out.println("These '" + s + "' characters can be rearranged to form a palindrome? "
                + (palindromeRearranging(s) ? "Yes" : "No"));
    }

    public static boolean palindromeRearranging(String inputString) {

        int[] t = new int[inputString.length()];
        int c = 0, c2 = 0;
        ArrayList<Character> list = new ArrayList<>();

        for (int i = 0; i < inputString.length(); i++) {
            list.add(inputString.toCharArray()[i]);

            if (list.contains(inputString.toCharArray()[i])) {
                t[inputString.indexOf(inputString.toCharArray()[i])]++;
            }
        }

        for (int j : t) {

            if (j % 2 == 1) {
                c++;
            } else if (j % 2 == 0 && j != 0) {
                c2++;
            }
        }

        return c <= 1 || c <= c2;
    }
}
