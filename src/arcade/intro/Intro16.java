package arcade.intro;

public class Intro16 {

    /*
     * Two arrays are called similar if one can be obtained from another by swapping
     * at most one pair of elements in one of the arrays.
     *
     * Given two arrays a and b, check whether they are similar.
     *
     * Example
     *
     * For a = [1, 2, 3] and b = [1, 2, 3], the output should be areSimilar(a, b) =
     * true.
     *
     * The arrays are equal, no need to swap any elements.
     *
     * For a = [1, 2, 3] and b = [2, 1, 3], the output should be areSimilar(a, b) =
     * true.
     *
     * We can obtain b from a by swapping 2 and 1 in b.
     *
     * For a = [1, 2, 2] and b = [2, 1, 1], the output should be areSimilar(a, b) =
     * false.
     *
     * Any swap of any two elements either in a or in b won't make a and b equal.
     *
     * Input/Output
     *
     * [execution time limit] 3 seconds (java)
     *
     * [input] array.integer a
     *
     * Array of integers.
     *
     * Guaranteed constraints: 3 ≤ a.length ≤ 105, 1 ≤ a[i] ≤ 1000.
     *
     * [input] array.integer b
     *
     * Array of integers of the same length as a.
     *
     * Guaranteed constraints: b.length = a.length, 1 ≤ b[i] ≤ 1000.
     *
     * [output] boolean
     *
     * true if a and b are similar, false otherwise.
     */

    public static void main(String[] args) {

        int[] a = {1, 1, 4, 6, 7};
        int[] b = {1, 1, 6, 4, 7};
        System.out.println("Are the arrays similar? " + (areSimilar(a, b) ? "Yes" : "No"));
    }

    public static boolean areSimilar(int[] a, int[] b) {

        int c = 0, d = 0, e = 0, f = 0, count = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i] && count == 0) {
                c = a[i];
                d = b[i];
                count++;
            } else if (a[i] != b[i] && count == 1) {
                e = a[i];
                f = b[i];
                count++;
            } else if (a[i] != b[i] && count > 1) {
                return false;
            }
        }

        return c == f && d == e;
    }
}
