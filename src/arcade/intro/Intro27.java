package arcade.intro;

public class Intro27 {

  /*
   * Correct variable names consist only of English letters, digits and underscores and they can't
   * start with a digit.
   *
   * Check if the given string is a correct variable name.
   *
   * Example
   *
   * For name = "var_1__Int", the output should be solution(name) = true; For name = "qq-q", the
   * output should be solution(name) = false; For name = "2w2", the output should be solution(name)
   * = false. Input/Output
   *
   * [execution time limit] 3 seconds (java)
   *
   * [input] string name
   *
   * Guaranteed constraints: 1 ≤ name.length ≤ 10.
   *
   * [output] boolean
   *
   * true if name is a correct variable name, false otherwise.
   */

  public static void main(String[] args) {

    String nameOne = "var_1__Int";
    String nameTwo = "qq-q";
    String nameThree = "2w2";

    System.out.println(solution(nameOne));
    System.out.println(solution(nameTwo));
    System.out.println(solution(nameThree));
  }

  private static boolean solution(String name) {

    String regex = "\\w+";
    char firstChar = name.charAt(0);

    return name.matches(regex) && !Character.isDigit(firstChar);
  }
}
