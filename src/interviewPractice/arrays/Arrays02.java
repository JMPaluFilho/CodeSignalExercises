package interviewPractice.arrays;

import java.util.*;
import java.util.stream.Collectors;

public class Arrays02 {

    /*
     * Given a string s consisting of small English letters, find and return the first instance of a non-repeating
     * character in it. If there is no such character, return '_'.
     * 
     * Example
     * 
     * For s = "abacabad", the output should be
     * solution(s) = 'c'.
     * 
     * There are 2 non-repeating characters in the string: 'c' and 'd'. Return c since it appears in the string first.
     * 
     * For s = "abacabaabacaba", the output should be
     * solution(s) = '_'.
     * 
     * There are no characters in this string that do not repeat.
     * 
     * Input/Output
     * 
     * [execution time limit] 3 seconds (java)
     * 
     * [input] string s
     * 
     * A string that contains only lowercase English letters.
     * 
     * Guaranteed constraints:
     * 1 ≤ s.length ≤ 105.
     * 
     * [output] char
     * 
     * The first non-repeating character in s, or '_' if there are no characters that do not repeat.
     */

    public static void main(String[] args) {
        String s = "ngrhhqbhnsipkcoqjyviikvxbxyphsnjpdxkhtadltsuxbfbrkof";
        System.out.println(solution(s));
    }

    static char solution(String s) {
        char[] chars = s.toCharArray();
        Map<Character, Integer> uniqueChars = new LinkedHashMap<>();

        for (char c : chars) {
            if (!uniqueChars.containsKey(c)) {
                uniqueChars.put(c, 1);
            } else {
                uniqueChars.put(c, uniqueChars.get(c) + 1);
            }
        }

        uniqueChars.values().removeIf(v -> v > 1);

        if (uniqueChars.size() > 0) {
            return uniqueChars
                    .keySet()
                    .stream()
                    .limit(1)
                    .collect(Collectors.toList())
                    .get(0);
        } else {
            return '_';
        }


        /* Resolução Sem Map
        char[] c = s.toCharArray();

        for (int i = 0; i < s.length(); i++) {
            if (s.indexOf(c[i]) == s.lastIndexOf(c[i]))
                return c[i];
        }

        return '_';
        */
    }

}
