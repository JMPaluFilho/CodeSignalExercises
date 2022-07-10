package arcade.intro;

import java.util.Map;
import java.util.Optional;
import java.util.SortedMap;
import java.util.TreeMap;

public class Intro30 {

  /*
   * Consider integer numbers from 0 to n - 1 written down along the circle in such a way that the
   * distance between any two neighboring numbers is equal (note that 0 and n - 1 are neighboring,
   * too).
   *
   * Given n and firstNumber, find the number which is written in the radially opposite position
   * to firstNumber.
   *
   * Example
   *
   * For n = 10 and firstNumber = 2, the output should be solution(n, firstNumber) = 7.
   *
   * Input/Output
   *
   * [execution time limit] 3 seconds (java)
   *
   * [input] integer n
   *
   * A positive even integer.
   *
   * Guaranteed constraints: 4 ≤ n ≤ 20.
   *
   * [input] integer firstNumber
   *
   * Guaranteed constraints: 0 ≤ firstNumber ≤ n - 1.
   *
   * [output] integer
   */

  public static void main(String[] args) {

    int n = 10;
    int firstNumber = 7;
    System.out.println(solution(n, firstNumber));
  }

  public static int solution(int n, int firstNumber) {

    int fullCircleDegrees = 360;
    int halfCircleDegrees = fullCircleDegrees / 2;
    int distanceBetweenNodes = fullCircleDegrees / n;
    SortedMap<Integer, Integer> nodesDegree = new TreeMap<>();
    nodesDegree.put(0, 0);

    int auxDistance = distanceBetweenNodes;
    for (int i = 1; i < n; i++) {
      nodesDegree.put(i, auxDistance);
      auxDistance = auxDistance + distanceBetweenNodes;
    }

    int firstNumberDegree = nodesDegree.get(firstNumber);
    int oppositeNumberDegree =
        firstNumberDegree + halfCircleDegrees > fullCircleDegrees
            ? firstNumberDegree + halfCircleDegrees - fullCircleDegrees
            : firstNumberDegree + halfCircleDegrees;

    Optional<Integer> optionalOppositeNumber =
        nodesDegree.entrySet().stream()
            .filter(e -> e.getValue().equals(oppositeNumberDegree))
            .map(Map.Entry::getKey)
            .findFirst();

    return optionalOppositeNumber.orElse(0);

    /*
     * Could be resolved like this:
     * return (firstNumber + n / 2) % n;
     */
  }
}
