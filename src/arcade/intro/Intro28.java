package arcade.intro;

import java.util.stream.IntStream;

public class Intro28 {

  /*
   * Given a string, your task is to replace each of its characters by the next one in the English
   * alphabet; i.e. replace a with b, replace b with c, etc (z would be replaced by a).
   *
   * Example
   *
   * For inputString = "crazy", the output should be solution(inputString) = "dsbaz".
   *
   * Input/Output
   *
   * [execution time limit] 3 seconds (java)
   *
   * [input] string inputString
   *
   * A non-empty string consisting of lowercase English characters.
   *
   * Guaranteed constraints: 1 ≤ inputString.length ≤ 1000.
   *
   * [output] string
   *
   * The resulting string after replacing each of its characters.
   */

  public static void main(String[] args) {

    String inputString = "crazy";
    System.out.println(solution(inputString));
  }

  private static String solution(String inputString) {

    char[] inputCharacters = inputString.toCharArray();
    StringBuilder outputString = new StringBuilder();

    for (char character : inputCharacters) {
      if (character == 'z') outputString.append('a');
      else outputString.append((char) (character + 1));
    }

    return outputString.toString();
  }
}
