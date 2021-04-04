package arcade.intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Intro15 {

    /*
     * Given a rectangular matrix of characters, add a border of asterisks(*) to it.
     *
     * Example
     *
     * For
     *
     * picture = ["abc", "ded"] the output should be
     *
     * addBorder(picture) = ["*****", "*abc*", "*ded*", "*****"] Input/Output
     *
     * [execution time limit] 3 seconds (java)
     *
     * [input] array.string picture
     *
     * A non-empty array of non-empty equal-length strings.
     *
     * Guaranteed constraints: 1 ≤ picture.length ≤ 100, 1 ≤ picture[i].length ≤
     * 100.
     *
     * [output] array.string
     *
     * The same matrix of characters, framed with a border of asterisks of width 1.
     */

    public static void main(String[] args) {

        String[] picture = {"abc", "ded"};
        System.out.println("Without border: " + Arrays.toString(picture));
        System.out.println("With border: " + Arrays.toString(addBorder(picture)));
    }

    public static String[] addBorder(String[] picture) {

        StringBuilder border = new StringBuilder();
        List<String> lstNewPicture = new ArrayList<>();

        border.append("*".repeat(Math.max(0, picture[0].length() + 2)));
        lstNewPicture.add(border.toString());

        for (String s : picture) {
            StringBuilder stringBuilder = new StringBuilder(s);
            stringBuilder.insert(0, '*');
            stringBuilder.insert(stringBuilder.length(), '*');
            lstNewPicture.add(stringBuilder.toString());
        }

        lstNewPicture.add(border.toString());

        return lstNewPicture.toArray(new String[0]);
    }
}
