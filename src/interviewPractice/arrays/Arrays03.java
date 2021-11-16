package interviewPractice.arrays;

import java.util.Arrays;

public class Arrays03 {

    /*
     * Note: Try to solve this task in-place (with O(1) additional memory), since this is what you'll be asked to do
     * during an interview.
     *
     * You are given an n x n 2D matrix that represents an image. Rotate the image by 90 degrees (clockwise).
     *
     * Example
     *
     * For
     *
     * a = [[1, 2, 3],
     *      [4, 5, 6],
     *      [7, 8, 9]]
     * the output should be
     *
     * solution(a) =
     *     [[7, 4, 1],
     *      [8, 5, 2],
     *      [9, 6, 3]]
     * Input/Output
     *
     * [execution time limit] 3 seconds (java)
     *
     * [input] array.array.integer a
     *
     * Guaranteed constraints:
     * 1 ≤ a.length ≤ 100,
     * a[i].length = a.length,
     * 1 ≤ a[i][j] ≤ 104.
     *
     * [output] array.array.integer
     */

    public static void main(String[] args) {
        int[][] a = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};

        System.out.println(Arrays.deepToString(solution(a)));
    }

    static int[][] solution(int[][] a) {
        for (int i = 0; i < a.length / 2; i++) {
            for (int j = i; j < a.length - i - 1; j++) {
                int top = a[i][j];
                int left = a[a.length - j - 1][i];
                int bot = a[a.length - i - 1][a.length - j - 1];
                int right = a[j][a.length - i - 1];

                a[i][j] = left;
                a[a.length - j - 1][i] = bot;
                a[a.length - i - 1][a.length - j - 1] = right;
                a[j][a.length - i - 1] = top;
            }
        }

        return a;
    }
}
