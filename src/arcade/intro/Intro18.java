package arcade.intro;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
        Set<Character> chars = new HashSet<>();

        for (int i = 0; i < inputString.length(); ++i) {
            char c = inputString.charAt(i);
            if (chars.contains(c)) {
                chars.remove(c);
            } else {
                chars.add(c);
            }
        }
        return chars.size() <= 1;
    }
}
