package arcade.intro;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Intro26 {

  /*
   * Check if all digits of the given integer are even.
   *
   * Example
   *
   * For n = 248622, the output should be
   * solution(n) = true;
   * For n = 642386, the output should be
   * solution(n) = false.
   * Input/Output
   *
   * [execution time limit] 3 seconds (java)
   *
   * [input] integer n
   *
   * Guaranteed constraints:
   * 1 ≤ n ≤ 109.
   *
   * [output] boolean
   *
   * true if all digits of n are even, false otherwise.
   */

  public static void main(String[] args) {

    int n = 248622;
    System.out.println(solution(n));
  }

  private static boolean solution(int n) {

    LinkedList<Integer> stack = new LinkedList<>();

    while (n > 0) {
      stack.push(n % 10);
      n = n / 10;
    }

    List<Integer> notEvenList = stack.stream().filter(e -> e % 2 != 0).collect(Collectors.toList());

    return notEvenList.size() == 0;
  }
}
