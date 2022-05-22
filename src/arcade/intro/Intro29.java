package arcade.intro;

import java.util.*;

public class Intro29 {

  /*
   * Given two cells on the standard chess board, determine whether they have the same color or not.
   *
   * Example
   *
   * For cell1 = "A1" and cell2 = "C3", the output should be solution(cell1, cell2) = true.
   *
   * For cell1 = "A1" and cell2 = "H3", the output should be solution(cell1, cell2) = false.
   *
   * Input/Output
   *
   * [execution time limit] 3 seconds (java)
   *
   * [input] string cell1
   *
   * Guaranteed constraints: cell1.length = 2, 'A' ≤ cell1[0] ≤ 'H', 1 ≤ cell1[1] ≤ 8.
   *
   * [input] string cell2
   *
   * Guaranteed constraints: cell2.length = 2, 'A' ≤ cell2[0] ≤ 'H', 1 ≤ cell2[1] ≤ 8.
   *
   * [output] boolean
   *
   * true if both cells have the same color, false otherwise.
   */

  public static void main(String[] args) {

    String cell1 = "A1";
    String cell2 = "B2";

    System.out.println(solution(cell1, cell2));
  }

  private static boolean solution(String cell1, String cell2) {

    Map<Character, Boolean> oddRow = new HashMap<>();
    Map<Character, Boolean> evenRow = new HashMap<>();

    populateBoard(oddRow, true, false);
    populateBoard(evenRow, false, true);

    char columnCell1 = cell1.charAt(0);
    char columnCell2 = cell2.charAt(0);
    int rowCell1 = Integer.parseInt(String.valueOf(cell1.charAt(1)));
    int rowCell2 = Integer.parseInt(String.valueOf(cell2.charAt(1)));

    Set<Boolean> output = new HashSet<>();

    populateOutput(oddRow, evenRow, columnCell1, rowCell1, output);
    populateOutput(oddRow, evenRow, columnCell2, rowCell2, output);

    return output.size() == 1;
  }

  private static void populateBoard(Map<Character, Boolean> oddRow, boolean black, boolean white) {
    oddRow.put('A', black);
    oddRow.put('B', white);
    oddRow.put('C', black);
    oddRow.put('D', white);
    oddRow.put('E', black);
    oddRow.put('F', white);
    oddRow.put('G', black);
    oddRow.put('H', white);
  }

  private static void populateOutput(
      Map<Character, Boolean> oddRow,
      Map<Character, Boolean> evenRow,
      char column,
      int row,
      Set<Boolean> output) {

    if (row % 2 == 0) output.add(evenRow.get(column));
    else output.add(oddRow.get(column));
  }
}
