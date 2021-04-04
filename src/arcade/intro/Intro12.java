package arcade.intro;

import java.util.Arrays;

public class Intro12 {

    /*
     * Some people are standing in a row in a park. There are trees between them
     * which cannot be moved. Your task is to rearrange the people by their heights
     * in a non-descending order without moving the trees. People can be very tall!
     *
     * Example
     *
     * For a = [-1, 150, 190, 170, -1, -1, 160, 180], the output should be
     * sortByHeight(a) = [-1, 150, 160, 170, -1, -1, 180, 190].
     *
     * Input/Output
     *
     * [execution time limit] 3 seconds (java)
     *
     * [input] array.integer a
     *
     * If a[i] = -1, then the ith position is occupied by a tree. Otherwise a[i] is
     * the height of a person standing in the ith position.
     *
     * Guaranteed constraints: 1 ≤ a.length ≤ 1000, -1 ≤ a[i] ≤ 1000.
     *
     * [output] array.integer
     *
     * Sorted array a with all the trees untouched.
     */

    public static void main(String[] args) {

        int[] a = {-1, 150, 140, 180, -1, -1, -1, 100};
        System.out.println("The rearranged order are: " + Arrays.toString(sortByHeight(a)));

    }

    public static int[] sortByHeight(int[] a) {

        int aux;

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j] && a[i] != -1 && a[j] != -1) {
                    aux = a[i];
                    a[i] = a[j];
                    a[j] = aux;
                }
            }
        }
        return a;
    }
}
